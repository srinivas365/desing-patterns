package com.l7.dp.Builder;

public class House implements HousePlan{
	private String basement;
	
	private String structure;
	private String interior;
	private String roof;
	
	public void setBasement(String basement) {
		this.basement = basement;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	
	public String getBasement() {
		return basement;
	}
	public String getStructure() {
		return structure;
	}
	public String getInterior() {
		return interior;
	}
	public String getRoof() {
		return roof;
	}
	
}
