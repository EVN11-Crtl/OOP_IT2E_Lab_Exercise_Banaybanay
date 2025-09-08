public class StudentTester {
    public static void main(String[] args) {
        // Student with full details
        Student s1 = new Student("Rikardson Evan Banaybanay", "2023-0702", "BSIT", "2rd Year");

        // Student with default values
        Student s2 = new Student();

        // Display student info
        s1.displayInfo();
        s2.displayInfo();
    }
}
