import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10);
        System.out.println("The generated number is: " + randomNum);
    }
}