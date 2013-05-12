package com.example.mmsvi;


import com.example.mmsvi.tabsMethod.BenutzerverwaltungImpl;
import com.example.mmsvi.tabsMethod.HilfeImpl;
import com.example.mmsvi.tabsMethod.HomeImpl;
import com.example.mmsvi.tabsMethod.ModulhandbuecherImpl;
import com.example.mmsvi.tabsMethod.VerwalteModulhandbuchModuluebersichtImpl;
import com.example.mmsvi.tabsMethodInt.VerwalteModulhandbuchModuluebersichtInt;
import com.example.mmsvi.tabsView.BenutzerverwaltungTabView;
import com.example.mmsvi.tabsView.HilfeTabView;
import com.example.mmsvi.tabsView.HomeTabView;
import com.example.mmsvi.tabsView.ModulhandbuecherTabView;
import com.example.mmsvi.tabsView.VerwalteModulhandbuchModuluebersichtTabView;
import com.vaadin.server.VaadinRequest;
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
	private HilfeImpl hilfeImpl=new HilfeImpl();
	private BenutzerverwaltungImpl benutzerImpl=new BenutzerverwaltungImpl();
	private ModulhandbuecherImpl modulhandImpl=new ModulhandbuecherImpl();
	private VerwalteModulhandbuchModuluebersichtImpl verwalteModulhandImpl 
				= new VerwalteModulhandbuchModuluebersichtImpl();
	
	
	//Create Tabs
	private HomeTabView Home=new HomeTabView(homeImpl);
	private ModulhandbuecherTabView Modulhandbuecher=new ModulhandbuecherTabView(modulhandImpl);
	private BenutzerverwaltungTabView Benutzerverwaltung = new BenutzerverwaltungTabView(benutzerImpl);
	private HilfeTabView Hilfe=new HilfeTabView(hilfeImpl);
	private VerwalteModulhandbuchModuluebersichtTabView VerwalteModulhandbuchUebersicht 
				= new VerwalteModulhandbuchModuluebersichtTabView(verwalteModulhandImpl);
	
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
			t.addTab(Modulhandbuecher, "Modulhandbücher");
			t.addTab(Benutzerverwaltung, "Benutzerverwaltung");
			t.addTab(VerwalteModulhandbuchUebersicht, "Verwalte Modulhandbuch Uebersicht");
			t.addTab(Hilfe,"Hilfe");
	        content.addComponent(t);
	}

}