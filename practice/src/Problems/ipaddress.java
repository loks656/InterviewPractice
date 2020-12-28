package Problems;

public class ipaddress {
    public String defangIPaddr(String address) {
        String temp = "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                temp = temp.concat("[.]");
                stringBuilder.append("[.]");
            }
            else
            {
                stringBuilder.append(address.charAt(i));
                temp = temp.concat(String.valueOf(address.charAt(i)));
            }
        }
       String temp1 = stringBuilder.toString();
        System.out.println(temp);
        System.out.println(temp1);
        return temp1;
    }
}
