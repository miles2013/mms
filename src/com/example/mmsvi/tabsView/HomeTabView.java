package com.example.mmsvi.tabsView;

import com.example.mmsvi.tabsMethodInt.HomeInt;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;


@SuppressWarnings("deprecation")
public class HomeTabView extends CustomComponent{
	
	

	@AutoGenerated
	private GridLayout mainLayout;

	@AutoGenerated
	private HorizontalLayout HorizontalLayoutB;

	@AutoGenerated
	private Button HilfeB;

	@AutoGenerated
	private Button AbmeldenB;

	@AutoGenerated
	private Panel AnmeldePanel;

	@AutoGenerated
	private VerticalLayout AnmeldeLayoutV;

	@AutoGenerated
	private Label AnmeldeLabel;

	@AutoGenerated
	private Panel InformP;

	@AutoGenerated
	private VerticalLayout InformLayoutV;

	@AutoGenerated
	private Label InformL;

	@AutoGenerated
	private Panel LoginPanel;

	@AutoGenerated
	private VerticalLayout LoginLayoutV;

	@AutoGenerated
	private GridLayout LoginLayoutG;

	@AutoGenerated
	private VerticalLayout LoginLayoutV2;

	@AutoGenerated
	private Button RegB;

	@AutoGenerated
	private LoginForm LoginForm;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	HomeInt I;
	
	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public HomeTabView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		
				
	}

	public HomeTabView(HomeInt I) {
		this.I=I;
		buildMainLayout();
		setCompositionRoot(mainLayout);
		// TODO add user code here
	}
	
	

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);
		mainLayout.setColumns(2);
		mainLayout.setRows(2);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// LoginPanel
		LoginPanel = buildLoginPanel();
		mainLayout.addComponent(LoginPanel, 0, 0);
		mainLayout.setComponentAlignment(LoginPanel, new Alignment(48));
		
		// InformP
		InformP = buildInformP();
		mainLayout.addComponent(InformP, 1, 0);
		mainLayout.setComponentAlignment(InformP, new Alignment(48));
		
		// AnmeldePanel
		AnmeldePanel = buildAnmeldePanel();
		mainLayout.addComponent(AnmeldePanel, 0, 1);
		mainLayout.setComponentAlignment(AnmeldePanel, new Alignment(20));
		
		// HorizontalLayoutB
		HorizontalLayoutB = buildHorizontalLayoutB();
		mainLayout.addComponent(HorizontalLayoutB, 1, 1);
		mainLayout.setComponentAlignment(HorizontalLayoutB, new Alignment(10));
		
		return mainLayout;
	}
	@AutoGenerated
	private Panel buildLoginPanel() {
		// common part: create layout
		LoginPanel = new Panel();
		LoginPanel.setStyleName("bordered");
		LoginPanel.setImmediate(false);
		LoginPanel.setWidth("-1px");
		LoginPanel.setHeight("143px");
		
		// LoginLayoutV
		LoginLayoutV = buildLoginLayoutV();
		LoginPanel.setContent(LoginLayoutV);
		
		return LoginPanel;
	}
	@AutoGenerated
	private VerticalLayout buildLoginLayoutV() {
		// common part: create layout
		LoginLayoutV = new VerticalLayout();
		LoginLayoutV.setImmediate(false);
		LoginLayoutV.setWidth("-1px");
		LoginLayoutV.setHeight("-1px");
		LoginLayoutV.setMargin(false);
		LoginLayoutV.setSpacing(true);
		
		// LoginLayoutG
		LoginLayoutG = buildLoginLayoutG();
		LoginLayoutV.addComponent(LoginLayoutG);
		LoginLayoutV.setComponentAlignment(LoginLayoutG, new Alignment(34));
		
		return LoginLayoutV;
	}
	@AutoGenerated
	private GridLayout buildLoginLayoutG() {
		// common part: create layout
		LoginLayoutG = new GridLayout();
		LoginLayoutG.setImmediate(false);
		LoginLayoutG.setWidth("-1px");
		LoginLayoutG.setHeight("-1px");
		LoginLayoutG.setMargin(false);
		LoginLayoutG.setSpacing(true);
		LoginLayoutG.setColumns(2);
		
		// LoginForm
		LoginForm = new LoginForm();
		LoginForm.setStyleName("v-loginform");
		LoginForm.setImmediate(false);
		LoginForm.setWidth("-1px");
		LoginForm.setHeight("-1px");
		LoginLayoutG.addComponent(LoginForm, 0, 0);
		LoginLayoutG.setComponentAlignment(LoginForm, new Alignment(6));
		
		// LoginLayoutV2
		LoginLayoutV2 = buildLoginLayoutV2();
		LoginLayoutG.addComponent(LoginLayoutV2, 1, 0);
		LoginLayoutG.setComponentAlignment(LoginLayoutV2, new Alignment(33));
		
		return LoginLayoutG;
	}
	@AutoGenerated
	private VerticalLayout buildLoginLayoutV2() {
		// common part: create layout
		LoginLayoutV2 = new VerticalLayout();
		LoginLayoutV2.setImmediate(false);
		LoginLayoutV2.setWidth("-1px");
		LoginLayoutV2.setHeight("-1px");
		LoginLayoutV2.setMargin(false);
		LoginLayoutV2.setSpacing(true);
		
		// RegB
		RegB = new Button();
		RegB.setCaption("Registrieren");
		RegB.setImmediate(true);
		RegB.setWidth("-1px");
		RegB.setHeight("-1px");
		LoginLayoutV2.addComponent(RegB);
		RegB.addClickListener(new Button.ClickListener() {
		    public void buttonClick(ClickEvent event) {
		        I.test();
		        Window win=new Window("test");
		        win.setModal(true);
		        
		    }
		});
		
		return LoginLayoutV2;
	}
	@AutoGenerated
	private Panel buildInformP() {
		// common part: create layout
		InformP = new Panel();
		InformP.setStyleName("bordered");
		InformP.setImmediate(false);
		InformP.setWidth("80.0%");
		InformP.setHeight("90.0%");
		
		// InformLayoutV
		InformLayoutV = buildInformLayoutV();
		InformP.setContent(InformLayoutV);
		
		return InformP;
	}
	@AutoGenerated
	private VerticalLayout buildInformLayoutV() {
		// common part: create layout
		InformLayoutV = new VerticalLayout();
		InformLayoutV.setImmediate(false);
		InformLayoutV.setWidth("100.0%");
		InformLayoutV.setHeight("100.0%");
		InformLayoutV.setMargin(false);
		
		// InformL
		InformL = new Label();
		InformL.setImmediate(false);
		InformL.setWidth("80.0%");
		InformL.setHeight("100.0%");
		InformL.setValue("Informationen Uni Ulm");
		InformLayoutV.addComponent(InformL);
		InformLayoutV.setComponentAlignment(InformL, new Alignment(20));
		
		return InformLayoutV;
	}
	@AutoGenerated
	private Panel buildAnmeldePanel() {
		// common part: create layout
		AnmeldePanel = new Panel();
		AnmeldePanel.setImmediate(false);
		AnmeldePanel.setWidth("80.0%");
		AnmeldePanel.setHeight("80.0%");
		
		// AnmeldeLayoutV
		AnmeldeLayoutV = buildAnmeldeLayoutV();
		AnmeldePanel.setContent(AnmeldeLayoutV);
		
		return AnmeldePanel;
	}
	@AutoGenerated
	private VerticalLayout buildAnmeldeLayoutV() {
		// common part: create layout
		AnmeldeLayoutV = new VerticalLayout();
		AnmeldeLayoutV.setImmediate(false);
		AnmeldeLayoutV.setWidth("100.0%");
		AnmeldeLayoutV.setHeight("100.0%");
		AnmeldeLayoutV.setMargin(false);
		
		// AnmeldeLabel
		AnmeldeLabel = new Label();
		AnmeldeLabel.setImmediate(false);
		AnmeldeLabel.setWidth("-1px");
		AnmeldeLabel.setHeight("-1px");
		AnmeldeLabel.setValue("Anmelde Informationen");
		AnmeldeLayoutV.addComponent(AnmeldeLabel);
		AnmeldeLayoutV.setComponentAlignment(AnmeldeLabel, new Alignment(20));
		
		return AnmeldeLayoutV;
	}
	@AutoGenerated
	private HorizontalLayout buildHorizontalLayoutB() {
		// common part: create layout
		HorizontalLayoutB = new HorizontalLayout();
		HorizontalLayoutB.setImmediate(false);
		HorizontalLayoutB.setWidth("-1px");
		HorizontalLayoutB.setHeight("-1px");
		HorizontalLayoutB.setMargin(false);
		
		// AbmeldenB
		AbmeldenB = new Button();
		AbmeldenB.setCaption("Abmelden");
		AbmeldenB.setEnabled(false);
		AbmeldenB.setImmediate(true);
		AbmeldenB.setVisible(false);
		AbmeldenB.setWidth("-1px");
		AbmeldenB.setHeight("-1px");
		HorizontalLayoutB.addComponent(AbmeldenB);
		
		// HilfeB
		HilfeB = new Button();
		HilfeB.setCaption("Hilfe");
		HilfeB.setImmediate(true);
		HilfeB.setWidth("-1px");
		HilfeB.setHeight("-1px");
		HorizontalLayoutB.addComponent(HilfeB);
		
		return HorizontalLayoutB;
	}


}