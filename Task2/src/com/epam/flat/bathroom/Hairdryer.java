package com.epam.flat.bathroom;

import com.epam.flat.ElectricalStaffWithSocket;

public class Hairdryer extends ElectricalStaffWithSocket {
	
	public Hairdryer(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void activateInternal() {
		  System.out.println("Hairdryer " + getName() + " turn on."); 
	  }

}
