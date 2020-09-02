package com.l7.dp.AbstractFactory;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button getButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public CheckBox getCheckBox() {
		// TODO Auto-generated method stub
		return new WindowsCheckBox();
	}

	@Override
	public ScrollBar getScrollBar() {
		// TODO Auto-generated method stub
		return new WindowsScrollBar();
	}
	
	
	
}
