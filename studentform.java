import java.io.*;
import java.util.Scanner;

public class StudentAdmissionForm 
{
    public static void main(String[] args) 
    {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Student Admission Form");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Course: ");
            scanner.nextLine(); // Consume newline character
            String course = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            // Write data to file
            FileWriter fileWriter = new FileWriter("student_data.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Name: " + name);
            printWriter.println("Age: " + age);
            printWriter.println("Course: " + course);
            printWriter.println("Address: " + address);
            printWriter.close();

            System.out.println("Student data saved successfully!");
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
