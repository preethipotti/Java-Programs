package assignment4;

class Factorial {
    static void findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void main(String[] args) {
        findFactorial(5);
    }
}