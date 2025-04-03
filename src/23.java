public class SimpleRepository {
    private List<String> students;

    public SimpleRepository(List<String> students) {
        this.students = students;
    }

    public String addStudent(String name) {
        if (students == null || students.isEmpty()) {
            return "No students yet.";
        }
        students.add(name);
        return "Student added successfully: " + name;
    }

    public String removeStudent(String name) {
        if (students == null || students.isEmpty() || !students.contains(name)) {
            return "No student with that name.";
        }
        students.remove(name);
        return "Student removed successfully: " + name;
    }

    public List<String> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        SimpleRepository repository = new SimpleRepository(students);

        System.out.println(repository.addStudent("Alice"));
        System.out.println(repository.addStudent("Bob"));

        System.out.println(repository.removeStudent("Alice"));
        System.out.println(repository.removeStudent("Charlie"));

        System.out.println(repository.getStudents());
    }
}
