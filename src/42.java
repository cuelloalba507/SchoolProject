public class SimpleRepository {
    private String name;

    public SimpleRepository(String name) {
        this.name = name;
    }

    // Example method that demonstrates how to use the repository
    public void performOperation() {
        System.out.println("Performing operation in " + name);
    }
}
