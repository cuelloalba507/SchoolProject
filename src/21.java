public class SimpleRepository {
    private String name;
    private int id;

    public SimpleRepository(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Example method to demonstrate basic functionality
    public void performOperation() {
        System.out.println("Performing operation with repository: " + name);
    }
}
