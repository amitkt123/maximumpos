import java.util.Scanner;

public class nes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        int zero_count =0;
        for(int i=0;i< size; i++)
        {
            if(arr[i]==0)
                zero_count++;
        }
        int n = size;
        int count = (n*(n+1)/2)-zero_count;
        System.out.println(count);
    }
}
