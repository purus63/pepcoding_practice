package LEVEL1.A__REVISION.Recursion.Introduction;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){

        if(n==0)
            return 1;
        return x*power(x,n-1);

    }

}
