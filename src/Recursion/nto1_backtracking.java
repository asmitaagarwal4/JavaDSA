package Recursion;

import java.util.Scanner;

public class nto1_backtracking {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you would like to print");
        n=sc.nextInt();
        System.out.println(n);
        f(1,n);
    }
    public static void f(int i,int n){
        if(i>n){
            return;
        }
        f(i+1,n);
        System.out.print(i+ " ");
    }
}
