package day4;

import java.util.HashMap;

import org.junit.Test;

/*
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter 
 * in pattern and a non-empty word in s.
 */
public class FindPattern {
	
	@Test
	public void testData1() {
		String pattern = "abba", s = "dog cat dog dog";
		System.out.println(wordPattern(pattern,s));
	}
	
	/*
     * Hashing PsuedoCode
     *
     * Pattern -> Character (Key) : String (Value) && 
     * Data -> String (Key) : Character (Value)
     * 
     * Iterate through each word of String and corresponding character in Pattern
     *     1) If it is new (no entry) on both -> add to the respective map 
     *  2) If the character is not there but String in map -> return false
     *  3) If the character is there in map, then get the corresponding value & compare
     *      a) If it is not same as expected -> return false
     *  
     *  If all above conditions passed through then return true
     */

	private boolean wordPattern(String pattern, String s) {
		
		char[] patternArr = pattern.toCharArray();
		String[] sArr = s.split(" ");
		if(patternArr.length != sArr.length) return false;
		HashMap<Character,String> patternMap = new HashMap<Character,String>();
		HashMap<String,Character> sMap = new HashMap<String,Character>();
		
		
		boolean match = true;
		for(int i=0 ; i<pattern.length() ; i++) {
			if((patternMap.containsKey(patternArr[i]) && sMap.containsKey(sArr[i]))) {
				if(!patternMap.get(patternArr[i]).equals(sArr[i])) {
					match = false;
					break;
				}
			}
			else {
				if(patternMap.containsKey(patternArr[i])) {
					match = false;
					break;
				}else if(sMap.containsKey(sArr[i])) {
					match = false;
					break;
				} else {
					patternMap.put(patternArr[i], sArr[i]);
					sMap.put(sArr[i], patternArr[i]);
				}
				
			}
		}

		return match;
		
		
	}

}
