package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {
	
	List<Integer> num;
	Map<Integer,Integer> numMap;
	
	public RandomizedSet() {
		num = new ArrayList<>();
		numMap = new HashMap<>();
	}
	
	public boolean insert(int val) {
		if(!numMap.containsKey(val)){
			num.add(val);
			numMap.put(val, num.size()-1);
			return true;
		}
		return false;
	}
	
	public boolean remove(int val) {
		if(numMap.containsKey(val)){ 
			int pos = numMap.get(val);
			num.set(pos, num.get(num.size()-1));
			numMap.put(num.get(pos), pos);
			num.remove(num.size()-1);
			numMap.remove(val);
			return true;
		}
		return false;
	}

	public int getRandom() {
		 return num.get((int)(Math.random()*numMap.size()));
	}
}
