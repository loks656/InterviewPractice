import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class shortestSubArray {
    public int findShortestSubArray(int[] nums) {
        TreeMap<Integer,Integer> hm= new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i]+1));
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int max_int=-999, max_freq=-999;
        int degree = Collections.max(hm.values());
        for(int i : hm.keySet())
        {
            if(hm.get(i)==degree)
            {
                max_int=i;
            }
        }
        int start=-1,end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max_int){
                if(start==-1)
                    start=i;
                else
                    end=i;
            }
        }
        if(end==-1)
            return 1;

        return end-start+1;
    }
}

// Rahul
