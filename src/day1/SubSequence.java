package day1;
/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * A subsequence of a string is a new string that is formed from the original string by deleting 
 * some (can be none) of the characters without disturbing the relative positions 
 * of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

import org.junit.*;


public class SubSequence {
	
	@Test //Positive
	public void testData1() {
		String t = "rahuldubey";
		String s = "ald";
		Assert.assertEquals(checkSubSequence(t,s), true);
	}
	
	@Test //Edge
	public void testData2() {
		String t = "aalldd";
		String s = "ald";
		Assert.assertEquals(checkSubSequence(t,s), true);
	}
	
	@Test //Negative
	public void testData3() {
		String t = "asfsadf";
		String s = "";
		Assert.assertEquals(checkSubSequence(t,s), false);
	}
	
	/*
	 * Traverse through the String s and pick each element
	 * --Traverse through the string t and pick each element
	 * ---if it matches--> save the (index of t)+1, next loop will start from here, break
	 * ---if does not match--> skip
	 * ---if reached the last index of t-->return false;
	 * return true
	 */
	
	//BruteForce
	private boolean checkSubSequence(String t, String s) {
		int start = 0;
		if(t.length()==0 || s.equalsIgnoreCase("") || s.length()>t.length()) return false;
		for(int i=0 ; i<s.length() ; i++) {
			for(int j=start ; j<t.length() ; j++) {
				if(s.charAt(i)==t.charAt(j)) {
					start = j+1;
					break;
				}
				if(j==t.length()-1) {
					return false;
				}
			}
		}
		System.out.println(s.length());
		return true;
	}

}
