package com.epam.mariia_iasakova.task4_1;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import com.epam.mariia_iasakova.*;
public class Runner {

	public static void main(String[] args) {

		String fileName = "text.txt";
		try {
			CSVReader fileReader = new CSVReader(fileName);
			List<Set<Integer>> sets = fileReader.readListSets();
			new RunnerLogic().doLogic(sets);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}