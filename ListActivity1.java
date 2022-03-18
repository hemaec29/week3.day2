package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListActivity1 {
public static void main(String[] args) {
List<String> list =  new ArrayList<String>();
	int count =0;
	list.add("Adam");
	list.add("Ben");
	list.add("Zara");
	list.add("Adam");
	list.add("Charlie");
	list.add("Zara");
	System.out.println(list);
	
	List<String> withoutDuplicates = new ArrayList<String>();
	
	System.out.println("Iterator Each Element:"+list.iterator());
	
	for(int i=0; i< list.size(); i++) {
		System.out.println("Each element:"+list.get(i));
	}
	Map<String, Integer> map = new HashMap<String, Integer>();
	for(String each : list) {
			
		if(map.containsKey(each)) {
			map.put(each, map.get(each) + 1);
		}else {
			map.put(each, 1);
		}
		
		if(!withoutDuplicates.contains(each))
			withoutDuplicates.add(each);
		else
			System.out.println("Duplicate found:" +each);
	}
	System.out.println(withoutDuplicates);
	System.out.println(map);	
	}
}


