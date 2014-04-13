package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.saferobots.ssml.graphicaleditors.utilities.GraphicalEditorConfig;
import org.saferobots.ssml.graphicaleditors.utilities.Utilities;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.Port;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;
import org.saferobots.ssml.metamodel.ssml.System;
import org.saferobots.ssml.metamodel.ssml.gate_type;
import org.saferobots.ssml.metamodel.ssml.port_type;

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
		gate_type gtype;
		//setting the default no. of in and out ports
		int no_in_port=0,no_out_port=0;
		switch (g_type) {
		case "Splitter":
			gtype = gate_type.SPLITTER;
			no_in_port = GraphicalEditorConfig.SPLITTER_IN;
			no_out_port = GraphicalEditorConfig.SPLITTER_OUT;
			break;
		case "Merger":
			gtype = gate_type.MERGER;
			no_in_port = GraphicalEditorConfig.MERGER_IN;
			no_out_port = GraphicalEditorConfig.MERGER_OUT;
			break;
		case "Selector":
			gtype = gate_type.SELECTOR;
			no_in_port = GraphicalEditorConfig.SELECTOR_IN;
			no_out_port = GraphicalEditorConfig.SELECTOR_OUT;
			break;
		case "Synchronizer":
			gtype = gate_type.SYNCHRONIZER;
			no_in_port = GraphicalEditorConfig.SYNCHRONIZER_IN;
			no_out_port = GraphicalEditorConfig.SYNCHRONIZER_OUT;
			break;
		case "Delay":
			gtype = gate_type.DELAY;
			no_in_port = GraphicalEditorConfig.DELAY_IN;
			no_out_port = GraphicalEditorConfig.DELAY_OUT;
			break;
		case "User_Defined":
			gtype = gate_type.USER_DEFINED;
			no_in_port = GraphicalEditorConfig.USERDEFINED_IN;
			no_out_port = GraphicalEditorConfig.USERDEFINED_OUT;
			break;
		default:
			gtype = gate_type.USER_DEFINED;
			no_in_port = GraphicalEditorConfig.USERDEFINED_IN;
			no_out_port = GraphicalEditorConfig.USERDEFINED_OUT;
			break;
		}
				
		//creating a gate
		Dispatch_Gate newGate = SsmlFactory.eINSTANCE.createDispatch_Gate();
		newGate.setType(gtype);
		newGate.setName(g_type);
		
		//creating in ports
		Port inport;
		for (int i = 0; i < no_in_port; i++) {
			inport = SsmlFactory.eINSTANCE.createPort();
			inport.setType(port_type.IN);
			newGate.getPorts().add(inport);
		}
		//creating out ports
		Port outport;
		for (int i = 0; i < no_out_port; i++) {
			outport = SsmlFactory.eINSTANCE.createPort();
			outport.setType(port_type.OUT);
			newGate.getPorts().add(outport);
		}
		
		//getting the root element
		org.saferobots.ssml.metamodel.ssml.System system = (System) Utilities.getRootDomainObject(getDiagram());
		//adding the gate
		system.getGates().add(newGate);		
	    
		addGraphicalRepresentation(context,newGate);
		
	   return new Object[] {newGate};
	}

}
