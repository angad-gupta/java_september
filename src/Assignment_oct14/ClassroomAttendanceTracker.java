package Assignment_oct14;

import java.util.Scanner;


public class ClassroomAttendanceTracker {

    // Array to store the names of students present in class
    static String[] students;
    static int studentCount;

    // Method to check if a student attended the class
    public static boolean checkAttendance(String studentName) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equalsIgnoreCase(studentName)) {
                return true; // Student was present
            }
        }
        return false; // Student was not present
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students present
        System.out.print("Enter the number of students present: ");
        studentCount = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Initialize the array to hold the names of students
        students = new String[studentCount];

        // Input the names of students who attended the class
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        // Allow the user to check attendance
        System.out.print("Enter the name of the student to check attendance: ");
        String studentName = scanner.nextLine();

        // Check if the student attended the class
        if (checkAttendance(studentName)) {
            System.out.println(studentName + " attended the class.");
        } else {
            System.out.println(studentName + " did not attend the class.");
        }


    }
}

