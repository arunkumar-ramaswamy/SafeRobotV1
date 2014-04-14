package org.saferobots.ssml.graphicaleditors.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
import org.eclipse.jface.viewers.IFilter;
import org.saferobots.ssml.metamodel.ssml.System;

public class SystemFilter extends AbstractPropertySectionFilter implements
		IFilter {

	@Override
	protected boolean accept(PictogramElement pictogramElement) {
		EObject eObject =
	            Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pictogramElement);
	        if (eObject instanceof System) {
	            return true;
	        }
	        return false;	
	}

}
