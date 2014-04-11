package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;

public class PortAddFeature extends AbstractCustomFeature {
	
	private static final IColorConstant GATE_FOREGROUND =
	        new ColorConstant(98, 131, 167);

	private static final IColorConstant GATE_BACKGROUND =
	        new ColorConstant(187, 218, 247);
	
	 Object bo;


	public PortAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean canExecute(ICustomContext context) {
		  boolean ret = false;
          PictogramElement[] pes = context.getPictogramElements();
          if (pes != null && pes.length == 1) {
                bo = getBusinessObjectForPictogramElement(pes[0]);
                if (bo instanceof Dispatch_Gate) {
                    ret = true;
                }
          }
          return ret;
	}

	@Override
	public void execute(ICustomContext context) {
		
	    IPeCreateService peCreateService = Graphiti.getPeCreateService();
	    IGaService gaService = Graphiti.getGaService();
	    
		PictogramElement[] pes = context.getPictogramElements();
		int port_width = 20;
		int gate_width = 25;
		int gate_height = 100; 
	
		//port	    
	    {
	    	Shape shape = peCreateService.createShape((ContainerShape) pes[0],true);
	    	Rectangle rectangle = gaService.createRectangle(shape);
	    	rectangle.setBackground(manageColor(GATE_BACKGROUND));
	    	rectangle.setForeground(manageColor(GATE_FOREGROUND));
		    gaService.setLocationAndSize(rectangle,
		    		0, gate_height/2-port_width/2, port_width, port_width);
		    //link(shape,addedgate);
	    }
	}

}
