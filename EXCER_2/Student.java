public class Student {
    private String name;
    private String idNumber;
    private String course;
    private String yearLevel;

    // No-argument constructor
    public Student() {
        this.name = "No Name";
        this.idNumber = "No ID";
        this.course = "No Course";
        this.yearLevel = "No Year Level";
    }

    // Parameterized constructor
    public Student(String name, String idNumber, String course, String yearLevel) {
        this.name = name;
        this.idNumber = idNumber;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name       : " + this.name);
        System.out.println("ID Number  : " + this.idNumber);
        System.out.println("Course     : " + this.course);
        System.out.println("Year Level : " + this.yearLevel);
    }
}
