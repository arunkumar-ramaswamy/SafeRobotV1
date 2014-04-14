package org.saferobots.ssml.graphicaleditors.property;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.saferobots.ssml.metamodel.ssml.Connector;
import org.saferobots.ssml.metamodel.ssml.System;


public class SystemSection extends GFPropertySection implements
		ITabbedPropertyConstants {

    private Text nameText;
    private Text grammerText;
    
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		// TODO Auto-generated method stub
		super.createControls(parent, aTabbedPropertySheetPage);
		
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;
        
        nameText = factory.createText(composite, "");
	
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        nameText.setLayoutData(data);
 
        CLabel nameLabel = factory.createCLabel(composite,  "Name:");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(nameText, -HSPACE);
        data.top = new FormAttachment(nameText, 0, SWT.CENTER);
        nameLabel.setLayoutData(data);  
        
        grammerText = factory.createText(composite, "");
        
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(nameText, VSPACE);
        grammerText.setLayoutData(data);
        
        CLabel grammerLabel = factory.createCLabel(composite,  "Grammer:");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(grammerText, -HSPACE);
        data.top = new FormAttachment(grammerText, 0, SWT.CENTER);
        grammerLabel.setLayoutData(data);  
        
           
        
	}

	@Override
	public void aboutToBeShown() {
		// TODO Auto-generated method stub
		super.aboutToBeShown();
	}

	@Override
	public void aboutToBeHidden() {
		// TODO Auto-generated method stub
		super.aboutToBeHidden();
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            Object bo = Graphiti.getLinkService()
                 .getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a EClass
            if (bo == null)
                return;
            String name = ((System) bo).getName();
            nameText.setText(name == null ? "" : name);
        }
	}

}
