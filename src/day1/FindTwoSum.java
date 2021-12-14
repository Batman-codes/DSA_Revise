package day1;
import java.util.Arrays;

import org.junit.Assert;
//Given an array of integers and a target, find the any 2 distinct indices whose sum is equal to the target
import org.junit.Test;

public class FindTwoSum {
	
	@Test //Positive
	public void testData1() {
		int nums[] = {2,3,7,4,5,11};
		int target = 10;
		System.out.println(Arrays.toString(nums));
	}
	
	@Test //Edge
	public void testData2() {
		int nums[] = {2,3,1,5,4,11,0};
		int target = 5;
		System.out.println(Arrays.toString(nums));
	}
	
	@Test //Negative
	public void testData3() {
		Object nums[] = {2,3,7,4,5,11};
		int target = 20;
		System.out.println(Arrays.toString(nums));
	}
	
	//Pseudo Code
	/*
	 * Traverse through the array and pick each element one by one
	 * For each element again traverse through the array and pick next elements one by one
	 * Add 2 elements and compare to the target
	 * -- If it matches --> Store the indices in a new array and then in the object array
	 * -- If does not match --> ignore
	 * Return the array
	 */
	
	//BruteForce approach
	private int[] getTwoSumIndices(int[] nums, int target) {
		
		int output[] = new int[2];
		for(int i=0 ; i< nums.length-1 ; i++) { 	//Traverse through the array and pick each element one by one
			
			for(int j=i+1 ; j<nums.length ; j++) {
				if((nums[i] + nums[j]) == target) {
					output[0] = nums[i];
					output[1] = nums[j];
					break;
				}
			}
		}
		return output;
	}

}
