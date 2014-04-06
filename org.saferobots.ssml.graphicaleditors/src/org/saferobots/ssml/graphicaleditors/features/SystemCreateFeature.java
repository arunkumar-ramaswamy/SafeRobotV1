package org.saferobots.ssml.graphicaleditors.features;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.saferobots.ssml.graphicaleditors.utilities.Utilities;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;
import org.saferobots.ssml.metamodel.ssml.System;

public class SystemCreateFeature extends AbstractCreateFeature {

	public SystemCreateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		
		System system = SsmlFactory.eINSTANCE.createSystem();
		system.setName("SolutionSpace");
		
		try {
			try {
				Utilities.saveToModelFile(system, getDiagram());
				} catch (IOException e) {
				e.printStackTrace();
		}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		addGraphicalRepresentation(context,system);
		
		return new Object[] {system};
	}

}
