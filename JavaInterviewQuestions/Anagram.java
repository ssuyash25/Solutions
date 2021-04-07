package helloworld;
import java.util.*;

public class Anagram {
	
	static List<List<String>> find(String arr []) {
        Map<String, List> ans = new HashMap<String, List>();
		for(String s : arr) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if(!ans.containsKey(key))
				ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}
	
	public static void main(String args[]) {
		Anagram ob = new Anagram();
		String arr [] = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> ls = ob.find(arr);
        System.out.println(ls);
	}
	
}
