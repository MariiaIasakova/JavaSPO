package com.epam.mariia_iasakova.task4_1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RunnerLogic {

	public void doLogic(List<Set<Integer>> sets) {

		System.out.println("All sets:");
		for (Set<Integer> set : sets) {
			System.out.println(set);
		}
		Set<Integer> firstSet = sets.get(0);
		Set<Integer> secondSet = sets.get(1);

		System.out.println("Crossing of the sets:");
		System.out.println(crossing(firstSet, secondSet));

		System.out.println("Union of the sets:");
		System.out.println(unite(firstSet, secondSet));
	}

	private Set<Integer> crossing(Set<Integer> firstSet, Set<Integer> secondSet) {
		Set<Integer> result = new TreeSet<>();
		result.addAll(firstSet);
		result.retainAll(secondSet);
		return result;
	}

	private Set<Integer> unite(Set<Integer> firstSet, Set<Integer> secondSet) {
		Set<Integer> result = new TreeSet<>();
		result.addAll(firstSet);
		result.addAll(secondSet);
		return result;
	}

}
