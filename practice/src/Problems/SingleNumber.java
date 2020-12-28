package Problems;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums==null)
            throw new NullPointerException();
        if(nums.length==0)
            return -1;
        if(nums.length==1)
            return nums[0];
        
        return -1;
    }
}
// [1,1,2]
// [1,4,1,2,2]