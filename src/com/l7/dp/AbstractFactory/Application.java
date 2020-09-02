package com.l7.dp.AbstractFactory;
/**
 * 
 * @author SRINIVAS
 * 
 * This is client code
 */
public class Application {
	Button button;
	CheckBox checkbox;
	Application(GUIFactory factory){
		button=factory.getButton();
		checkbox=factory.getCheckBox();
	}
	void paint() {
		button.paint();
		checkbox.paint();
	}
}
