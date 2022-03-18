package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,7,6,8));
		Collections.sort(list);
			for (int i = 0; i < list.size(); i++)
			{
				//System.out.println("Inside for integer");
				if(list.get(i) != i+1) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}

