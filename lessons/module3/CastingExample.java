package module3;

public class CastingExample {
    public static void main(String[] args) {
        int integer1 = 5;
        long veryLargeInteger = integer1;

        System.out.println(integer1);
        System.out.println(veryLargeInteger);

        integer1 = (int) veryLargeInteger;
        System.out.println(integer1);
    }
}
