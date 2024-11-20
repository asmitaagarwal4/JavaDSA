package Recursion;

import java.util.Scanner;

public class nto1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you would like to print");
        n=sc.nextInt();
        System.out.println(n);
        f(n,n);
    }
    public static void f(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        f(i-1,n);
    }
}
