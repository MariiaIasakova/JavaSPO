package com.epam.flat.kitchen;

import com.epam.flat.ElectricalStaffWithSocket;

public class CoffeeMashine extends ElectricalStaffWithSocket {
	
	public CoffeeMashine(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void ActivateInternal() {
		System.out.println("Coffee mashine " + name + " turn on.");
	}

}
