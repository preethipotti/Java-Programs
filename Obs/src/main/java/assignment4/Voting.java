package assignment4;

class Voting {
    static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        int age = 20;
        if (isEligible(age))
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }
}