package com.epam.flat;

import java.util.ArrayList;

public class Human {
	public String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void activateStuff(ElecticalStaff staff) {
		System.out.println(name + " turn on the " + staff.name);
		staff.Activate();
	}

	public ArrayList<ElecticalStaff> sortStaffs (ArrayList<ElecticalStaff> staffList) {
		
		ElecticalStaff[] staffArray = staffList.toArray(new ElecticalStaff[staffList.size()]);
		
		 for (int i = 0; i < staffArray.length; i++) {

			 ElecticalStaff min = staffArray[i];
		        int min_i = i; 
		        for (int j = i+1; j < staffArray.length; j++) {
		            if (staffArray[j].valuePower < min.valuePower) {
		                min = staffArray[j];
		                min_i = j;
		            }
		        }
		        if (i != min_i) {
		        	ElecticalStaff tmp = staffArray[i];
		            staffArray[i] = staffArray[min_i];
		            staffArray[min_i] = tmp;
		        }
		     }
		 
		ArrayList<ElecticalStaff> newStaffList = new ArrayList<ElecticalStaff>();
		for (ElecticalStaff electicalStaff : staffArray) {
			newStaffList.add(electicalStaff);
		}
		return newStaffList;
	}
	
	public ArrayList<ElecticalStaff> seachStaff (ArrayList<ElecticalStaff> stuffList, double minValue, double maxValue){
		
		ElecticalStaff[] stuffArray = stuffList.toArray(new ElecticalStaff[stuffList.size()]);
		ArrayList<ElecticalStaff> newArray = new ArrayList<ElecticalStaff>();
		
		for (int i=1; i < stuffArray.length; i++) {
			
			if (stuffArray[i].valuePower < maxValue & stuffArray[i].valuePower > minValue) {
				newArray.add(stuffArray[i]);
			}
		}
		
		return newArray;
	}
}
