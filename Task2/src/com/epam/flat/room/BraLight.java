package com.epam.flat.room;

import com.epam.flat.ElecticalStaff;

public class BraLight extends ElecticalStaff{
	
	public BraLight(String name, double valuePower) {
		super(name, valuePower);
	}

	public void Activate() {
		System.out.println("BraLight " + name + " turn on.");
	}

}
