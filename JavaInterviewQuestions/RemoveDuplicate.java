package helloworld;

// Keep shifting the j when duplicate, shift i when no duplicates
// 0,0,1,1,1,2,2,2,4,3
public class RemoveDuplicate {
	public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int i =0; int j=i+1;
        while(j < l){
            if(nums[i] == nums[j]){
                j++;
            }else{
                int swap = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = swap;
                i++;
                j++;
            }
        }
       return i+1;
    }
}
