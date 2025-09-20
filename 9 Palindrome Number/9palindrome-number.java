import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rem, rev = 0, dup = x;

        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        return rev == dup;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int x = sc.nextInt();

        Solution sl = new Solution();
        System.out.println(sl.isPalindrome(x));

        sc.close();
    }
}
