package com.Chilja.game;

// how to add the picture?

public class Card {
	
	private int id;
	
	private String brand;
	private String model;
	private Double displacement;
	private Double zeroToHundred;
	private Integer maxSpeed;
	private Integer horsepower;
	
	Card(String brand, String model, Double displacement, Double zeroToHundred, Integer maxSpeed, Integer horsepower) {	
		
		if(brand == null || model == null || displacement == null || zeroToHundred == null || maxSpeed == null || horsepower == null) {
			throw new NullPointerException(); 
		} else {
			this.brand = brand;
			this.model = model;
			this.displacement = displacement;
			this.zeroToHundred = zeroToHundred;
			this.maxSpeed = maxSpeed;
			this.horsepower = horsepower;
		}
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}
	
	public Double getDisplacement() {
		return this.displacement;
	}
	
	public void setZeroToHundred(Double zeroToHundred) {
		this.zeroToHundred = zeroToHundred;
	}
	
	public Double getZeroToHundred() {
		return this.zeroToHundred;
	}
	
	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Integer getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setHorsepower(Integer horsepower) {
		this.horsepower = horsepower;
	}
	
	public Integer getHorsepower() {
		return this.horsepower;
	}
}
