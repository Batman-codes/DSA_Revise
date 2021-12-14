package day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeros {
	
	@Test //Positive
	public void testData1() {
		int nums[] = {0,1,0,2,7,12};
		Assert.assertTrue(Arrays.equals(movingZeros2(nums), new int[] {1,2,7,12,0,0}));
	}
	
	@Test //Edge
	public void testData2() {
		int nums[] = {0,1,0,2,7,12,0};
		Assert.assertTrue(Arrays.equals(movingZeros2(nums), new int[] {1,2,7,12,0,0,0}));
	}
	
	@Test //Negative
	public void testData3() {
		int nums[] = {0,0,0,0};
		Assert.assertTrue(Arrays.equals(movingZeros2(nums), new int[] {0,0,0,0}));
	}
	
	/* 
	 * Traverse through the array and pick each element (for loop)
	 * Find the count of zeros in the array
	 * Again traverse through the array and pick element one by one (for loop)
	 * --> get an index counter
	 * --> assign each non zero to the index position
	 * --> Also check if the counter is > non zero values than assign 0 for next index positions
	 * Return the array
	 */
	
	//Brute Force
	private static int[] movingZeros1(int[] nums) {
		int count = 0; //To get the count of zeros
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]==0) count++;
		}
		
		if(count==0) return nums; //If there are no zeros in array, return the array
		
		int index = 0; //To assign values to each index of array
		
		//Assign all non-zero values first
		for(int j=0;j < nums.length ; j++) {
			if(nums[j] != 0) nums[index++] = nums[j];
		}
		
		//Assign 0 to rest of the indices position
		for(int i=index ; i<nums.length ; i++) {
			nums[i] = 0;
		}
		
		return nums;
	}
	
	//Optimized code
	private static int[] movingZeros2(int[] nums) {
        int index = 0; //To assign values to each index positing of the array
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]!=0) nums[index++] = nums[i];
		}
		
		if(index==0 || index==nums.length) return nums; //Return if all elements are zero or none of element zero
		
		//Assign 0 to rest of the indices position
		for(int i=index ; i<nums.length ; i++) {
			nums[i] = 0;
		}
		return nums;
	}

}
