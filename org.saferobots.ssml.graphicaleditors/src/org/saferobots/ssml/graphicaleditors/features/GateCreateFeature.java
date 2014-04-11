package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.saferobots.ssml.graphicaleditors.utilities.Utilities;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;
import org.saferobots.ssml.metamodel.ssml.System;
import org.saferobots.ssml.metamodel.ssml.gate_type;

public class GateCreateFeature extends AbstractCreateFeature {
	
	String g_type;

	public GateCreateFeature(IFeatureProvider fp, String name, String description) {
		super(fp,name,description);
		g_type = name;
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		// TODO Auto-generated method stub
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Dispatch_Gate newGate = SsmlFactory.eINSTANCE.createDispatch_Gate();
		gate_type gtype;
		switch (g_type) {
		case "Splitter":
			gtype = gate_type.SPLITTER;
			break;
		case "Merger":
			gtype = gate_type.MERGER;
			break;
		case "Selector":
			gtype = gate_type.SELECTOR;
			break;
		case "Synchronizer":
			gtype = gate_type.SYNCHRONIZER;
			break;
		case "Delay":
			gtype = gate_type.DELAY;
			break;
		case "User_Defined":
			gtype = gate_type.USER_DEFINED;
			break;
		default:
			gtype = gate_type.USER_DEFINED;
			break;
		}
		newGate.setType(gtype);
		newGate.setName(g_type);
		
	   org.saferobots.ssml.metamodel.ssml.System system = (System) Utilities.getRootDomainObject(getDiagram());
	   system.getGates().add(newGate);
	    
	   addGraphicalRepresentation(context,newGate);
		
	   return new Object[] {newGate};
	}

}
