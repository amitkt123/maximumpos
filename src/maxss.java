import java.util.Scanner;

public class maxss {
    public static int[] solve(int[] A) {
        int result=0;
        for(int i=0; i< A.length; i++)
        {
            result = result^A[i];
        }
        int rmsb = result & ~(result-1);
        int x=0;
        int y=0;
        int[] arry = new int[2];
        for(int i=0; i< A.length; i++)
        {
            if((A[i] & rmsb)==1)
            {
                x = x^A[i];
            }
            if((A[i] & rmsb)==0)
            {
                y = y^A[i];
            }
            arry[0]= x;
            arry[1]= y;
        }
        return arry;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] val = new int[size];
        for( int a: val)
        {
            a = sc.nextInt();
        }
        solve(val);
    }
}