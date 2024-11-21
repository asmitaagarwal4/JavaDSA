package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class printSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int n=arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        print(0,list,arr,n);
    }
    public static void print(int i,ArrayList<Integer> list,int[] arr,int n){
        if(i==n){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        print(i+1,list,arr,n);
        list.removeLast();
        print(i+1,list,arr,n);
    }
}
