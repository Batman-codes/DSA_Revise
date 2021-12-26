package day3;

import java.util.Arrays;

import org.junit.Test;

public class MaximumAvgSubArray {
	

	@Test //Positive
	public void testData() {
		int nums[] = {1,12,-5,-6,50,3};
		int k = 4;
		getMaxAvgSubArray(nums,k);
	}
//System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, right)));
	
	private void getMaxAvgSubArray(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		int range1 = -1;
		int range2 = -1;
		
		while(right<nums.length) {
			if(right<k-1) sum += nums[right++];
			else {
				if(right==k-1) {
					sum += nums[right];
				} else if(++right<nums.length){
					sum = sum - nums[left++] + nums[right];
				}
				if((sum/k)>max){
					max = sum/k;
					range1 = left;
					range2 = right;

				}
				else if(++right<nums.length){
					sum = sum - nums[left++] + nums[right];
				}
			}
			
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, right)));
		
	}

}
