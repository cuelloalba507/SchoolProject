import java.util.Random;

public class SchoolProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        System.out.println("Random number between 1 and 100: " + randomNum);
    }
}
