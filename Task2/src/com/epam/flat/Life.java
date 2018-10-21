package com.epam.flat;

import java.util.ArrayList;
import java.util.List;

import com.epam.flat.bathroom.*;
import com.epam.flat.kitchen.*;
import com.epam.flat.room.*;

public class Life {
	
	public static void main(String[] args) {
		
		Human masha = new Human("Masha");
		
		ArrayList<ElectricalStaff> staffList = new ArrayList<ElectricalStaff>(); 
		ElectricalClock elClock = new ElectricalClock("Swatch", 0.15);
		masha.activateStuff(elClock);
		staffList.add(elClock);
		Hairdryer hairdryer = new Hairdryer("Raventa", 1.7);
		masha.activateStuff(hairdryer);
		staffList.add(hairdryer);
		Trimmer trimmer = new Trimmer("Revlon", 1.2);
		masha.activateStuff(trimmer);
		staffList.add(trimmer);
		CoffeeMachine coffeeMashine = new CoffeeMachine("Bosh", 1.6);
		masha.activateStuff(coffeeMashine);
		staffList.add(coffeeMashine);
		Microwave microwave = new Microwave("Dewoo", 2.3);
		masha.activateStuff(microwave);
		staffList.add(microwave);
		BraLight bra = new BraLight("Edison", 1.4);
		masha.activateStuff(bra);
		staffList.add(bra);
		TV tv = new TV("Sumsung", 3.8);
		masha.activateStuff(tv);
		staffList.add(tv);
		
		List<ElectricalStaff> choosenArray = masha.searchStaff(staffList, 0.8, 2);
		System.out.println();
		System.out.println("Staffs in range from 0.8 to 2:");
		PrintList(choosenArray);
		System.out.println();
		List<ElectricalStaff> newStaffList = masha.sortStaffs(staffList);
		System.out.println("Sort staffs:");
		PrintList(newStaffList);
	}
	
	private static void PrintList(List<ElectricalStaff> staffList) {
		for (ElectricalStaff electricalStaff : staffList) {
			System.out.println(electricalStaff.toString());
		}
	}

}
