package DynamicProgramming;

import java.util.Arrays;

public class CatalanNumbers {
    public int catalan_dp(int n){
        int arr[] = new int[n+2];
        arr[0]=1;
        arr[1]=2;

        for(int i=2;i<arr.length;i++){
            for(int j=0;j<i;j++){
                arr[i]=arr[i]+arr[j]*arr[n-i-1];
            }
        }
        int bot_up[][] = new int[10][10];
        Arrays.fill(bot_up,-1);
        System.out.println();
        return arr[n];
    }
}