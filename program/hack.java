// hackerranck
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        // Write Your Code Here
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                int tmp=a[j];
                a[j]=a[j+1];
                a[j+1]=tmp;
                swap++;
                 }
            }
            
        }
        System.out.println("Array is sorted in "+swap+"swaps");
           System.out.println("First element: "+a[0]);
           System.out.println("Last element: "+a[n-1]);
    }
    
}