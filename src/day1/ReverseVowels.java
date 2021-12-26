package day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

/*
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
 */
public class ReverseVowels {
	
	@Test //Positive
	public void testData1() {
		String s = "rahulDubey";
		Assert.assertEquals(reverseVowelsBruteForce(s), "rehulDubay");
	}
	
	@Test //Edge
	public void testData2() {
		String s = "rahulDUbei";
		Assert.assertEquals(reverseVowelsBruteForce(s), "rihelDUbua");
	}
	
	@Test //Negative
	public void testData3() {
		String s = "ddfdklm";
		Assert.assertEquals(reverseVowelsBruteForce(s), "ddfdklm");
		
	}
	
	/*
	 * Traverse through the String in reverse order
	 * --Pick each element and if it is a vowel, then store it in an array
	 * Create a StringBuilder variable and assign the string to it
	 * Traverse through the String from beginning
	 * --If character matches the vowel, then replace it with character from array, also increase array index count
	 * Return the string (StringBuilder)
	 */
	//BruteForce
	private String reverseVowelsBruteForce(String s) {
		List<Character> vowels = new ArrayList<>();
		StringBuilder newS = new StringBuilder();
		int index = 0;
		for(int i=s.length()-1 ; i>=0 ; i--) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
			   s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') vowels.add(s.charAt(i));
		}
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
			   s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				newS.append(vowels.get(index));
				index++;
			}
			else newS.append(s.charAt(i));
		}
		s = newS.toString();
		return s;
	}
}
