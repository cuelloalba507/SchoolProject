public class SimpleRepository {
    private int id;
    private String name;

    public SimpleRepository(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Example method to demonstrate functionality

    public void addStudent(Student student) {
        // Add student logic here
    }

    public void removeStudent(String studentId) {
        // Remove student logic here
    }

    public List<Student> getStudents() {
        // Get students logic here
        return students;
    }

    // Example method to demonstrate functionality

    public Student findStudentById(int id) {
        // Find student by ID logic here
        return student;
    }
}
