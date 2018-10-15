package com.epam.mariia_iasakova.java.lesson1.task1;

import java.util.*;

public class ProcessingArray {

	private static Scanner scanner;

	public static void main(String[] args) {
		/**
		 * Operations on arrays
		 */
		ServiceMethodsForArrays ServiceClassForArray = new ServiceMethodsForArrays();
		int orgArray[] = ServiceClassForArray.generationArray();
		ServiceClassForArray.printArray(orgArray);
		int maxNegativeElement = ServiceClassForArray.seachMaxNegativeElement(orgArray);
		int minPositiveElement = ServiceClassForArray.seachMinElement(orgArray);
		int changeArray[] = ServiceClassForArray.replaceElement(orgArray, maxNegativeElement, minPositiveElement);
		ServiceClassForArray.printArray(changeArray);
		System.out.println(ServiceClassForArray.sumElement(orgArray));
		changeArray = ServiceClassForArray.changeNegativeElements(orgArray);
		ServiceClassForArray.printArray(changeArray);
		changeArray = ServiceClassForArray.increaseElements(orgArray);
		ServiceClassForArray.printArray(changeArray);
		int minElement = ServiceClassForArray.seachMinElement(orgArray);
		int averageElement = ServiceClassForArray.average(orgArray);
		System.out.println(ServiceClassForArray.differenceInElements(minElement, averageElement));
		ArrayList<Integer> lastArray = ServiceClassForArray.seachElements(orgArray);
		ServiceClassForArray.printList(lastArray);
		
		/**
		 * Operations on strings
		 */
		ServiceMethodsForStrings ServiceClassForStrings = new ServiceMethodsForStrings();
		scanner = new Scanner(System.in);
		int NumberLines = scanner.nextInt();
		String[] arrayStrings = new String[NumberLines];		
		for (int i = 0; i < NumberLines; i++)
		{
			arrayStrings[i] = scanner.nextLine();
		}
		scanner.close();
		
		String longString = ServiceClassForStrings.LongString(arrayStrings);
		System.out.println(longString + " " + longString.length());
		String shotString = ServiceClassForStrings.shotString(arrayStrings);
		System.out.println(shotString + " " + shotString.length());
		System.out.println();
		ServiceClassForStrings.stringsBiggerAverage(arrayStrings);
		System.out.println();
		ServiceClassForStrings.stringLitterAverage(arrayStrings);
		System.out.println();
		
	}
	
}
