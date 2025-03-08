import java.util.*;
public class RandomCode {
    public static void main(String[] args) {
        // Initialize variables
        int num = 10;
        String str = "hello";
        double pi = 3.14;
        boolean bool = false;

        // Generate random number between 5 and 15
        Random rand = new Random();
        int randomNum = rand.nextInt((15 - 5) + 1) + 5;

        // Print results
        System.out.println("Random number: " + randomNum);
        System.out.println("String: " + str);
        System.out.println("Double: " + pi);
        System.out.println("Boolean: " + bool);
    }
}
