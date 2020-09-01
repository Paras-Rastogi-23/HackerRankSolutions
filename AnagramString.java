/**
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 *
 * Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
 *
 * Input Format
 *
 * The first line contains a string denoting .
 * The second line contains a string denoting .
 *
 * Constraints
 *
 * Strings  and  consist of English alphabetic characters.
 * The comparison should NOT be case sensitive.
 * Output Format
 *
 * Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.*/


import java.util.Scanner;

public class AnagramString {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int l1,l2,k = 0,l = 0;
        l1=a.length();
        l2=b.length();

        for (char c='a';c<='z';c++){
             char ch;
             k=0;l=0;

             for (int i=0;i<l1;i++){
                 ch=a.charAt(i);
                 ch=Character.toLowerCase(ch);
                 if(c==ch){
                     k += 1;
                 }
             }

            for (int i=0;i<l2;i++){
                ch=b.charAt(i);
                ch=Character.toLowerCase(ch);
                if(c==ch){
                    l += 1;
                }
            }
            if(k!=l){
                break;
            }
        }
           if(k!=l){
               return false;
           }else{
               return true;
           }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

