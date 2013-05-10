package com.example.mmsvi.tabsMethod;

import com.example.mmsvi.tabsMethodInt.BenutzerverwaltungInt;
import com.example.mmsvi.tabsView.BenutzerverwaltungTabView;

public class BenutzerverwaltungImpl implements BenutzerverwaltungInt {

	BenutzerverwaltungTabView bt;
	public BenutzerverwaltungImpl()	{
		BenutzerverwaltungTabView bt=new BenutzerverwaltungTabView(this);
		
	}
}
