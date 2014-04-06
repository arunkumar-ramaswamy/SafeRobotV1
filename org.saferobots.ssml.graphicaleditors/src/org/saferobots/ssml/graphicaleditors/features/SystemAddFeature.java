package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.System;

public class SystemAddFeature extends AbstractAddShapeFeature {
	
	private static final IColorConstant TEXT_COLOR = IColorConstant.BLACK;
	
	private static final IColorConstant SYSTEM_BACKGROUND = IColorConstant.LIGHT_GREEN;

	private static final IColorConstant SYSTEM_FOREGROUND= IColorConstant.DARK_GREEN;

	public SystemAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if(context.getNewObject() instanceof System){
			if(context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		System addedSystem = (System) context.getNewObject();
		

		ContainerShape containerShape = Graphiti.getPeCreateService().createContainerShape(
                context.getTargetContainer(), true);

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        int rect_width = 100;
        int rect_height = 100;
        IGaService gaService = Graphiti.getGaService();
	    RoundedRectangle roundedrectangle; 
	    {
            // create and set graphics algorithm
	    	roundedrectangle = gaService.createPlainRoundedRectangle(containerShape, 5, 5);	    	
	    	roundedrectangle.setBackground(manageColor(SYSTEM_BACKGROUND));
	    	roundedrectangle.setForeground(manageColor(SYSTEM_FOREGROUND));
	      	gaService.setLocationAndSize(roundedrectangle,
            context.getX(), context.getY(), rect_width, rect_height);  
	      	link(containerShape,addedSystem);
          }
	    // SHAPE WITH LINE
        {
            // create shape for line
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set graphics algorithm
            Polyline polyline =
                gaService.createPolyline(shape, new int[] { 0, 20, rect_width, 20 });
            polyline.setForeground(manageColor(SYSTEM_FOREGROUND));
            polyline.setLineWidth(2);
        }
 
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, addedSystem.getName());
            text.setForeground(manageColor(TEXT_COLOR));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 0, 0, rect_width, 20); 
            // create link and wire it
            link(shape, addedSystem);
        }
		
		
		return containerShape;
	}

}
