package javalearning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Chaand");
		set.add("John");
		set.add("Aafiya");
		set.add("Armaan");
		set.add("Mia");
		set.add("Mc");
		
		for(String name: set) {
			System.out.println(name);
		}
		
		System.out.println(set.contains(1));
	}
}
