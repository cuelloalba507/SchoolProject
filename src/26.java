public class SimpleCodeGenerator {

    private static final int MAX_LENGTH = 100;

    public void generateRandomString() {
        String randomString = "";
        while (randomString.length() < MAX_LENGTH) {
            int characterIndex = (int)(Math.random() * 'a' - 'A');
            randomString += (char)('a' + characterIndex);
        }
        System.out.println("Generated random string: " + randomString);
    }

    public static void main(String[] args) {
        SimpleCodeGenerator generator = new SimpleCodeGenerator();
        generator.generateRandomString();
    }
}
