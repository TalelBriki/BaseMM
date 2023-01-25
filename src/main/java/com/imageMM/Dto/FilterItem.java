package com.imageMM.Dto;

enum filterCritere{
	height_greater,
	height_less,

	width,
	profondeur,
	poids,
	nb_elements,
	nb_tirage,
	type_tirage,
}

public class FilterItem {
	
	private filterCritere filterCritere;
	private String stringValue;
	private int intValue;
	private double doubleValue;
	public FilterItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FilterItem(com.imageMM.Dto.filterCritere filterCritere, String stringValue, int intValue,
			double doubleValue) {
		super();
		this.filterCritere = filterCritere;
		this.stringValue = stringValue;
		this.intValue = intValue;
		this.doubleValue = doubleValue;
	}
	public filterCritere getFilterCritere() {
		return filterCritere;
	}
	public void setFilterCritere(filterCritere filterCritere) {
		this.filterCritere = filterCritere;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public double getDoubleValue() {
		return doubleValue;
	}
	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
	
	
	

}
