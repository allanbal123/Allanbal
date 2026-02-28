class Student {
    String name;
    int grade;
    int section;

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
    }
}

public class swsix {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Amethyst Celestial";
        s1.grade = 10;
        s1.section = 11;

        try {
            s1.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("Error: Student object is null");
        }
    }
}