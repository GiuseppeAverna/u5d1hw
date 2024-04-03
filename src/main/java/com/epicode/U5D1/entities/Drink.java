package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drink {
	private String name;
	private int calories;
	private double price;

	public Drink(String name, int calories, double price) {
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
}
