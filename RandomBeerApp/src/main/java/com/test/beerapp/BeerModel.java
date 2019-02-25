package com.test.beerapp;

public class BeerModel {

	public int id;
	public String name;
	public String description;
	public float abv;
	public String brewery;
	
	public BeerModel(int id, String name, String description, float abv, String brewery)	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.abv = abv;
		this.brewery = brewery;
	}	
}
