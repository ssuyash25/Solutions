
public class LargestContiguousSum {
	
	static int max(int a[], int size) {
		int maxSoFar = 0, maxEndingHere = 0;

		for(int i=0; i< size; i++) {
			maxEndingHere += a[i];
			if(maxEndingHere<0)
				maxEndingHere = 0;
			else if(maxSoFar < maxEndingHere )
				maxSoFar = maxEndingHere;
		}
		
		return maxSoFar;
	}

}
