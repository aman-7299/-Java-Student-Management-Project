package Features;

import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                if (choice == 1) {
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    manager.add(marks, name, roll);

                } else if (choice == 2) {
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    manager.find(name);

                } else if (choice == 3) {
                    System.out.println("Exiting program...");
                    break;

                } else {
                    System.out.println("Invalid option!");
                }
            } catch (InvalidMarksException | StudentNotFoundException | IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
