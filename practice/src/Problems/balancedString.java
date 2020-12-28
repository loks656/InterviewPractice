package Problems;

public class balancedString {
    public int balancedStringSplit(String s) {
        int balance=0,ans=0;
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(balance==0)
            {
                ans++;
            }
            System.out.println(arr[i]);
            if(arr[i]=='R')
            {
                balance++;
            }
            else
                balance--;
            System.out.println(balance);
        }
        return ans;
    }
}
