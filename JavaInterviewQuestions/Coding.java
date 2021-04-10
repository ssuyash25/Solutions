package helloworld;

public class Coding {
	
	int code(String s){
		int c = 0;
		for(int i=0; i< s.length(); i++) {
			int a = s.charAt(i);
			c = (int) (c * 10+ a-64);
		}		
		return c;
	}

	String deCode(String s){
		String c = "";
		for(int i=0; i< s.length(); i++) {
			char y = (char) (16 + (int) s.charAt(i));
			c = c+y;
		}		
		return c;
	}
	
	public static void main(String args[]) {
		Coding ob = new Coding();
        int result = ob.code("ABCD");
        System.out.println(result);
        String result1= ob.deCode("1234");
        System.out.println(result1);
	}
}
