package com.nt.product;

public class House {
	private Basement basement;
	private Structure structure;
	private Roofing roofing;
	private Interior interior;
	
	// setters && getters (only setters also useful)
	public Basement getBasement() {
		return basement;
	}
	public void setBasement(Basement basement) {
		this.basement = basement;
	}
	public Structure getStructure() {
		return structure;
	}
	public void setStructure(Structure structure) {
		this.structure = structure;
	}
	public Roofing getRoofing() {
		return roofing;
	}
	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	
	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roofing=" + roofing + ", interior="
				+ interior + "]";
	}
	
	
	

}
