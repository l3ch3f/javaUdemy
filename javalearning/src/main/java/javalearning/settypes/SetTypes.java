package javalearning.settypes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTypes {
	
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
		
		// reversed
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 30; i > 0; i--) {
			set.add(i);
		}
		for(int i: set) {
			System.out.println(i);
		}
	}
}
