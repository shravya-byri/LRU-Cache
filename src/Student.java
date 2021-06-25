public class Student {
    String name;
    int roll;
    int marks;
    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public void printDetails() {
        System.out.println("Student Details");
        System.out.println("Name : " + this.name);
        System.out.println("Roll: " + this.roll);
        System.out.println("Marks: " + this.marks);
    }
}