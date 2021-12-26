package day4;

import java.util.HashMap;

import org.junit.*;


public class LongestSubString {

	@Test
	public void testData1() {
		String s = "abccefbcdeghkkkabb";
		//findLongestSubString(s);
		Assert.assertEquals(findLongestSubString(s), 8);
	}
	
	@Test
	public void testData2() {
		String s = "pwwkew";
		//findLongestSubString(s);
		Assert.assertEquals(findLongestSubString(s), 3);
	}
	
	@Test
	public void testData3() {
		String s = "";
		findLongestSubString(s);
		Assert.assertEquals(findLongestSubString(s), -1);
	}
	
	// Algorithm: Sliding Window with HashMap
	
	/* 
	 * Use two pointers left and right --> 0 (or just )
	 * Create a HashMap<Character,Integer>
	 * Traverse through each character of String (using right)
	 * --if character does not exist in hashMap -- Add it with count 1
	 * --else get size of HashMap
	 * ---- if size > max (or right-left+1>max) --> put max = size 
	 * ---- update the index vaue of the duplicate character or left++
	 */

	private int findLongestSubString(String s) {
		if(s.length()==0) {
			return -1;
		}
		HashMap<Character,Integer> subMap = new HashMap<Character,Integer>();
		int max = 0;
		int right = 0;
		int left = 0;
		for( ; right<s.length() ; right++) {
			if(!subMap.containsKey(s.charAt(right))) {
				subMap.put(s.charAt(right), 1);
			}else {
				max = Math.max(max, (right-left)+1);
				if(Character.compare(s.charAt(right), s.charAt(right-1))==0) left = right;
				else {
					max = Math.max(max, (right-left));
					left++;
				}
			}
		}
		
		System.out.println(max);
		return max;
		
	}
}
