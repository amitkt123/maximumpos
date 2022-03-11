// Program to check parity of 1's.
// if even parity- return 0 else return 1;

import java.util.Scanner;

public class max {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result =0;
        while(x!=0)
        {
            result = result^(x&1);
            x = x>>1;
        }
        System.out.println(result);
    }

}
