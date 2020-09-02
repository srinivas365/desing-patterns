package com.l7.dp.Builder;

public class MudHouseBuilder implements HouseBuilder {
	private House house;

	public MudHouseBuilder(){
		this.house=new House();
	}
	
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Mud basement");
		
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("mud structure");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("mud roof");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("mud interior");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}
}
