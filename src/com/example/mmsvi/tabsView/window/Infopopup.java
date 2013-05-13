package com.example.mmsvi.tabsView.window;

import com.example.mmsvi.tabsMethodInt.InfopopupInt;
import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class Infopopup extends Window {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@AutoGenerated
	private GridLayout mainLayout=new GridLayout();

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */
	private InfopopupInt I;	
	@AutoGenerated
	private Panel panel_2;
	@AutoGenerated
	private VerticalLayout verticalLayout_2;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	
	
	public Infopopup(InfopopupInt I) {
		super();
		this.I=I;
		buildMainLayout();
		setContent(mainLayout);

		// TODO add user code here
	}
	
	

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("420px");
		mainLayout.setHeight("280px");
		
		// top-level component properties
		setWidth("420px");
		setHeight("280px");
		
		// panel_2
		panel_2 = buildPanel_2();
		mainLayout.addComponent(panel_2, "top:0.0px;left:0.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private Panel buildPanel_2() {
		// common part: create layout
		panel_2 = new Panel();
		panel_2.setImmediate(false);
		panel_2.setWidth("100.0%");
		panel_2.setHeight("100.0%");
		
		// verticalLayout_2
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("100.0%");
		verticalLayout_2.setHeight("100.0%");
		verticalLayout_2.setMargin(false);
		panel_2.setContent(verticalLayout_2);
		
		return panel_2;
	}

}
