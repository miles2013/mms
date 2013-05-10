package com.example.mmsvi.tabsView;

import com.example.mmsvi.tabsMethodInt.ModulhandbuecherInt;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class ModulhandbuecherTabView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private Panel SucheLabel_Panel;
	@AutoGenerated
	private VerticalLayout verticalLayout_2;
	@AutoGenerated
	private Button Hilfe_Button;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private Panel panel_2;
	@AutoGenerated
	private VerticalLayout verticalLayout_4;
	@AutoGenerated
	private Button Download_Button;
	@AutoGenerated
	private VerticalLayout verticalLayout_5;
	@AutoGenerated
	private Panel panel_1;
	@AutoGenerated
	private VerticalLayout verticalLayout_3;
	@AutoGenerated
	private GridLayout gridLayout_2;
	@AutoGenerated
	private Label Kurzinformation_Label;
	@AutoGenerated
	private Label Modulhandbuecher_Label;
	@AutoGenerated
	private GridLayout gridLayout_3;
	@AutoGenerated
	private Panel Suche_Panel;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private Button Suche_Button;
	@AutoGenerated
	private TextField textField_1;
	@AutoGenerated
	private Label Suche_Label;
	private ModulhandbuecherInt I;
	
	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	
	public ModulhandbuecherTabView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}
		
	public ModulhandbuecherTabView(ModulhandbuecherInt I) {
		this.I=I;
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}


	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// SucheLabel_Panel
		SucheLabel_Panel = buildSucheLabel_Panel();
		mainLayout.addComponent(SucheLabel_Panel);
		
		return mainLayout;
	}

	@AutoGenerated
	private Panel buildSucheLabel_Panel() {
		// common part: create layout
		SucheLabel_Panel = new Panel();
		SucheLabel_Panel.setImmediate(false);
		SucheLabel_Panel.setWidth("100.0%");
		SucheLabel_Panel.setHeight("-1px");
		
		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		SucheLabel_Panel.setContent(verticalLayout_2);
		
		return SucheLabel_Panel;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_2() {
		// common part: create layout
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("100.0%");
		verticalLayout_2.setHeight("100.0%");
		verticalLayout_2.setMargin(true);
		
		// Suche_Label
		Suche_Label = new Label();
		Suche_Label.setImmediate(false);
		Suche_Label.setWidth("-1px");
		Suche_Label.setHeight("40px");
		Suche_Label.setValue("Suche");
		verticalLayout_2.addComponent(Suche_Label);
		
		// Suche_Panel
		Suche_Panel = buildSuche_Panel();
		verticalLayout_2.addComponent(Suche_Panel);
		verticalLayout_2.setComponentAlignment(Suche_Panel, new Alignment(33));
		
		// gridLayout_3
		gridLayout_3 = new GridLayout();
		gridLayout_3.setImmediate(false);
		gridLayout_3.setWidth("-1px");
		gridLayout_3.setHeight("20px");
		gridLayout_3.setMargin(false);
		verticalLayout_2.addComponent(gridLayout_3);
		
		// gridLayout_2
		gridLayout_2 = buildGridLayout_2();
		verticalLayout_2.addComponent(gridLayout_2);
		
		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		verticalLayout_2.addComponent(gridLayout_1);
		
		// Hilfe_Button
		Hilfe_Button = new Button();
		Hilfe_Button.setCaption("Hilfe");
		Hilfe_Button.setImmediate(true);
		Hilfe_Button.setWidth("-1px");
		Hilfe_Button.setHeight("-1px");
		verticalLayout_2.addComponent(Hilfe_Button);
		verticalLayout_2.setComponentAlignment(Hilfe_Button, new Alignment(10));
		
		return verticalLayout_2;
	}

	@AutoGenerated
	private Panel buildSuche_Panel() {
		// common part: create layout
		Suche_Panel = new Panel();
		Suche_Panel.setImmediate(false);
		Suche_Panel.setWidth("100.0%");
		Suche_Panel.setHeight("30px");
		
		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		Suche_Panel.setContent(horizontalLayout_1);
		
		return Suche_Panel;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("100.0%");
		horizontalLayout_1.setHeight("-1px");
		horizontalLayout_1.setMargin(false);
		
		// textField_1
		textField_1 = new TextField();
		textField_1.setImmediate(false);
		textField_1.setWidth("100.0%");
		textField_1.setHeight("-1px");
		horizontalLayout_1.addComponent(textField_1);
		horizontalLayout_1
				.setComponentAlignment(textField_1, new Alignment(33));
		
		// Suche_Button
		Suche_Button = new Button();
		Suche_Button.setCaption("Suche");
		Suche_Button.setImmediate(true);
		Suche_Button.setWidth("-1px");
		Suche_Button.setHeight("-1px");
		horizontalLayout_1.addComponent(Suche_Button);
		horizontalLayout_1.setComponentAlignment(Suche_Button,
				new Alignment(34));
		
		return horizontalLayout_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_2() {
		// common part: create layout
		gridLayout_2 = new GridLayout();
		gridLayout_2.setImmediate(false);
		gridLayout_2.setWidth("100.0%");
		gridLayout_2.setHeight("-1px");
		gridLayout_2.setMargin(false);
		gridLayout_2.setColumns(2);
		
		// Modulhandbuecher_Label
		Modulhandbuecher_Label = new Label();
		Modulhandbuecher_Label.setImmediate(false);
		Modulhandbuecher_Label.setWidth("-1px");
		Modulhandbuecher_Label.setHeight("40px");
		Modulhandbuecher_Label.setValue("Modulhandb�cher");
		gridLayout_2.addComponent(Modulhandbuecher_Label, 0, 0);
		gridLayout_2.setComponentAlignment(Modulhandbuecher_Label,
				new Alignment(33));
		
		// Kurzinformation_Label
		Kurzinformation_Label = new Label();
		Kurzinformation_Label.setImmediate(false);
		Kurzinformation_Label.setWidth("-1px");
		Kurzinformation_Label.setHeight("40px");
		Kurzinformation_Label.setValue("Kurzinformation");
		gridLayout_2.addComponent(Kurzinformation_Label, 1, 0);
		
		return gridLayout_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setHeight("-1px");
		gridLayout_1.setMargin(false);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setColumns(2);
		
		// panel_1
		panel_1 = buildPanel_1();
		gridLayout_1.addComponent(panel_1, 0, 0);
		
		// panel_2
		panel_2 = buildPanel_2();
		gridLayout_1.addComponent(panel_2, 1, 0);
		
		return gridLayout_1;
	}

	@AutoGenerated
	private Panel buildPanel_1() {
		// common part: create layout
		panel_1 = new Panel();
		panel_1.setImmediate(false);
		panel_1.setWidth("90.0%");
		panel_1.setHeight("-1px");
		
		// verticalLayout_3
		verticalLayout_3 = new VerticalLayout();
		verticalLayout_3.setImmediate(false);
		verticalLayout_3.setWidth("100.0%");
		verticalLayout_3.setHeight("100.0%");
		verticalLayout_3.setMargin(false);
		panel_1.setContent(verticalLayout_3);
		
		return panel_1;
	}

	@AutoGenerated
	private Panel buildPanel_2() {
		// common part: create layout
		panel_2 = new Panel();
		panel_2.setImmediate(false);
		panel_2.setWidth("90.0%");
		panel_2.setHeight("-1px");
		
		// verticalLayout_4
		verticalLayout_4 = buildVerticalLayout_4();
		panel_2.setContent(verticalLayout_4);
		
		return panel_2;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_4() {
		// common part: create layout
		verticalLayout_4 = new VerticalLayout();
		verticalLayout_4.setImmediate(false);
		verticalLayout_4.setWidth("100.0%");
		verticalLayout_4.setHeight("100.0%");
		verticalLayout_4.setMargin(false);
		
		// verticalLayout_5
		verticalLayout_5 = new VerticalLayout();
		verticalLayout_5.setImmediate(false);
		verticalLayout_5.setWidth("100.0%");
		verticalLayout_5.setHeight("-1px");
		verticalLayout_5.setMargin(false);
		verticalLayout_4.addComponent(verticalLayout_5);
		
		// Download_Button
		Download_Button = new Button();
		Download_Button.setCaption("Download PDF");
		Download_Button.setImmediate(true);
		Download_Button.setWidth("-1px");
		Download_Button.setHeight("-1px");
		verticalLayout_4.addComponent(Download_Button);
		verticalLayout_4.setComponentAlignment(Download_Button, new Alignment(
				10));
		
		return verticalLayout_4;
	}

}