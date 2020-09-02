package com.l7.dp.Builder;

public interface HouseBuilder {
	public void buildBasement();
	public void buildStructure();
	public void buildRoof();
	public void buildInterior();
	public House getHouse();
}
