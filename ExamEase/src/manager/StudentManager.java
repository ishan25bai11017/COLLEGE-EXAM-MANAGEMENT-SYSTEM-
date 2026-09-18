package manager;

import model.Student;
import exception.StudentNotFoundException;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {

        for (Student s : students) {

            if (s.getId().equals(student.getId())) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }

    // View all students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n========== STUDENTS ==========");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search student
    public Student searchStudent(String id)
            throws StudentNotFoundException {

        for (Student student : students) {

            if (student.getId().equals(id)) {
                return student;
            }
        }

        throw new StudentNotFoundException(
                "Student with ID " + id + " not found."
        );
    }

    // Delete student
    public void deleteStudent(String id)
            throws StudentNotFoundException {

        Student student = searchStudent(id);

        students.remove(student);

        System.out.println("Student deleted successfully.");
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}