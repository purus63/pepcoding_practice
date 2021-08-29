package Easy;

import java.util.Scanner;

public class AnyBaseTODecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int ans=0;
        int temp=0,count=0;
        while(n>0)
        {
            temp=n%10;
            n=n/10;
            ans+=temp*Math.pow(b,count++);
        }
        return ans;
    }
}
