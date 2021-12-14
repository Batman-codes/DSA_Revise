package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

//Given the integer array and the target, 
//remove the matching target from the array

//Did we understand the question?
//1. Do we need to create a new array or modify same array--> Same Array
//2. Return the modified array as output
//3. If target is not present, return the same array

public class RemoveTarget {
	//Positive
	@Test 
	public void example1() {
		int arr[] = {2,3,7,11,13};
		int target = 7;
		int output[] = removeTarget(arr, target);
		System.out.println(Arrays.toString(output));
		//output {2,3,11,13}
	}
	
	@Test //Edge
	public void example2() {
		int arr[] = {2,3,11,11,19,13};
		int target = 11;
		//output {2,3,19,13}
	}
	
	@Test //Edge
	
	public void example3() {
		int arr[] = {3,3,3,3,3};
		int target = 3;
		//output {}
	}
	
	@Test //Negative
	public void example4() {
		int arr[] = {2,11,19,13,21};
		int target = 7;
		//output {2,11,19,13,21}
	}
	
	//Psuedo code
	/*
	 * Traverse through the array (for loop)
	 * Compare the element with target element
	 *  -> If matching --> Ignore
	 *  -> If does not match --> Add the element to the list
	 * Put the list to a new array (for loop)
	 */
	
	public int[] removeTarget(int[] nums, int target) {
		
		if(nums.length == 0) return nums; //If the array is empty simply return it
		
		List<Integer> lst = new ArrayList<>();
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i] != target) lst.add(nums[i]);
		}
		int output[] = new int[lst.size()];
		for(int j=0 ; j<lst.size() ; j++) {
			output[j] = lst.get(j);
		}
		
		return output;
	}

}
