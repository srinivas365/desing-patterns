package com.l7.dp.AbstractFactory;

public interface GUIFactory {
	public Button getButton();
	public CheckBox getCheckBox();
	public default ScrollBar getScrollBar() {
		return null;
	}
}
