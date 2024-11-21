package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String st1 = "abcba";
        String st2 = "abcda";
        System.out.println(isPalindrome(st1));
        System.out.println(isPalindrome(st2));
    }
    public static boolean isPalindrome(String st) {
        int n = st.length();
        return(check(0,st,n));
    }
    private static boolean check(int i, String st, int n) {
        if(i>=n/2) return true;
        //checks if we reached the middle then the string is palindrome
        if(st.charAt(i)!=st.charAt(n-i-1)) return false;
        //if any character dosent match its opp char the return false without checking any further
        return check(i+1,st,n);
        //if this char matches its opp then check the next char
    }
}
