package com.epam.mariia_iasakova.analisText;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.*; 

public class MainProgram {

	public static void main(String[] args) throws IOException {
		
		String path = "Text.txt";
		StringBuilder strBuilder = new StringBuilder();

		 List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
         for(String line: lines){
        	 strBuilder.append(line);
         }
		
         Pattern pattern = Pattern.compile("\\W+");
         String[] splitWords =  split(pattern, strBuilder.toString());
         Map<String, Integer> occurrences = new HashMap<String, Integer>();
         for ( String word : splitWords ) {
            Integer oldCount = occurrences.get(word);
            if ( oldCount == null ) {
               oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
         }  
         for (Map.Entry entry : occurrences.entrySet()) {
        	    System.out.println(entry.getKey() + " "
        	        + entry.getValue());
        	}
     
	}
	
	public static String[] split(Pattern pattern, String text) {
		if (text == null) {
			text = " ";
		}
		int last_much = 0;
		LinkedList<String> splitted = new LinkedList<>();
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			splitted.add(text.substring(last_much, matcher.start()));
			last_much = matcher.end();
		}
		splitted.add(text.substring(last_much));
		return splitted.toArray(new String[splitted.size()]);
	}
}
