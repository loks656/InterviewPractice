public class strictlyDecreasing {
    public boolean checkPossibility(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                System.out.println("i==0 condition checked");
                if(nums[i]>nums[i+1])
                {
                    nums[i]=nums[i+1];
                    System.out.println("I'm here");
                    return isGreater(nums);
                }
            }
            else{
                System.out.println("i value in else"+ i);
                if(nums[i]<nums[i-1])
                {

                    nums[i]=nums[i-1];
                    System.out.println(nums[i]+"i-1:"+nums[i-1]);
                    return isGreater(nums);
                }
            }
        }

        return true;
    }

    boolean isGreater(int nums[]){
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                return false;
        }
        return true;
    }
}
