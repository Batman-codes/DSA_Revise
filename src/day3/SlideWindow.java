package day3;

import org.junit.Assert;
import org.junit.Test;

public class SlideWindow {
	
	@Test //Positive
	public void testData1() {
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 7;
		findSubArray(nums,k);
		//Assert.assertArrayEquals(findSubArray(nums,k), {});
	}
	
	/*
	 * Traverse through the window
	 * 
	 */

	private void findSubArray(int[] nums, int k) {
		
		int left = 0;
		int right = 0;
		int sum = 0;
		while(left<nums.length || right<nums.length) {
			if(right<nums.length) {
				if(left==right) {
					if(nums[left]==7) {
						System.out.println("Yes " + left + " and " + right);
						sum = 0;
						left++;
						right++;
					}else {
						sum += nums[left] + nums[++right];
					}
				}else {
					if(sum<7) sum += nums[++right];
					else if(sum>7) sum -= nums[left++];
					else if(sum==7) {
						System.out.println("Yo " + left + " and " + right  );
						
						sum = sum - nums[left++] + nums[++right];
					}

				}
			}
		}
		
	}

}
