package Features;

import java.io.*;
import java.util.*;

public class StudentManager {

    private List<Student> students = new ArrayList<>(); // in-memory storage

    // Add student
    public void add(int marks, String name, int roll) throws InvalidMarksException, IOException, StudentNotFoundException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100");
        } else if (name == null || name.trim().isEmpty()) {
            throw new StudentNotFoundException("Name is empty");
        } else if (roll <= 0) {
            throw new StudentNotFoundException("Invalid roll number");
        }

        Student s = new Student(name, marks, roll);
        s.addFile();      // write to file
        students.add(s);  // store in memory
    }

    // Find student by name
    public void find(String name) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.println("Student Found: Name=" + s.name + ", Roll=" + s.roll + ", Marks=" + s.marks);
                return;
            }
        }
        throw new StudentNotFoundException("Student not found: " + name);
    }
}

