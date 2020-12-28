package Problems;

import java.util.Stack;

public class decodeString {
    public String decodeString(String s) {
        char c[] = s.toCharArray();
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        int i=0;
        String res= "";
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int count=0;
                while(Character.isDigit(s.charAt(i))){
                    count = 10*count + (s.charAt(i)-'0');
                    i++;
            }
            counts.push(count);
            }
            else if(s.charAt(i)=='[')
            {
                result.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder temp = new StringBuilder(result.pop());
                int counter = counts.pop();
                for(int j=0;j<counter;j++){
                    temp.append(res);
                }
                res = temp.toString();
                i++;
            }
            else
            {
                res=res+s.charAt(i);
                i++;
            }
        }
       return null;
    }
}
//2[a]3[bc]