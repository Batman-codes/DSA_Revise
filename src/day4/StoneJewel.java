package day4;

import java.util.HashMap;

import org.junit.Test;
/*
 * You're given strings jewels representing the types of stones that are jewels, 
 * and stones representing the stones you have. Each character in stones is a type
 *  of stone you have. You want to know how many of the stones you have are also jewels.
 *  Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class StoneJewel {
	
	@Test
	public void testData1() {
		String jewels = "aA";
		String stones = "aAAbbAb";
		numJewelsInStones(jewels,stones);
		
	}
	
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelArr = jewels.toCharArray(), stoneArr = stones.toCharArray();
        int result = 0;
        HashMap<Character, Integer> jewelMap = new HashMap<Character,Integer>();
        
        for(int i = 0 ; i<jewelArr.length ; i++) {
        	jewelMap.put(jewelArr[i], 0);
        }
        System.out.println(jewelMap.toString());
        for(int i = 0 ; i<stoneArr.length ; i++){
        	if(jewelMap.containsKey(stoneArr[i])) result++;
        }
        
        return result;
    }
    

}
