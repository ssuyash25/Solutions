package helloworld;

public class Test {
	
	int max(int n){
		int i = 2;
		while(i<n) {
			if(n % i == 0) {
				return i;
			}
			i++;
		}
	
	return 1;
	}
	
	
	String reverse(String s) {
		String rv = "";
		String a [] = s.split(" ");
		for(String s1 : a) {
			rv = s1 + " " + rv;
		}
		
		return rv;
	}

	
	public static void main(String args[]) {
		Test ob = new Test();
		//System.out.println(ob.max(24));
		System.out.println(ob.reverse("This is the It"));
		int i =19;
		System.out.println(i%10);
	}
}
