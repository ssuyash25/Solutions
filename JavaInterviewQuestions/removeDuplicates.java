package helloworld;

public class removeDuplicates {

	int[] rem2(int a[]){
	    int end = a.length -1;
	    for(int i =0; i <= end ; i++){
	        for(int j=i+1; j <= end; j++){
	            if(a[i] == a[j]){
	                int temp = a[end];
	                a[end] = a[j];
	                a[j] = temp;
	                end--;
	                j--;
	            }
	        }
	    }
	    return a.slice(0, end+1)
	}
	
	
}
