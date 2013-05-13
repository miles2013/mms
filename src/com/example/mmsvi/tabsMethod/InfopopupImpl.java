package com.example.mmsvi.tabsMethod;

import com.example.mmsvi.tabsMethodInt.InfopopupInt;
import com.example.mmsvi.tabsView.window.Infopopup;

public class InfopopupImpl implements InfopopupInt {
	Infopopup infopopup;
	
	public InfopopupImpl(){
		Infopopup infopopup=new Infopopup(this);
	}

}