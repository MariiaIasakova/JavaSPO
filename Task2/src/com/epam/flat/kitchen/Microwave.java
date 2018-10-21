package com.epam.flat.kitchen;

import com.epam.flat.ElectricalStaffWithSocket;

public class Microwave extends ElectricalStaffWithSocket{
	
	public Microwave(String name, double valuePower) {
		super(name, valuePower);
	}
	
	  public void activateInternal() {
		  System.out.println("Microwave " + getName() + " turn on."); 
	  }
	
}
