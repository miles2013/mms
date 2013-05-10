package com.example.mmsvi.tabsView;

import com.example.mmsvi.tabsMethodInt.BenutzerverwaltungInt;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class BenutzerverwaltungTabView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private Panel panel_2;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private VerticalLayout verticalLayout_2;
	@AutoGenerated
	private Button Hilfe_button;
	@AutoGenerated
	private Panel Aktionen_panel;
	@AutoGenerated
	private GridLayout gridLayout_3;
	@AutoGenerated
	private Button Speichern_button;
	@AutoGenerated
	private Button Loeschen_button;
	@AutoGenerated
	private Label Aktionen_label;
	@AutoGenerated
	private Panel BenutzerSuchen_Panel;
	@AutoGenerated
	private VerticalLayout verticalLayout_4;
	@AutoGenerated
	private GridLayout gridLayout_2;
	@AutoGenerated
	private Button Suche_button;
	@AutoGenerated
	private CheckBox Anbieter_checkBox;
	@AutoGenerated
	private TextField Benutzertyp_textField;
	@AutoGenerated
	private TextField eMail_textField;
	@AutoGenerated
	private TextField Nachname_textField;
	@AutoGenerated
	private TextField Vorname_textField;
	@AutoGenerated
	private TextField AccountName_textField;
	@AutoGenerated
	private Label BenutzerSuchen_label;
	@AutoGenerated
	private Table table_1;
	@AutoGenerated
	private Label Benutzer_Label;
	
	private BenutzerverwaltungInt I;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public BenutzerverwaltungTabView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}


	public BenutzerverwaltungTabView(BenutzerverwaltungInt I) {
		this.I=I;
		buildMainLayout();
		setCompositionRoot(mainLayout);
		// TODO Auto-generated constructor stub
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(true);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// Benutzer_Label
		Benutzer_Label = new Label();
		Benutzer_Label.setImmediate(false);
		Benutzer_Label.setWidth("-1px");
		Benutzer_Label.setHeight("30px");
		Benutzer_Label.setValue("Benutzer");
		mainLayout.addComponent(Benutzer_Label);
		
		// panel_2
		panel_2 = buildPanel_2();
		mainLayout.addComponent(panel_2);
		
		return mainLayout;
	}

	@AutoGenerated
	private Panel buildPanel_2() {
		// common part: create layout
		panel_2 = new Panel();
		panel_2.setImmediate(false);
		panel_2.setWidth("100.0%");
		panel_2.setHeight("100.0%");
		
		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		panel_2.setContent(gridLayout_1);
		
		return panel_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("-1px");
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setColumns(2);
		gridLayout_1.setRows(2);
		
		// table_1
		table_1 = new Table();
		table_1.setSelectable(true);
		table_1.setImmediate(false);
		table_1.setWidth("100.0%");
		table_1.setHeight("100.0%");
		table_1.addContainerProperty("Accountname",  String.class,  null);
		table_1.addContainerProperty("First Name", String.class,  null);
		table_1.addContainerProperty("Last Name",  String.class,  null);
		table_1.addContainerProperty("e-Mail",  String.class,  null);
		table_1.addContainerProperty("Typ",  String.class,  null);
		table_1.addContainerProperty("Anbieter",  CheckBox.class,  null);
	
		
		table_1.addItem(new Object[] {"Nc34","Nicolaus","Copernicus","nicolaus.copernicus@uni-ulm.de", "Benutzer", new CheckBox()}, new Integer(1));
		table_1.addItem(new Object[] {"Nc34","Nicolaus","Copernicus","nicolaus.copernicus@uni-ulm.de", "Admin", new CheckBox()}, new Integer(2));
		table_1.addItem(new Object[] {"Nc34","Nicolaus","Copernicus","nicolaus.copernicus@uni-ulm.de", "Koordinator", new CheckBox()}, new Integer(3));
		table_1.addItem(new Object[] {"Nc34","Nicolaus","Copernicus","nicolaus.copernicus@uni-ulm.de","Koordinator", new CheckBox()}, new Integer(4));
		table_1.addItem(new Object[] {"Nc34","Nicolaus","Copernicus","nicolaus.copernicus@uni-ulm.de","Benutzer",new CheckBox()}, new Integer(5));
		table_1.addItem(new Object[] {"Nc34","Nicolaus","Copernicus","nicolaus.copernicus@uni-ulm.de","Koordinator",new CheckBox()}, new Integer(6));
		
		
		gridLayout_1.addComponent(table_1, 0, 0);
		gridLayout_1.setComponentAlignment(table_1, new Alignment(48));
		
		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		gridLayout_1.addComponent(verticalLayout_2, 1, 0);
		gridLayout_1.setComponentAlignment(verticalLayout_2, new Alignment(6));
		
		return gridLayout_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_2() {
		// common part: create layout
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("-1px");
		verticalLayout_2.setHeight("-1px");
		verticalLayout_2.setMargin(true);
		verticalLayout_2.setSpacing(true);
		
		// BenutzerSuchen_label
		BenutzerSuchen_label = new Label();
		BenutzerSuchen_label.setImmediate(false);
		BenutzerSuchen_label.setWidth("-1px");
		BenutzerSuchen_label.setHeight("30px");
		BenutzerSuchen_label.setValue("Benutzer suchen");
		verticalLayout_2.addComponent(BenutzerSuchen_label);
		
		// BenutzerSuchen_Panel
		BenutzerSuchen_Panel = buildBenutzerSuchen_Panel();
		verticalLayout_2.addComponent(BenutzerSuchen_Panel);
		
		// Aktionen_label
		Aktionen_label = new Label();
		Aktionen_label.setImmediate(false);
		Aktionen_label.setWidth("-1px");
		Aktionen_label.setHeight("30px");
		Aktionen_label.setValue("Aktionen");
		verticalLayout_2.addComponent(Aktionen_label);
		
		// Aktionen_panel
		Aktionen_panel = buildAktionen_panel();
		verticalLayout_2.addComponent(Aktionen_panel);
		
		// Hilfe_button
		Hilfe_button = new Button();
		Hilfe_button.setCaption("Hilfe");
		Hilfe_button.setImmediate(false);
		Hilfe_button.setWidth("-1px");
		Hilfe_button.setHeight("-1px");
		verticalLayout_2.addComponent(Hilfe_button);
		verticalLayout_2.setComponentAlignment(Hilfe_button, new Alignment(10));
		
		return verticalLayout_2;
	}

	@AutoGenerated
	private Panel buildBenutzerSuchen_Panel() {
		// common part: create layout
		BenutzerSuchen_Panel = new Panel();
		BenutzerSuchen_Panel.setImmediate(false);
		BenutzerSuchen_Panel.setWidth("100.0%");
		BenutzerSuchen_Panel.setHeight("100.0%");
		
		// verticalLayout_4
		verticalLayout_4 = buildVerticalLayout_4();
		BenutzerSuchen_Panel.setContent(verticalLayout_4);
		
		return BenutzerSuchen_Panel;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_4() {
		// common part: create layout
		verticalLayout_4 = new VerticalLayout();
		verticalLayout_4.setImmediate(false);
		verticalLayout_4.setWidth("100.0%");
		verticalLayout_4.setHeight("100.0%");
		verticalLayout_4.setMargin(false);
		
		// AccountName_textField
		AccountName_textField = new TextField();
		AccountName_textField.setCaption("Accountname");
		AccountName_textField.setImmediate(false);
		AccountName_textField.setWidth("-1px");
		AccountName_textField.setHeight("24px");
		verticalLayout_4.addComponent(AccountName_textField);
		verticalLayout_4.setComponentAlignment(AccountName_textField,
				new Alignment(48));
		
		// Vorname_textField
		Vorname_textField = new TextField();
		Vorname_textField.setCaption("Vorname");
		Vorname_textField.setImmediate(false);
		Vorname_textField.setWidth("-1px");
		Vorname_textField.setHeight("-1px");
		verticalLayout_4.addComponent(Vorname_textField);
		verticalLayout_4.setComponentAlignment(Vorname_textField,
				new Alignment(48));
		
		// Nachname_textField
		Nachname_textField = new TextField();
		Nachname_textField.setCaption("Nachname");
		Nachname_textField.setImmediate(false);
		Nachname_textField.setWidth("-1px");
		Nachname_textField.setHeight("-1px");
		verticalLayout_4.addComponent(Nachname_textField);
		verticalLayout_4.setComponentAlignment(Nachname_textField,
				new Alignment(48));
		
		// eMail_textField
		eMail_textField = new TextField();
		eMail_textField.setCaption("eMail-Adresse");
		eMail_textField.setImmediate(false);
		eMail_textField.setWidth("-1px");
		eMail_textField.setHeight("-1px");
		verticalLayout_4.addComponent(eMail_textField);
		verticalLayout_4.setComponentAlignment(eMail_textField, new Alignment(
				48));
		
		// Benutzertyp_textField
		Benutzertyp_textField = new TextField();
		Benutzertyp_textField.setCaption("Benutzertyp");
		Benutzertyp_textField.setImmediate(false);
		Benutzertyp_textField.setWidth("-1px");
		Benutzertyp_textField.setHeight("-1px");
		verticalLayout_4.addComponent(Benutzertyp_textField);
		verticalLayout_4.setComponentAlignment(Benutzertyp_textField,
				new Alignment(48));
		
		// gridLayout_2
		gridLayout_2 = buildGridLayout_2();
		verticalLayout_4.addComponent(gridLayout_2);
		verticalLayout_4.setComponentAlignment(gridLayout_2, new Alignment(24));
		
		return verticalLayout_4;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_2() {
		// common part: create layout
		gridLayout_2 = new GridLayout();
		gridLayout_2.setImmediate(false);
		gridLayout_2.setWidth("-1px");
		gridLayout_2.setHeight("-1px");
		gridLayout_2.setMargin(true);
		gridLayout_2.setSpacing(true);
		gridLayout_2.setColumns(2);
		
		// Anbieter_checkBox
		Anbieter_checkBox = new CheckBox();
		Anbieter_checkBox.setCaption("Nur Anbieter");
		Anbieter_checkBox.setImmediate(false);
		Anbieter_checkBox.setWidth("-1px");
		Anbieter_checkBox.setHeight("-1px");
		gridLayout_2.addComponent(Anbieter_checkBox, 0, 0);
		
		// Suche_button
		Suche_button = new Button();
		Suche_button.setCaption("Suche");
		Suche_button.setImmediate(true);
		Suche_button.setWidth("-1px");
		Suche_button.setHeight("-1px");
		gridLayout_2.addComponent(Suche_button, 1, 0);
		gridLayout_2.setComponentAlignment(Suche_button, new Alignment(10));
		
		return gridLayout_2;
	}

	@AutoGenerated
	private Panel buildAktionen_panel() {
		// common part: create layout
		Aktionen_panel = new Panel();
		Aktionen_panel.setImmediate(false);
		Aktionen_panel.setWidth("290px");
		Aktionen_panel.setHeight("100px");
		
		// gridLayout_3
		gridLayout_3 = buildGridLayout_3();
		Aktionen_panel.setContent(gridLayout_3);
		
		return Aktionen_panel;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_3() {
		// common part: create layout
		gridLayout_3 = new GridLayout();
		gridLayout_3.setImmediate(false);
		gridLayout_3.setWidth("100.0%");
		gridLayout_3.setHeight("100.0%");
		gridLayout_3.setMargin(false);
		gridLayout_3.setSpacing(true);
		gridLayout_3.setColumns(2);
		gridLayout_3.setRows(2);
		
		// Loeschen_button
		Loeschen_button = new Button();
		Loeschen_button.setCaption("L�SCHEN");
		Loeschen_button.setImmediate(true);
		Loeschen_button.setWidth("-1px");
		Loeschen_button.setHeight("-1px");
		gridLayout_3.addComponent(Loeschen_button, 0, 1);
		gridLayout_3.setComponentAlignment(Loeschen_button, new Alignment(48));
		
		// Speichern_button
		Speichern_button = new Button();
		Speichern_button.setCaption("�nderungen speichern");
		Speichern_button.setImmediate(true);
		Speichern_button.setWidth("-1px");
		Speichern_button.setHeight("-1px");
		gridLayout_3.addComponent(Speichern_button, 1, 1);
		gridLayout_3.setComponentAlignment(Speichern_button, new Alignment(48));
		
		return gridLayout_3;
	}

}