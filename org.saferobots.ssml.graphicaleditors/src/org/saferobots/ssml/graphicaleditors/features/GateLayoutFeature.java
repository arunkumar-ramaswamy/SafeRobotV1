package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;

public class GateLayoutFeature extends AbstractLayoutFeature {

	public GateLayoutFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if(!(pe instanceof ContainerShape))
			return false;
		Object bo = getBusinessObjectForPictogramElement(pe);
		if(bo instanceof Dispatch_Gate)
			return true;
		else
			return false;
	}

	@Override
	public boolean layout(ILayoutContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
