package com.l7.dp.Builder;

public class CivilEngineer {
	HouseBuilder builder;
	public CivilEngineer(HouseBuilder builder) {
		this.builder=builder;
	}
	public House getHouse() {
		return this.builder.getHouse();
	}
	public void constructHouse() {
		this.builder.buildBasement();
		this.builder.buildStructure();
		this.builder.buildRoof();
		this.builder.buildInterior();
	}
}
