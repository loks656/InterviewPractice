public class searchInRotatedArray {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        if(nums.length==1)
        {
            if(nums[0]==target)
                return 0;
            else
                return -1;
        }

        int min_index=findMin(nums);
        System.out.println(min_index);
        if(min_index==-1)
            return -1;
        int low=0, high=min_index-1;
        int find1 = binSearch(nums,0,high,target);
        System.out.println(find1);
        if(find1!=-1)
            return nums[find1];
        else
            find1=binSearch(nums,high+1,nums.length-1,target);
        System.out.println(find1);
        if(find1!=-1)
            return nums[find1];
        return -1;

    }

    int findMin(int nums[]){
        if(nums==null || nums.length==0)
            return -1;
        if(nums.length==1)
            return 0;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<nums[(mid+1)%nums.length] && nums[mid]<nums[(mid+nums.length-1)%nums.length])
                return mid;
            else if(nums[mid]>nums[high])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    int binSearch(int arr[],int l,int r,int x){
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}
//{4,5,6,7,0,1,2}
// [0,6,3], nums[3]=7, nums[mid]>nums[low]&& nums[mid]>nums[high], low=mid+1
// [4,6,5], nums[5]=1, nums[mid]>nums[low]&& nums[mid]<nums[high], high=mid-1
// [4,4,4], nums[4]=0, nums[mid]<nums[mid+1] && nums[mid]<nums[mid-1], return 4

//{6,7,0,1,2,4,5}
// [0,6,3], nums[3]=1 <low, <high => high=mid-1
// [0,2,1], nums[1]=7 >low, >high => low=mid+1
// [2,2,2],

// {7,0,1,2,4,5,6}
//[0,6,3], nums[3]=2, <low, <high => high=mid-1
//[0,2,1], nums[1]=0, end

// {0,1,2,4,5,6,7}
//[0,6,3], nums[3]=4, >low, <high => high=mid-1
// [0,2,1], nums[1]=1, >low, <high => high=mid-1
//[0,0,0], end;

//{2,4,5,6,7,0,1}
//[0,6,3], nums[3]=6, >low, >high => low=mid+1;
//[4,6,5], nums[5]=0 end;