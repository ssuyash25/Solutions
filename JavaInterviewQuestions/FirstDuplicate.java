package helloworld;

//Google
//Return the first duplicate, if no duplicates return -1
//Constrains : N : size of array, Array elements between 1 and N



public class FirstDuplicate {

	//O(n)
	static int duplicate(int a[]){
	 for(int i=0; i<a.length; i++){
		 int m = Math.abs(a[i]);
	     a[m-1] = -1 * a[m-1];
	 }
	 for(int i=0; i<a.length; i++){
	    if(a[i] > 0)
	    return a[i]; // Return first positive integer
	 }
	 return -1;
	}
	
	public static void main(String args[]) {
		int a[] ={1,2,1,2,3,3};
		int x = duplicate(a);	
		System.out.println(x);
		int b [] = {2,3,1,5,3,2};
		int y = duplicate(b);
		System.out.println(y);
	}

	
	
}
