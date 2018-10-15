package com.epam.mariia_iasakova.java.lesson1.task1;


public class ServiceMethodsForStrings {

	public String LongString (String[] arrayStrings) {
		String str1 = arrayStrings[0];
		for (String str2 :  arrayStrings)
		{
			if (str1.length() != str2.length())
			{
				if (str1.length() < str2.length())
				{
					str1 = str2;
				}					
			}
		}
		return str1;
	}
	
	public String shotString (String[] arrayStrings) {
		String str1 = arrayStrings[0];
		for (String str2 :  arrayStrings)
		{
			if (str1.length() != str2.length())
			{
				if (str1.length() > str2.length())
				{
					str1 = str2;
				}					
			}
		}
		return str1;
	}
	
	public void stringsBiggerAverage(String[] arrayStrings) {
		int lengthStr = 0;
		for (String str1 :  arrayStrings)
		{
			lengthStr += str1.length();
		}
		int avarageStr = lengthStr / arrayStrings.length;
		for (String str1 :  arrayStrings)
		{
			if (str1.length() > avarageStr)
			{
				System.out.println(str1 + " " + str1.length());
			}
		}
	}
	
	public void stringLitterAverage(String[] arrayStrings) {
		int lengthStr = 0;
		for (String str1 :  arrayStrings){
			lengthStr += str1.length();
		}
		int avarageStr = lengthStr / arrayStrings.length;
		for (String str1 :  arrayStrings)
		{
			if (str1.length() < avarageStr)
			{
				System.out.println(str1 + " " + str1.length());
			}
		}		
	}

}
