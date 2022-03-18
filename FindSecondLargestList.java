package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
	}

}
