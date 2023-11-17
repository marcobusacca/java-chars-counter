package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci una parola: ");
		String input = in.nextLine();
		
		in.close();
		
		Map<Character, Integer> charFreq = new HashMap<>();
		
		for (Character c : input.toLowerCase().toCharArray()) {

			if (charFreq.containsKey(c)) {
				
				charFreq.put(c, charFreq.get(c) + 1);
				
			} else {
				
				charFreq.put(c, 1);
			}
		}
		
		System.out.println("\n" + charFreq + "\n");
		
		for (Character key : charFreq.keySet()) {
			System.out.println(key + ":" + charFreq.get(key));
		}
	}
}
