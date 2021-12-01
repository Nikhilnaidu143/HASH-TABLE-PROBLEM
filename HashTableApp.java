package com.hash.table;

public class HashTableApp {
	public static void main(String[] args) {
		/** Displayed Welcome message **/
		System.out.println("-----------WELCOME TO HASH TABLE-----------\n");

		String string = "To be or not to be";  //input string.
		String[] words = string.split(" ");   //splitting words using spaces into string array 

		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			Integer value = linkedHashMap.get(word);
			if (value == null) {               
				value = 1;
			} 
			else {
				value += 1;          //incrementing value by 1.
			}
			linkedHashMap.put(word, value);
		}
		System.out.println(linkedHashMap);
	}
}
