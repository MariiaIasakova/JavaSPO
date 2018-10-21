package com.epam.flat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human {
	public String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void activateStuff(ElectricalStaff staff) {
		System.out.println(name + " turn on the " + staff.getName());
		staff.activate();
	}

	public List<ElectricalStaff> sortStaffs (ArrayList<ElectricalStaff> staffList) {
		
		ElectricalStaff[] staffArray = staffList.toArray(new ElectricalStaff[staffList.size()]);
		
		 for (int i = 0; i < staffArray.length; i++) {

			 ElectricalStaff min = staffArray[i];
		        int min_i = i; 
		        for (int j = i+1; j < staffArray.length; j++) {
		            if (staffArray[j].getValuePower() < min.getValuePower()) {
		                min = staffArray[j];
		                min_i = j;
		            }
		        }
		        if (i != min_i) {
		        	ElectricalStaff tmp = staffArray[i];
		            staffArray[i] = staffArray[min_i];
		            staffArray[min_i] = tmp;
		        }
		     }
		 
		 return new ArrayList<>(Arrays.asList(staffArray));
	}
	
	public List<ElectricalStaff> searchStaff (List<ElectricalStaff> stuffList, double minValue, double maxValue){
		
		ElectricalStaff[] stuffArray = stuffList.toArray(new ElectricalStaff[stuffList.size()]);
		ArrayList<ElectricalStaff> newArray = new ArrayList<>();
		
		for (int i=1; i < stuffArray.length; i++) {
			
			if (stuffArray[i].getValuePower() < maxValue && stuffArray[i].getValuePower() > minValue) {
				newArray.add(stuffArray[i]);
			}
		}	
		return newArray;
	}
}
