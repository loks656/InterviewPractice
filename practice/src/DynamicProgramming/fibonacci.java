package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {
    public int fibonacii_rec(int num){
        if(num==1 || num==2){
            return 1;
        }
        int i = fibonacii_rec(num-1) + fibonacii_rec(num-2);
        return i;
    }
    public int fibonacci_dp(int num){
        int a=0,b=1,c=0;
        for(int i=1;i<num;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();

        fibonacci obj =new fibonacci();
        System.out.println(obj.fibonacci_dp(5));
    }
}

// 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862
// 1, 1,
