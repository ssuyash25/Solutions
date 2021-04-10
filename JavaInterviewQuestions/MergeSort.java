package helloworld;

public class MergeSort {
	
	 void sort(int arr[], int left, int right) {
		 if(left < right) {
		 int middle = (left+ right)/2;
		 sort(arr, left, middle);
		 sort(arr, middle, left);
		 merge(arr, left, middle, right);
		 }
	 }
 
    // Main function that sorts arr[l..r] using
    // merge()
   void merge(int arr[], int left, int middle,int right) {
	   int n1= middle - left + 1;
	   int n2= right - middle;
	   int l1[] = new int [n1];
	   int l2[] = new int [n2];

	   for(int i =0; i<n1;  i++) {
		   l1[i] = arr[left+i];
	   }
	   for(int j =0; j<n2;  j++) {
		   l2[j] = arr[middle+1+j];
	   }
	   
	   int i =0, j=0;
	   
	   int k =left;

	   while (i < n1 && j < n2) {
           if (l1[i] <= l2[j]) {
               arr[k] = l1[i];
               i++;
           }
           else {
               arr[k] = l2[j];
               j++;
           }
           k++;
       }
	   
	   /* Copy remaining elements of L[] if any */
       while (i < n1) {
           arr[k] = l1[i];
           i++;
           k++;
       }

       /* Copy remaining elements of R[] if any */
       while (j < n2) {
           arr[k] = l2[j];
           j++;
           k++;
       }
       
   }
    
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
	}
	
	
}
