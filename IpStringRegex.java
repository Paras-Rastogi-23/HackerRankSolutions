//program to find whether the input 6 String are valid IP-Address or not

import java.util.Scanner;
import java.util.regex.*;

public class IpStringRegex {

   public static boolean Ip(String s){
        String str[] = s.split("[.]");
        if(str.length != 4)
            return false;
        else
        {
            String S ="";
            for (int i = 0; i < str.length; i++) {
                S = str[i]; char ch = ' '; int num;
                for (int j = 0; j < S.length(); j++) {
                    ch = S.charAt(j);
                    if((int)ch>57 || (int)ch<48)
                        return false;
                }
                num = Integer.parseInt(S);
                if(num>255||num<0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]   s = new String[6];
        Boolean[]  b = new Boolean[6];
        String[] str = ("11.22.31.121").split("[.]");

        for (int i = 0; i < 6; i++) {
            s[i]  = in.nextLine();
            b[i]  = Ip(s[i]);
        }

        for (int j = 0; j < 6; j++) {
            System.out.println(b[j]);
        }

    }
}

