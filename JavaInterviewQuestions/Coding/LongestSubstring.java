
import java.util.*;

public class LongestSubstring {

	//Given a string s, find the length of the longest substring without repeating characters.
	static String sub(String s) {
		String longest = "";
		int length = 0;
		char c[] = s.toCharArray();
		int i = 0, j=0;
		List<Character> list = new ArrayList();
		while(i<s.length() && j<s.length()) {
			if(list.contains(c[j])) {
				
				if(list.size() > length) {
					longest = list.toString();
					length = longest.length();
				}
				list.remove(i);
				i++;
			}else {
				list.add(c[j++]);
		}
		}
		return longest;
	}
	
	public static void main(String args[]) {
		LongestSubstring ob = new LongestSubstring();
		System.out.println("Shortest String" + ob.sub("abcabcbb"));
	}
	
}
