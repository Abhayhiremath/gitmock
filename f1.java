public class Student {

    String name;
    int age;
    double marks;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Abhay";
        s.age = 21;
        s.marks = 85.5;

        s.displayDetails();
    }
}