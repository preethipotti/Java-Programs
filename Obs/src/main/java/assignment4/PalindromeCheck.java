package assignment4;

class PalindromeCheck {
    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    static void checkPalindrome(int num) {
        int rev = reverseNumber(num);
        if (num == rev)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }

    public static void main(String[] args) {
    	checkPalindrome(121);
    }
}