package com.l7.dp.AbstractFactory;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button getButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public CheckBox getCheckBox() {
		// TODO Auto-generated method stub
		return new MacOSCheckBox();
	}
	
	
	
}
