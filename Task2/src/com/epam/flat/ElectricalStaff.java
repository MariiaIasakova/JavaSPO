package com.epam.flat;

public abstract class ElectricalStaff {
	
	public ElectricalStaff(String name, double valuePower) {
		this.name = name;
		this.valuePower = valuePower;
	}
	
	private double valuePower;
	private String name;
	
	public double getValuePower() {
		return this.valuePower;
	}
	public void setValuePower(double valuePower) {
		this.valuePower = valuePower;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void activate();
	
	public int equals(ElectricalStaff obj) {
		
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
	
	 @Override
	    public String toString() {
	        return "ElectricalStaff{" +
	                "valuePower=" + valuePower +
	                ", name='" + name + '\'' +
	                '}';
	    }
}
