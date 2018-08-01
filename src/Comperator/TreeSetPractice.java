package Comperator;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		
		Comparator<String> lastC = new LastCharComparator();
		Comparator<String> secC = Comparator.comparing(s->s.charAt(1));
		
		TreeSet<String> tSet = new TreeSet<>(secC);
		
		tSet.add("Adam");
		tSet.add("Zod");
		tSet.add("Superman");
		tSet.add("BatmanX");
		tSet.add("Zod");
		
		//Collections.sort(tSet.lastC);
		
		System.out.println(tSet);

	}
	
}

class LastCharComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1)); 
	}
	
}
