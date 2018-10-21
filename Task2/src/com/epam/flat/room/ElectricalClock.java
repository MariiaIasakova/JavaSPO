package com.epam.flat.room;

import com.epam.flat.ElectricalStaff;

public class ElectricalClock extends ElectricalStaff {
	
	public ElectricalClock(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void activate() {
		System.out.println("Electrical clock " + getName() + " turn on.");
	}

}
