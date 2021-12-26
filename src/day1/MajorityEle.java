package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class MajorityEle {
	
	@Test //Positive
	public void testData1() {
		int nums[] = {11,11,2,11,7};
		int n = nums.length;
		Assert.assertEquals(findMajorityElement(nums,n), 11);
		Assert.assertEquals(findMajorityElement(nums), 11);
	}
	@Test //Edge
	public void testData2() {
		int nums[] = {10,10};
		int n = nums.length;
		Assert.assertEquals(findMajorityElement(nums,n), 10);
		Assert.assertEquals(findMajorityElement(nums), 10);
	}
	//@Test //Negative
	public void testData3() {
		int nums[] = {7,7,2,7,7,3,2,5,12,9};
		int n = nums.length;
		Assert.assertEquals(findMajorityElement(nums,n), -1);
		Assert.assertEquals(findMajorityElement(nums), -1);
	}
	
	/*
	 * Traverse through the array and pick each element
	 * --Check if that element exist in Hashset, if not then
	 * ----Traverse through the next elements of the array
	 * ------compare the two elements-->If matches- increase the count.
	 * --Also check if count>majorityCount
	 * ----majority==element
	 * --count==0
	 * Return the element
	 */
	//Brute Force
	private int findMajorityElement(int[] nums, int n) {
		int major = -1;
		Set<Integer> elements = new HashSet<>();
		int count;
		int majorityCount = n/2;
		for(int i=0;i<nums.length-1;i++) {
			count = 0;
			if(elements.add(nums[i])) {
				for(int j=i+1 ; j<nums.length ; j++) {
					if(nums[i]==nums[j]) count++;
				}
				if(count>=majorityCount) {
					major = nums[i];
				}
			}
		}

		return major;
	}
	
	//Optimize using sorting -->Will not work for negative scenario
    private int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
	

}
