package org.saferobots.ssml.graphicaleditors;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class SsmlImageProvider extends AbstractImageProvider {
	
    // The prefix for all identifiers of this image provider
    protected static final String PREFIX = 
              "org.saferobots.ssml.graphicaleditors.";
    
    // The image identifier for an EReference.
    public static final String IMG_INPORT= PREFIX + "inport";
    public static final String IMG_OUTPORT= PREFIX + "outport";

	@Override
	protected void addAvailableImages() {
		// TODO Auto-generated method stub
        addImageFilePath(IMG_INPORT, "icons/in.gif");
        addImageFilePath(IMG_OUTPORT, "icons/out.gif");
	}

}
