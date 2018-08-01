package Comperator;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPrac {

	public static void main(String[] args) {
		
		
		Comparator<Integer> t = new Comp();
		
		
		Comparator<Integer> v = Comparator.comparing(f->-f);
		SortedMap<Integer, String> cityMap = new TreeMap<>(v);
		
		
		cityMap.put(4, "Austin");
		cityMap.put(2, "Houston");
		cityMap.put(22, "Dallas");
		cityMap.put(5, "Cedar Park");
		
		System.out.println(cityMap);
		
		
		
	
	}

}

class Comp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o1, o2);
	}
	
}
