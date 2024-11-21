package Recursion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class revArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        rev(0,n,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int i,int n,int[] arr){
        if(i>=n/2) return;
        //i>=n/2 works coz n is the length and i is the index;
        //otherwise the thought that i>n/2 would be correct

        //swap i , n-i-1
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        rev(i+1,n,arr);
    }
}
