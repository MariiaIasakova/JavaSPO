package com.epam.mariia_iasakova.analisText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.VolatileCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.*;
import java.util.stream.Collectors;

import javax.naming.spi.DirectoryManager; 

public class MainProgram {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("Text.txt");
		copyFile(path);
		String text = readFile(path);
        String[] splitLines =  split(getProperty("splitPatternLines"), text);
        Map<String, Integer> wordsInSentence = new HashMap<String, Integer>();
        for (int i = 0; i < splitLines.length; i++) {
        	String[] words = split(getProperty("splitPatternWords"), splitLines[i]);
        	wordsInSentence.put(splitLines[i], words.length);
		}
/*        Map<String, Integer> occurrences = new HashMap<String, Integer>();
         for ( String word : splitWords ) {
        	String lowerWord = word.toLowerCase();
            Integer oldCount = occurrences.get(lowerWord);
            if ( oldCount == null ) {
               oldCount = 0;
            }
            occurrences.put(lowerWord, oldCount + 1);
         }  
*/
        int stringLength = 10;
         for (Map.Entry entry : wordsInSentence.entrySet()) {
        	    System.out.println(entry.getKey().toString().substring(0,stringLength) + " "
        	        + entry.getValue());
        	}  
         String vowel = getCommonVowel(getProperty("mutchVowels"), text);
         System.out.println("vowel: " + vowel);
         System.out.println("The words that have this vowel");
         String[] words = split(getProperty("splitPatternWords"), text);
         for (String word : words) {
			if (word.contains(vowel)) {
				System.out.print(word + " ");
			}
		}
	}
	
	private static String[] split (String pattern, String text) {
		return text.split(pattern);
	}
	
	private static String getCommonVowel(String textPattern, String text) {
		Pattern pattern = Pattern.compile(textPattern);
		Matcher matcher = pattern.matcher(text);
		Map<String, Integer> vowels = new HashMap<String, Integer>();
		while (matcher.find())
		{
			String letter = matcher.group(0);
			int count = vowels.containsKey(letter)? vowels.get(letter):0;
			vowels.put(letter, count + 1);
		}
		Map<String, Integer> sortVowels = vowels.entrySet()
        .stream()
        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		String vowel = sortVowels.keySet().toArray()[0].toString(); 
		return vowel;
	}
	
	private static void copyFile(Path nameSource) throws IOException, FileAlreadyExistsException {
		Path dest = Paths.get("resource/backUp.bak");
		Files.copy(nameSource, dest, StandardCopyOption.REPLACE_EXISTING);
	}
	
	private static String readFile(Path path) throws IOException {
		
		StringBuilder strBuilder = new StringBuilder();
	
		 List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
	    
		 for(String line: lines){
			 strBuilder.append(line);
		 }
		 
	    return strBuilder.toString();
	}
	private static String getProperty(String propertyName) {
		ResourceBundle rb = ResourceBundle.getBundle("resources/config_ru_RU", Locale.getDefault());
		return rb.getString(propertyName);
	}
	
}
