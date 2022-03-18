package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {

		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int arr1 : array1) {
			list1.add(arr1);
		}
		System.out.println(list1);
		for (int arr2 : array2) {
			list2.add(arr2);
		}
		System.out.println(list2);
		//compare and get the common integers
		list2.retainAll(list1);
		System.out.println(list2);
					}
	}