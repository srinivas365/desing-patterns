package com.l7.dp.AbstractFactory;

public class TestAF {
	
	public static void main(String[] args) {
		GUIFactory windows=new WindowsFactory();
		Button b=windows.getButton();
		CheckBox c=windows.getCheckBox();
		ScrollBar s=windows.getScrollBar();
		b.paint();
		c.paint();
		s.paint();
		
		GUIFactory macOS=new MacOSFactory();
		Button macButton=macOS.getButton();
		macButton.paint();
		
		
		
		
		
	}
}
