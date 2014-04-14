package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.saferobots.ssml.metamodel.ssml.Connector;

public class ConnectorUpdateFeature extends AbstractUpdateFeature {

	public ConnectorUpdateFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
        Object bo =
                getBusinessObjectForPictogramElement(context.getPictogramElement());
            return (bo instanceof Connector);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		 // retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement  instanceof Connection) {
        	Connection cs = (Connection) pictogramElement;
            for (Shape shape : cs.getConnectionDecorators()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    pictogramName = text.getValue();
                }
            }
        }
 
        // retrieve name from business model
        String businessName = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Connector) {
        	Connector eClass = (Connector) bo;
            businessName = eClass.getName();
        }
 
        // update needed, if names are different
        boolean updateNameNeeded =
            ((pictogramName == null && businessName != null) || 
                (pictogramName != null && !pictogramName.equals(businessName)));
        if (updateNameNeeded) {
            return Reason.createTrueReason("Name is out of date");
        } else {
            return Reason.createFalseReason();
        }
	}

	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
        String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Connector) {
        	Connector eClass = (Connector) bo;
            businessName = eClass.getName();
        }
 
        // Set name in pictogram model
        if (pictogramElement instanceof Connection) {
        	Connection cs = (Connection) pictogramElement;
            for (Shape shape : cs.getConnectionDecorators()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    text.setValue(businessName);
                    return true;
                }
            }
        }
 
        return false;
	}

}
