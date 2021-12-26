package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

/*
 * Given 2 int sorted arrays, print the intersection elements 
 * of two arrays 
 * 
 * int[] arr1 = {2,3,5,6,8,10};
 * int[] arr2 = {2,4,5,7,8};
 * 
 * 2,5,8
 * 
 */
public class ArrayIntersection {
	
	@Test //Positive
	public void testData1() {
		 int[] arr1 = {2,3,5,6,7,8};
		 int[] arr2 = {2,4,5,7,8};
		 int[] output = new int[] {2,5,7,8};
		 System.out.println("testing");
		 findIntersection(arr1,arr2);
		 Assert.assertArrayEquals(findIntersection(arr1, arr2), output);
	}
	
	/*
	 * Get two pointers for 2 Arrays
	 * Loop the two array in a loop
	 * -- compare the elements
	 * ----If matching--> left++ and right++ store it in a list
	 * ----If left>right --> right++
	 * ----If right>left --> left++
	 * Put values of the list to an array
	 * Return the array
	 */
	
	private int[] findIntersection(int[] arr1, int[] arr2) {
		int left = 0, right = 0;
		List<Integer> lst = new ArrayList<Integer>();
		while(left <= arr1.length-1 || right <= arr2.length-1) {
			if(arr1[left]==arr2[right]) {
				lst.add(arr1[left]);
				left++;
				right++;
			}else {
				if(arr1[left]>arr2[right]) right++;
				else if(arr1[left]<arr2[right]) left++;	 
			}

		}
		int arr[] = new int[lst.size()];
		for(int i=0 ; i<lst.size() ; i++) {
			arr[i] = lst.get(i);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}


	
	

}
