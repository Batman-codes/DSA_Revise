package day1;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

import org.junit.*;


public class MaxOnes {
	
	@Test //Positive
	public void testData1() {
		int nums[] = {1,0,1,1,0,0,1,1,1,0};
		Assert.assertEquals(findMaxOnesBrute(nums), 3);
	}

	@Test //Edge
	public void testData2() {
		int nums[] = {1,1,1,1,1,1,1};
		Assert.assertEquals(findMaxOnesBrute(nums), 7);
	}
	
	@Test //Negative
	public void testData3() {
		int nums[] = {0,0,0,0,0};
		Assert.assertEquals(findMaxOnesBrute(nums), 0);
	}
	
	/*
	 * Traverse through the array and pick each element (for loop)
	 * --If element is 1 then increase counter by 1
	 * --If element is zero --> 1. make counter=0
	 * --if count > maxCount, assign counter to MaxCount
	 * Return MaxCount
	 */
	
	//Brute Force
	private Object findMaxOnesBrute(int[] nums) {
		int counter = 0;
		int maxCount = 0;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]==1) counter++;
			else counter = 0;
			if(counter>maxCount) maxCount = counter;
		}
		return maxCount;
	}
	//Optimized
	private Object findMaxOnesOptimize(int[] nums) {
		if(nums[0]==1 && nums.length==1) return 1;
		else if(nums.length==0) return 0;
		int counter = 0;
		int maxCount = 0;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]==1) counter++;
			else counter = 0;
			if(counter>maxCount) maxCount = counter;
		}
		return maxCount;
	}

}
