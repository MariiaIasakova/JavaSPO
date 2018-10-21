package com.epam.flat;

public abstract class ElectricalStaffWithSocket extends ElectricalStaff {
	
	public ElectricalStaffWithSocket(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void activate(){
		System.out.println("Turn on the socket.");
		activateInternal();
	}
		
	protected abstract void activateInternal();
	
}
