package com.epam.flat.bathroom;

import com.epam.flat.ElecticalStaff;

public class Trimmer extends ElecticalStaff{
	
	public Trimmer(String name, double valuePower) {
		super(name, valuePower);
	}
	
	@Override
	public void Activate() {
		System.out.println("Trimmer " + name + " turn on.");
	}

}
