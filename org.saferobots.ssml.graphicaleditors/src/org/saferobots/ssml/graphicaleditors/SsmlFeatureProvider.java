package org.saferobots.ssml.graphicaleditors;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.saferobots.ssml.graphicaleditors.features.GateAddFeature;
import org.saferobots.ssml.graphicaleditors.features.GateCreateFeature;
import org.saferobots.ssml.graphicaleditors.features.GateLayoutFeature;
import org.saferobots.ssml.graphicaleditors.features.PortAddFeature;
import org.saferobots.ssml.graphicaleditors.features.SystemAddFeature;
import org.saferobots.ssml.graphicaleditors.features.SystemCreateFeature;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.System;

public class SsmlFeatureProvider extends DefaultFeatureProvider {

	public SsmlFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if( context.getNewObject() instanceof Dispatch_Gate) {
			return new GateAddFeature(this);
		}
		else if (context.getNewObject() instanceof System)
		{
			return new SystemAddFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		// TODO Auto-generated method stub
		return new ICreateFeature[] {new SystemCreateFeature(this, "System", "Creates System"),
				new GateCreateFeature(this,"Splitter","Creates Splitter Gate"),
				new GateCreateFeature(this,"Merger","Creates Merger Gate"),
				new GateCreateFeature(this,"Selector","Creates Selector Gate"),
				new GateCreateFeature(this,"Synchronizer","Creates Synchronizer Gate"),
				new GateCreateFeature(this,"Delay","Creates Delay Gate"),
				new GateCreateFeature(this,"User_Defined","Creates User_Defined Gate")};

	}
	
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] 
		          {
					new PortAddFeature(this)
		          };
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		 PictogramElement pictogramElement = context.getPictogramElement();
		    Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		    if (bo instanceof Dispatch_Gate) {
		        return new GateLayoutFeature(this);
		    }
		    return super.getLayoutFeature(context);
	}

}
