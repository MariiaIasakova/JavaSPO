package com.epam.flat.room;

import com.epam.flat.ElectricalStaffWithSocket;

public class TV extends ElectricalStaffWithSocket{
	
	public TV(String name, double valuePower) {
		super(name, valuePower);
	}

	public void ActivateInternal() {
		  System.out.println("TV " + name + " turn on."); 
	  }
}
