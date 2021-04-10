package helloworld;

public class InsertionSort {
	
	int[] sort(int [] a) {
		for(int i=0; i<a.length; i++) {
			int current = a[i];
			int tobeSorted = -1;
			for(int j=i; j >= 0; j--) {
				if(current < a[j]) {
					System.out.println(a[i]);
					tobeSorted = j;
				}
			}
			if(tobeSorted != -1) {
				a[i] = a[tobeSorted];
				a[tobeSorted] = current;
			}
			//System.out.println(a[i]);
		}
		return a;
	}
	
	public static void main(String args[]) {
		InsertionSort ins = new InsertionSort();
		int a [] = {3,2,8,6,4};
		a = ins.sort(a);
		for(int i=0; i< a.length; i++) {
		System.out.println(a[i]);
		}
	}
}
