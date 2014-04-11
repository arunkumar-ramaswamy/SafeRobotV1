package org.saferobots.ssml.graphicaleditors;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextEntryHelper;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonEntry;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.saferobots.ssml.graphicaleditors.features.PortAddFeature;
import org.saferobots.ssml.metamodel.ssml.Dispatch_Gate;

public class SsmlToolBehaviorProvider extends DefaultToolBehaviorProvider
		{

	public SsmlToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IContextButtonPadData getContextButtonPad(
			IPictogramElementContext context) {
		IContextButtonPadData data = super.getContextButtonPad(context);
	    PictogramElement pe = context.getPictogramElement();
	    
	    
	   
	 
        Object bo = Graphiti.getLinkService()
                .getBusinessObjectForLinkedPictogramElement(pe);
	    if(bo instanceof Dispatch_Gate)
	    {
	    	setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE);
	    	
	    	  
			    //data.getDomainSpecificContextButtons().add(inbutton);
			   
			 
			    
			    ContextButtonEntry outbutton = new ContextButtonEntry(null, context);
			    outbutton.setText("Add OUT Port");
			    outbutton.setIconId(SsmlImageProvider.IMG_OUTPORT);		    
			    //data.getDomainSpecificContextButtons().add(outbutton);
			    
	    	//Adding IN port custom button
	    	CustomContext cc = new CustomContext(new PictogramElement[] { pe });
	 	    ICustomFeature[] cf = getFeatureProvider().getCustomFeatures(cc);
	 	    for (int i = 0; i < cf.length; i++) {
	 	        ICustomFeature iCustomFeature = cf[i];
	 	        if (iCustomFeature instanceof PortAddFeature) {
	 	        	ContextButtonEntry inbutton = new ContextButtonEntry(iCustomFeature, cc);
				    inbutton.setText("Add IN Port");
				    inbutton.setIconId(SsmlImageProvider.IMG_INPORT);
				    data.getDomainSpecificContextButtons().add(inbutton);
	 	            break;
	 	           }
	 	    }
	   	       
		  
	    }
	    
		return data;
	}

}
