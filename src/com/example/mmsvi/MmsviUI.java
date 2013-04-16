package com.example.mmsvi;


import com.example.mmsvi.tabsMethod.HomeImpl;
import com.example.mmsvi.tabsView.HilfeTabView;
import com.example.mmsvi.tabsView.HomeTabView;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Main UI class
 */
@SuppressWarnings("serial")
public class MmsviUI extends UI {
	
	//Create TabsLogik
	private HomeImpl homeImpl=new HomeImpl();
	
	//Create Tabs
	private HomeTabView Home=new HomeTabView(homeImpl);
	private HilfeTabView Hilfe=new HilfeTabView();
	
	@Override
	protected void init(VaadinRequest request) {
		 VerticalLayout content = new VerticalLayout();
	        content.setHeight("80%");
	        content.setWidth("80%");
	        content.setSpacing(true);
	        setContent(content); 
	        TabSheet t = new TabSheet(); 
	        
	         
	        // Add the component to the tab sheet as a new tab.
			t.addTab(Home,"Home");
			t.addTab(Hilfe,"Hilfe");
	        content.addComponent(t);
	}

}