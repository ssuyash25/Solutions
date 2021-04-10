package helloworld;

public class Palin {
	
	boolean isPalin(int n){
		int b = 0;
		int a = n;
		while(a> 0) {
			b = (b *10) + (a % 10);
			a = a/10;
		}
		if(b == n)
		return true;
		return false;
	}

	public static void main(String args[]) {
 
		Palin ob = new Palin();
        boolean i = ob.isPalin(2002);

        System.out.println(i);
	}
	
}
