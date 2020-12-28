import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int ans=0;

        int arr[] = {1};
        HashSet<Character> jewels = new HashSet();
        for(char c : J.toCharArray()){
            jewels.add(c);
        }
        for(int i=0;i<S.length();i++){
            if(jewels.contains(S.charAt(i))){
                ans++;
            }
        }
        return ans;
    }
}

