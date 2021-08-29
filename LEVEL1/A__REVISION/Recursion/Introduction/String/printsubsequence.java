package LEVEL1.A__REVISION.Recursion.Introduction.String;

import java.util.Scanner;

public class printsubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        printSS(str,"");
    }

    public static void printSS(String str, String ans) {

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        printSS(str.substring(1),ans+str.charAt(0));
        printSS(str.substring(1),ans);
    }
}
