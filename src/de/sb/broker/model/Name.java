package de.sb.broker.model;

public class Name {
	
	
	private String family;
	private String given;
	
	public Name(String family, String given){
		
		this.family=family;
		this.given=given;
		
	}
	
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getGiven() {
		return given;
	}
	public void setGiven(String given) {
		this.given = given;
	}
	
}
