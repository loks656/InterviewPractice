public class firstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        if(nums==null || nums.length==0) return arr;
        int left_most = binSearch(0,nums.length-1,true,nums,target);
        if(left_most==0 && nums[0]!=target) return arr;
        int right_most = binSearch(0,nums.length-1,false,nums,target)-1;
        arr[0]=left_most;
        arr[1]=right_most;
        return arr;
    }
    private int binSearch(int low,int high,boolean left, int nums[],int target){
        while(low<=high){
            int mid= low + (high-low)/2;
            if(target>nums[mid])
                low=mid+1;
            else if(target<nums[mid])
                high=mid-1;
            else
            {
                if(left)
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return low+1;
    }
}
