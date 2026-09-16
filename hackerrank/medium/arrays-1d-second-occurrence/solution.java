import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int largest = arr[0];

        for(int i=0;i<n;i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }

        int secLarge=0;

        for(int i=0;i<n;i++) {
            if(arr[i]!=largest && arr[i]>secLarge) {
                secLarge=arr[i];
            }
        }

        int count=0;

        for(int i=0;i<n;i++) {
            if(arr[i]==secLarge) {
                count++;
            }
        }

        System.out.println(count);
    }
}
