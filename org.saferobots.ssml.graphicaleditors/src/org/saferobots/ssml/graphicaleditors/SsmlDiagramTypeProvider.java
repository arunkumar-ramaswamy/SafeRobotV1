package org.saferobots.ssml.graphicaleditors;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.saferobots.ssml.graphicaleditors.utilities.Utilities;
import org.saferobots.ssml.metamodel.ssml.SsmlFactory;

public class SsmlDiagramTypeProvider extends AbstractDiagramTypeProvider
		implements IDiagramTypeProvider {

	public SsmlDiagramTypeProvider() {
		setFeatureProvider(new SsmlFeatureProvider(this));
	}
		
}
	
