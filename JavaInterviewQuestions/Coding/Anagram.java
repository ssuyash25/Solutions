import java.util.*;

public class Anagram {

	// Group all Anagrams together [[eat, tea, ate], [bat], [tan, nat]]
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
		System.out.println(isAnagram("eat", "tea"));
		System.out.println(isAnagram("eat", "die"));
		System.out.println(isAnagramBest("eat", "tea"));
	}


	static boolean isAnagram(String s1, String s2){
		boolean flag = true;
		char c[] = s1.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char ch: c){
			int i = hm.getOrDefault(ch, 0);
			hm.put(ch, i+1);
		}
		char c2[] = s2.toCharArray();
		for(char ch: c2){
			int i = hm.getOrDefault(ch, 0);
			hm.put(ch, i-1);
		}
		for (int count : hm.values()){
			System.out.println(count);
			if(count != 0){
				flag = false;
				break;
			}
		}
		return flag;
	}

	static boolean isAnagram2(String s1, String s2){
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0; i<s1.length(); i++){
			if(c1[i] != c2[i])
				return false;
		}
		return true;
	}


	static boolean isAnagramBest(String s1, String s2){
		int array[] = new int[256];
		Arrays.fill(array,0);
		for(int i=0; i<s1.length(); i++){
			array[s1.charAt(i) - 'a']++;
			array[s2.charAt(i) - 'a']--;
		}
		for(int i = 0; i < 256; i++){
			if (array[i] != 0)
				return false;
			}
		return true;
	}
}
