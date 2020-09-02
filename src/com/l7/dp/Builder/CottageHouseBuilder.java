package com.l7.dp.Builder;

public class CottageHouseBuilder implements HouseBuilder {
	public House house;
	public CottageHouseBuilder() {
		house=new House();
	}
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Tiles basement");
	}
	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("2 bed rooms 2 bathrooms");
	}
	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("Grass Roof");
		
	}
	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Good Interior");
	}
	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}
}
