package com.l7.dp.AbstractFactory;

public class WindowsScrollBar implements ScrollBar {
	@Override
	public void paint() {
		System.out.println("This is windows scrollbar");
	}
}
