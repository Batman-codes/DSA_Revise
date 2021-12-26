package day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Remove the given duplicate in the given array
 */
public class RemoveDuplicate {
	
	@Test //Positive
	public void testData1() {
		int arr[] = {1,3,5,3,7,9};
		int k = 3;
		int output[] = {1,5,7,9};
		int result[] = removeDuplicate(arr,k);
		System.out.println(Arrays.toString(result));
		Assert.assertArrayEquals(result, output);
	}
	
	/*
	 * Take two pointers = 0, left and right
	 * Move left only when element is not k
	 * Move right always
	 * When left == k --> swap right to left, left++
	 */

	private int[] removeDuplicate(int[] arr, int k) {
		int left = 0;
		int right = 0;
		for(; right<arr.length ; right++) {
			if(arr[right]!=k){
				arr[left++] = arr[right];
			}
		}
		
		return Arrays.copyOf(arr, left);
	}

}
