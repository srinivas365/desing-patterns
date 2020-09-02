package com.l7.dp.OrderPrice;

public class Demo {
	public static void main(String[] args) {
		Box Order=new Box();
		
		Box laptopBox=new Box();
		Item laptop=new Item(30000);
		Item Adapter=new Item(10000);
		Item HeadSet=new Item(3000);
		laptopBox.addEntity(laptop);
		laptopBox.addEntity(Adapter);
		laptopBox.addEntity(HeadSet);
		
		Box tvBox=new Box();
		Item tv=new Item(12000);
		Item setupBox=new Item(1000);
		Item cdPlayer=new Item(3000);
		
		tvBox.addEntity(tv);
		tvBox.addEntity(setupBox);
		tvBox.addEntity(cdPlayer);
		
		Order.addEntity(laptopBox);
		Order.addEntity(tvBox);
		
		System.out.println(Order.getPrice());
	}
}
