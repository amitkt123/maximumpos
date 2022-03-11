import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class bitcompression {
    public static int compressBits(int[] A) {
        for(int i=0; i< A.length-1; i++)
        {
            int j=i+1;
            int temp =A[i];
            A[i]= A[i]&A[j];
            A[j]= A[i]|A[j];
        }
        System.out.println(Arrays.toString(A));
        int result = 0;
        for(int i=0; i< A.length; i++) {
            result = result^A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i< size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = compressBits(arr);
        System.out.println(x);
    }
}
