package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizza {
	private List<Topping> toppingList;
	private boolean isXl;

	public Pizza(String pizzaMargherita, List<Topping> toppingList, boolean isXl) {
		this.toppingList = toppingList;
		this.isXl = isXl;
	}

	public int calculateCalories() {
		int calories = 0;
		for (Topping topping : toppingList) {
			calories += topping.getCalories();
		}
		return isXl ? calories * 105 / 100 : calories;
	}

	public double calculatePrice() {
		double price = 4.30; // Prezzo base
		for (Topping topping : toppingList) {
			price += topping.getPrice();
		}
		return isXl ? price * 110 / 100 : price;
	}
}
