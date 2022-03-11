import java.util.Scanner;

public class xbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int x = sc.nextInt();
        int y= x-1;
        int rmsb = 0;
        int x1 = 1<<y;
        System.out.println(x1);
        for(int i =0; i< x; i++) {
            rmsb = num & ~(num - 1);
            if(rmsb>x1)
                break;
            System.out.println(num);
            System.out.println(rmsb);
            num = num - rmsb;
        }
        System.out.println(num);
    }
}
