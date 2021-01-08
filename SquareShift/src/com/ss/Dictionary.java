package com.ss;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	
	
	private List<String> dictionaryItems;
	
	
	public void add(String str) {
		if(dictionaryItems== null)
			dictionaryItems = new ArrayList<>();
		dictionaryItems.add(str);
	}
	
	
	public boolean findItem(String item) {
		return dictionaryItems.contains(item);
	}
	
	public boolean startsWith(String item) {
		for(String dictItem:dictionaryItems) {
			if(dictItem.startsWith(item))
				return true;
		}
		return false;
	}

}
