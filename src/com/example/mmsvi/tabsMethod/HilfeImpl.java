package com.example.mmsvi.tabsMethod;

import com.example.mmsvi.tabsMethodInt.HilfeInt;
import com.example.mmsvi.tabsView.HilfeTabView;
import com.example.mmsvi.tabsView.HomeTabView;

public class HilfeImpl implements HilfeInt {

	HilfeTabView ht;
	public HilfeImpl(){
		HilfeTabView ht=new HilfeTabView(this);
	}
}
