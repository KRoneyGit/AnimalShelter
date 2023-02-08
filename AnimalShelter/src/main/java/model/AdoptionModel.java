package model;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Feb 7, 2023
*/
public class AdoptionModel {
	private String petName;
	private String petSpecies;
	private String supplies;
	private int totalCost;
	
	public AdoptionModel() {
		super();
	}	
	public AdoptionModel(String name, String species, String supplies) {
		super();
		this.petName = name;
		this.petSpecies = species;
		this.supplies = supplies;
		this.setTotalCost();
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetSpecies() {
		return petSpecies;
	}
	public void setPetSpecies(String petSpecies) {
		this.petSpecies = petSpecies;
	}
	public String getSupplies() {
		return supplies;
	}
	public void setSupplies(String supplies) {
		this.supplies = supplies;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost() {
		this.totalCost = 0;
		if (this.petSpecies.equals("cat")) {
			this.totalCost += 100;
			if (this.supplies.equals("yes")) {
				this.totalCost += 50;
			}
		}
		else if (this.petSpecies.equals("dog")) {
			this.totalCost += 200;
			if (this.supplies.equals("yes")) {
				this.totalCost += 100;
			}
		}
		else {
			this.totalCost += 50;
			if (this.supplies.equals("yes")) {
				this.totalCost += 100;
			}
		}
	}
	@Override
	public String toString() {
		return "adoptionModel [petName=" + petName + ", petSpecies=" + petSpecies + ", supplies=" + supplies
				+ ", totalCost=" + totalCost + "]";
	}
	
	
}
