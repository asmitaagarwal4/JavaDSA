package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int fac = 1;
//        fac1(n,fac); //parameterized recursion
        fac=fac2(n); //functional resume
        System.out.println(fac);
        sc.close();
    }
    public static void fac1(int n,int fac){
        if(n==1){
            System.out.println(fac);
            return;
        }
        fac= fac*n;
        fac1(n-1,fac);
    }
    public static int fac2(int n){
        if(n==1){
            return 1;
        }
        return n*fac2(n-1);
    }
}
