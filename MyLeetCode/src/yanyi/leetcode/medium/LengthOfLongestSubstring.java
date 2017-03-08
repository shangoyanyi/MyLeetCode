package yanyi.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * @author shangoyanyi
 *
 */
public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		if(s == null){
			return 0;
		}		
		
		char[] _chars = s.toCharArray();
		List<Character> chars = new ArrayList<Character>();
	    for (char c : _chars) {
	        chars.add(c);
	    }
	    
		List<Character> longestSubstring = new ArrayList<Character>();		
		for(int i=0; i<chars.size(); i++){
			List<Character> tempSubstring = new ArrayList<Character>();	
			
			for(int j=i; j<chars.size(); j++){
				
				if(j == chars.size()){					
					if(tempSubstring.size() > longestSubstring.size()){
						longestSubstring = tempSubstring;
					}
					break;					
					
				}else if(tempSubstring.contains(chars.get(j))){
					// let i jump to chars[k] witch has the same character at chars[j]
					for(int k=i; k<j; k++){
						if(chars.get(k) == chars.get(j)){
							i = k;
							break;
						}
					}
					
					if(tempSubstring.size() > longestSubstring.size()){
						longestSubstring = tempSubstring;	
					}
					break;
					
				}else{
					tempSubstring.add(chars.get(j));
					
					if(tempSubstring.size() > longestSubstring.size()){
						longestSubstring = tempSubstring;						
					}
					continue;
				}
			}		
		}	
		
		return longestSubstring.size();			
    }
	
	
	private void printCharacterList(List<Character> list){
		for(Character c: list){
			System.out.print(c);
		}
		System.out.print("\n");
	}
}
