import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Student class
    static class Student {
        int rollNumber;
        String name;
        String grade;

        public Student(int rollNumber, String name, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
        }

        public void displayInfo() {
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name   : " + name);
            System.out.println("Grade  : " + grade);
        }
     
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();  // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    Student student = new Student(roll, name, grade);
                    studentList.add(student);
                    System.out.println("Student added successfully!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
