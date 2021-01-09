package com.ss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {

	private Set<String> dictionaryItems;

	public Dictionary(String file) {
		loadDictionary(file);
	}
	public Dictionary() {
		
	}

	private void loadDictionary(String file) {
		try (Scanner scanner = new Scanner(new File(file))) {
			while(scanner.hasNext())
				add(scanner.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void add(String str) {
		if (dictionaryItems == null)
			dictionaryItems = new TreeSet<>();
		dictionaryItems.add(str);
	}

	public boolean findItem(String item) {
		return dictionaryItems.contains(item);
	}

	public boolean startsWith(String matchingString) {
		return dictionaryItems.stream().anyMatch(item -> item.startsWith(matchingString));

	}

}
