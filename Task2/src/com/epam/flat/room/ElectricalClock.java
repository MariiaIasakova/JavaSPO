package com.epam.flat.room;

import com.epam.flat.ElecticalStaff;

public class ElectricalClock extends ElecticalStaff {
	
	public ElectricalClock(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void Activate() {
		System.out.println("Electrical clock " + name + " turn on.");
	}

}
