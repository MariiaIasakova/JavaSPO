package com.epam.flat;

public abstract class ElectricalStaffWithSocket extends ElectricalStaff {
	
	public ElectricalStaffWithSocket(String name, double valuePower) {
		super(name, valuePower);
	}
	
	public void Activate(){
		System.out.println("Turn on the socket.");
		ActivateInternal();
	}
		
	protected abstract void ActivateInternal();
	
}
