package day2;


import org.junit.*;

/*
 * You are given two integer arrays nums1 and nums2, 
 * sorted in non-decreasing order, and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */
public class MergeSort {

	@Test //Positive
	public void testData1() {
		//int nums1 = {1,2,3,0,0,0};
		int[] nums1 = {1,5,6};
		int[] nums2 = {2,2,3};
		int[] output = {1,2,2,3,5,6};
		Assert.assertArrayEquals(mergeArray(nums1,nums2), output);
	}
	
	/* Declare a new array of size m+n
	 * Initialize two pointers to 0,0
	 * traverse through the new array 
	 * --If left<=right -> add left in new array- increment left
	 * ---else -> add right to the new array - increment right
	 */

	private int[] mergeArray(int nums1[],int nums2[]) {
		int[] result = new int[nums1.length + nums2.length];
		int i = 0;
		int left = 0;
		int right = 0;
		while(i<result.length) {
			if( left==nums1.length) result[i++] = nums2[right++];
		    else if(right==nums2.length) result[i++] = nums1[left++];
			     else if(nums1[left]<=nums2[right]) result[i++] = nums1[left++];
				      else result[i++] = nums2[right++];
		} 
		System.out.println(result[3]);
		return result;
	}
}
