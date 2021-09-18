package helloworld;
import java.util.*;

public class Frequency {
	
	void times(String s) {
		String a[] = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i =0 ; i< a.length; i++) {
			if (hm.get(a[i]) != null) {
				hm.put(a[i], hm.get(a[i]) +1 );
			}else {
				hm.put(a[i], 1);
			}
			System.out.println(hm.get(a[i]));
		}
	}
	
	public static void main(String args[]) {
		Frequency ob = new Frequency();
        ob.times("This is it The nada The");
	}
}
