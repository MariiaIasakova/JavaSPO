package com.epam.flat.kitchen;

import com.epam.flat.ElectricalStaffWithSocket;

public class CoffeeMachine extends ElectricalStaffWithSocket {
	
	public CoffeeMachine(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void ActivateInternal() {
		System.out.println("Coffee machine " + getName() + " turn on.");
	}

}
