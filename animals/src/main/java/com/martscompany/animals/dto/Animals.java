package com.martscompany.animals.dto;

public class Animals {

	private String habitat;
	private String name;

	public Animals() {
		super();
	}

	public Animals(String habitat, String name) {
		super();
		this.habitat = habitat;
		this.name = name;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
