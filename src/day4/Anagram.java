package day4;

import java.util.HashMap;

import org.junit.Test;

public class Anagram {

	@Test
	public void testData1() {
		String s = "cbaebabacd";
		String p = "abc"; //anagram
		findAllAnagrams(s,p);
	}
	
	// Algorithm : Sliding Window with HashMap
	
	/*
	 * Get length of both strings - s and p
	 * Create 2 HashMaps for - s and p
	 * Traverse through p and add all characters with count in HashMap
	 * Traverse through s (use for loop with right moving)
	 * -- Add all the characters with count in HashMap
	 * -- If i>=pLength
	 * 		-- Check occurrence of first character (i-pLenth) 
	 * 			-- if occurrence ==1 -> remove the character
	 * 			-- if occurrence > 1 -> reduce the occurrence by 1
	 * -- compare 2 HashMaps --> if matching, print "Matches", 
	 */

	private void findAllAnagrams(String s, String p) {
		
		int pLength = p.length(), sLength = s.length();
		HashMap<Character,Integer> pMap = new HashMap<Character,Integer>();
		HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
		
		for(int i=0 ; i<pLength ; i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
		
		for(int i=0 ; i<sLength ; i++) {
			
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			if(i>=pLength) {
				if(sMap.get(s.charAt(i-pLength))==1) {
					sMap.remove(s.charAt(i-pLength));
				} else {
					sMap.put(s.charAt(i-pLength), sMap.get(s.charAt(i-pLength))-1);
				}
			}
			if(i>=pLength && sMap.equals(pMap)) System.out.println("Matches");
		}
	}
}
