package com.epam.flat;

public abstract class ElectricalStaffWithSocket extends ElecticalStaff {
	
	public ElectricalStaffWithSocket(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void Activate(){
		System.out.println("Turn on the socket.");
		ActivateInternal();
	}
		
	protected abstract void ActivateInternal();
	
}
