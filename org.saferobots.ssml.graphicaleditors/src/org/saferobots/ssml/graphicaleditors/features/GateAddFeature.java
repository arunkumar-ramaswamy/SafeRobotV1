package org.saferobots.ssml.graphicaleditors.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;
import org.saferobots.ssml.metamodel.ssml.port_type;

public class GateAddFeature extends AbstractAddShapeFeature {
	
	private static final IColorConstant GATE_FOREGROUND =
	        new ColorConstant(98, 131, 167);

	private static final IColorConstant GATE_BACKGROUND =
	        new ColorConstant(187, 218, 247);

	public GateAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		if(context.getNewObject() instanceof Dispatch_Gate){
			if(context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Dispatch_Gate addedgate = (Dispatch_Gate) context.getNewObject();
		
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        
        
		ContainerShape containerShape = peCreateService.createContainerShape(
                context.getTargetContainer(), true);
		
        int cont_width=65;
        int cont_height=100;
		int gate_width = 25;
	 	int gate_height = 100; 
	 	int port_width = 20;
	 	
	    IGaService gaService = Graphiti.getGaService();
	    Rectangle container_rectangle; 
	    {
            // create and set graphics algorithm
	    	container_rectangle = gaService.createRectangle(containerShape);
	    	container_rectangle.setFilled(false);
	    	container_rectangle.setLineVisible(false);
	      	gaService.setLocationAndSize(container_rectangle,
            context.getX(), context.getY(), cont_width, cont_height);  
          }
    
	    //gate	    
	    {
	    	Shape shape = peCreateService.createShape(containerShape,true);
	    	Rectangle rectangle = gaService.createRectangle(shape);
	    	rectangle.setBackground(manageColor(GATE_BACKGROUND));
	    	rectangle.setForeground(manageColor(GATE_FOREGROUND));
		    gaService.setLocationAndSize(rectangle,
		    		port_width, 0, gate_width, gate_height);
		    link(shape,addedgate);
	    }
	    
	    //Setting the x and y position for ports
	    //in port in left side and out port in right side
	    int port_xpos=0;
	    int port_ypos=0;
	    int port_ypos_in_count = 0;
	    int port_ypos_out_count = 0;
	    for (int i = 0; i < addedgate.getPorts().size(); i++) {
	    	if(addedgate.getPorts().get(i).getType()==port_type.IN)
	    	{
	    		port_ypos_in_count++;
	    	}
	    	else
	    	{
	    		port_ypos_out_count++;
	    	}	
	    }
	    int port_ypos_div_in=gate_height/(1+port_ypos_in_count);
	    int port_ypos_div_out=gate_height/(1+port_ypos_out_count);
	    //reseting the counter for in and out ports
	    port_ypos_in_count=0;
	    port_ypos_out_count=0;
	    for (int i = 0; i < addedgate.getPorts().size(); i++) {
	    	int port_in_count=0, port_out_count=0;
	    	if(addedgate.getPorts().get(i).getType()==port_type.IN)
	    	{
	    		port_in_count++;
	    		port_xpos = 0;
	    		port_ypos = ++port_ypos_in_count*port_ypos_div_in-port_width/2;
	    	}
	    	else
	    	{
	    		port_out_count++;
	    		port_xpos = port_width+gate_width;
	    		port_ypos = ++port_ypos_out_count*port_ypos_div_out-port_width/2;
	    	}	

		   //adding ports
	    	Shape shape = peCreateService.createShape(containerShape,true);
	    	Rectangle rectangle = gaService.createRectangle(shape);
	    	rectangle.setBackground(manageColor(GATE_BACKGROUND));
	    	rectangle.setForeground(manageColor(GATE_FOREGROUND));
		    gaService.setLocationAndSize(rectangle,
		    		port_xpos, port_ypos, port_width, port_width);
		    link(shape,addedgate.getPorts().get(i));		    
	    }
	    
	    link(containerShape,addedgate);
		return containerShape;
	}

}
