package com.epam.flat;

public abstract class ElecticalStaff {
	
	public ElecticalStaff(String name, double valuePower) {
		this.name = name;
		this.valuePower = valuePower;
	}
	
	protected double valuePower;
	protected String name;
	
	public abstract void Activate();
	
	public int equals(ElecticalStaff obj) {
		
		if (this.valuePower < obj.valuePower)
		{
			return -1;
		}
		else if (this.valuePower == obj.valuePower)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
