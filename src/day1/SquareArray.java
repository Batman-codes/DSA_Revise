package day1;

import java.util.Arrays;

import org.junit.*;

/*
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquareArray {

	@Test //Positive
	public void testData1(){
		int nums[] = {1,2,4,4,7,9};
		int output[] = {1,4,16,16,49,81};
		Assert.assertArrayEquals(getSquaredArray(nums), output);
	}
	
	@Test //Edge
	public void testData2(){
		int nums[] = {-7,-2,1,2,4,4,7,9};
		int output[] = {1,4,4,16,16,49,49,81};
		Assert.assertArrayEquals(getSquaredArray(nums), output);
	}
	
	@Test //Edge
	public void testData3(){
		int nums[] = {};
		int output[] = {};
		Assert.assertArrayEquals(getSquaredArray(nums), output);
	}

	/*
	 * Traverse through the array and pick each element
	 * --Find square of the element and put it in a new Array
	 * Sort the new Array
	 */
	private int[] getSquaredArray(int[] nums) {
		if(nums.length==0) return nums;
		int newNums[] = new int[nums.length];
		for(int i=0 ; i<nums.length ; i++) {
			newNums[i] = nums[i] * nums[i];
		}
		Arrays.sort(newNums);
		return newNums;
	}
}
