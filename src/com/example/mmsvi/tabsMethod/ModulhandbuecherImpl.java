package com.example.mmsvi.tabsMethod;

import com.example.mmsvi.tabsMethodInt.ModulhandbuecherInt;
import com.example.mmsvi.tabsView.ModulhandbuecherTabView;

public class ModulhandbuecherImpl implements ModulhandbuecherInt {
	
	ModulhandbuecherTabView mt;
	public ModulhandbuecherImpl()	{
		ModulhandbuecherTabView mt = new ModulhandbuecherTabView(this);
	}

}
