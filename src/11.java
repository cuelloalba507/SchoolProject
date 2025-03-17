  import java.util.Random;

public class RandomNumber{
    public static void main(String[] args){
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        System.out.println("Your Random number is :" + randomNum);
        }
}
