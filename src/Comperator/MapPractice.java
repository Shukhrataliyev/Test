package Comperator;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
	
		
		HashMap<Integer, String> cityMap = new HashMap<>();
		cityMap.put(22304, "Austin");
		cityMap.put(22384, "Houston");
		cityMap.put(22304, "Dallas");
		cityMap.put(22504, "Cedar Park");
		
		System.out.println(cityMap);
	
		
		for (Integer mKey : cityMap.keySet()) {
			System.out.println(mKey);
		}
		
		for (String mValue : cityMap.values()) {
			System.out.println(mValue);
		}
	
		for (Entry<Integer, String> mBoth : cityMap.entrySet()) {
			System.out.println(mBoth.getKey()+"-"+mBoth.getValue());
		}
	
		
	}

}
