package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListRemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		
		// b) Initialize an integer variable as count
		int count =0;
				 
		//* c) Split the String into array and iterate over it
		String[] stringArray = text.split(" ");
		
		// * d) Initialize another loop to check whether the word is there in the array
		List<String> list = new ArrayList<String>();
		for(String string : stringArray)
		{
			list.add(string);
			if(string.equalsIgnoreCase("java")) {
				count++;
			}
			if(count >1)
				list.remove(string);
			}
		System.out.println(list);
	

}}