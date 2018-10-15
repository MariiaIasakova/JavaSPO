package com.epam.flat;

import java.util.ArrayList;

import com.epam.flat.bathroom.*;
import com.epam.flat.kitchen.*;
import com.epam.flat.room.*;

public class Life {
	
	public static void main(String[] args) {
		
		Human Masha = new Human("Masha");
		
		ArrayList<ElecticalStaff> staffList = new ArrayList<ElecticalStaff>(); 
		ElectricalClock elClock = new ElectricalClock("Swatch", 0.15);
		Masha.activateStuff(elClock);
		staffList.add(elClock);
		Hairdryer hairdryer = new Hairdryer("Raventa", 1.7);
		Masha.activateStuff(hairdryer);
		staffList.add(hairdryer);
		Trimmer trimmer = new Trimmer("Revlon", 1.2);
		Masha.activateStuff(trimmer);
		staffList.add(trimmer);
		CoffeeMashine coffeeMashine = new CoffeeMashine("Bosh", 1.6);
		Masha.activateStuff(coffeeMashine);
		staffList.add(coffeeMashine);
		Microwave microwave = new Microwave("Dewoo", 2.3);
		Masha.activateStuff(microwave);
		staffList.add(microwave);
		BraLight bra = new BraLight("Edison", 1.4);
		Masha.activateStuff(bra);
		staffList.add(bra);
		TV tv = new TV("Sumsung", 3.8);
		Masha.activateStuff(tv);
		staffList.add(tv);
		
		ArrayList<ElecticalStaff> choosenArray = Masha.seachStaff(staffList, 0.8, 2);
		System.out.println();
		System.out.println("Staffs in rangefrom 0.8 to 2:");
		PrintList(choosenArray);
		System.out.println();
		ArrayList<ElecticalStaff> newStaffList = Masha.sortStaffs(staffList);
		System.out.println("Sort staffs:");
		PrintList(newStaffList);
	}
	
	private static void PrintList(ArrayList<ElecticalStaff> staffList) {
		for (ElecticalStaff electicalStaff : staffList) {
			System.out.println(electicalStaff.name + " " + electicalStaff.valuePower);
		}
	}

}
