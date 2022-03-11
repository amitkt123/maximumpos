import java.util.Arrays;
import java.util.Scanner;
public class subarray {
    public static int solve(int[] A)
    {
        int size =A.length;
        int count = 0;
        for(int i =0; i< size; i++)
        {
            for( int j=i; j< size; j++)
            {
                int result = A[i];
                result= result|A[j];
                if(result==1)
                  count= count+1;
            }
        }
            //System.out.println(count);
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for( int i =0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        int x = solve(arr);
        System.out.println(x);
    }
}
