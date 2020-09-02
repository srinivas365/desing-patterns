package com.l7.dp.Builder;

public class Demo {
	public static void main(String[] args) {
		HouseBuilder mbuilder=new MudHouseBuilder();
		
		CivilEngineer cv=new CivilEngineer(mbuilder);
		cv.constructHouse();
		
		House mudHouse=cv.getHouse();
		
		System.out.println(mudHouse.getBasement());
		System.out.println(mudHouse.getInterior());
		System.out.println(mudHouse.getRoof());
		System.out.println(mudHouse.getStructure());
		
	}
}
