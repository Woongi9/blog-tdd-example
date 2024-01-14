package com.example.blogtddexample.entity;

public class Dollar {
	private int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int times) {
		return new Dollar(amount * times);
	}

	public boolean equals(Object object) {
		Dollar dollar = (Dollar)object;
		return this.amount == dollar.amount;
	}

}
