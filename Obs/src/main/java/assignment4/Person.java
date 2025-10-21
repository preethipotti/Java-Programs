package assignment4;

class Person {
    static String name;
    static int age;

    static void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    static void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        setDetails("Preethi", 25);
        getDetails();
    }
}