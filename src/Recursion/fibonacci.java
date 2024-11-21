package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int res = fib(n);
        System.out.println(res);
        for (int i = 0; i <= n; i++) {
            list.add(fib(i));
        }
        System.out.println(list);
    }
    public static int fib(int n) {
        if(n<=1) {
//            System.out.println(1);
            return 1;
        }
        int res = fib(n-1) + fib(n-2);
//        System.out.println(res);
        return res;
    }
}
