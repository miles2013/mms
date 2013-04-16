package com.example.mmsvi.tabsMethod;

import com.example.mmsvi.tabsMethodInt.HomeInt;
import com.example.mmsvi.tabsView.HomeTabView;

 

public class HomeImpl implements  HomeInt{
	HomeTabView ht;
	public HomeImpl(){
		HomeTabView ht=new HomeTabView(this);
	}
	
	@Override
	public void test() {
		System.out.println("Es klappt");
	}

	@Override
	public boolean anmelden(String email, String passwort) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean abmelden() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registrieren() {
		// TODO Auto-generated method stub
		
	}

}
