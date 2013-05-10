package com.example.mmsvi.tabsMethod;

import com.example.mmsvi.tabsMethodInt.RegistrierenWindowInt;
import com.example.mmsvi.tabsView.window.RegistrierenWindow;

public class RegistrierenWindowImpl implements RegistrierenWindowInt {
	RegistrierenWindow reg;
	public RegistrierenWindowImpl(){
		RegistrierenWindow reg=new RegistrierenWindow(this);
	}

}