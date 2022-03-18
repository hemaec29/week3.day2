package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDupList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		
		for(int i =0; i<list.size();i++)
		{
			int count = 0;
			for(int j =i+1; j < list.size(); j++) {
				
				if(list.get(i) == list.get(j))
				{
					count++;
				}
			}
			if(count > 0) {
				System.out.println(list.get(i));
			
			}
		
		}
		
	}

}
