package day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * 1  Given sorted integer array in non-decreasing order, 
 * return the  array of the squares of each number sorted in non-decreasing order
 * 
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
	 * Initialize left and right indices
	 * Use while loop to traverse through the array from start and end
	 * -- Find the square of element and save it in same index position
	 */
	
	private int[] getSquaredArray(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			nums[left] = nums[left]*nums[left];
			nums[right] = nums[right]*nums[right];
			left++;
			right--;
		}
		if(left==right) {
			nums[left] = nums[left]*nums[left];
		}
		Arrays.sort(nums);
		return nums;
	}

}
