import java.util.Scanner;

import model.Student;
import model.Exam;
import model.Seat;

import manager.StudentManager;
import manager.ExamManager;

import exception.StudentNotFoundException;
import exception.ExamNotFoundException;
import exception.InsufficientSeatsException;

import util.FileManager;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static StudentManager studentManager = new StudentManager();
    static ExamManager examManager = new ExamManager();

    public static void main(String[] args) {

        int choice;

        System.out.println("==================================================");
        System.out.println("                 EXAMEASE");
        System.out.println("          COLLEGE EXAM MANAGEMENT");
        System.out.println("==================================================");

        do {

            System.out.println();
            System.out.println("=========== MAIN MENU ===========");
            System.out.println("1. Student Management");
            System.out.println("2. Exam Management");
            System.out.println("3. Seating Allocation");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = readInt();

            switch (choice) {

                case 1:
                    studentMenu();
                    break;

                case 2:
                    examMenu();
                    break;

                case 3:
                    seatingAllocation();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Thank you for using ExamEase!");
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }


    // ================= STUDENT MENU =================

    public static void studentMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("====== STUDENT MANAGEMENT ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");

            choice = readInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    studentManager.viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }


    // ================= ADD STUDENT =================

    public static void addStudent() {

        System.out.println();
        System.out.println("---------- ADD STUDENT ----------");

        System.out.print("Enter Student ID: ");
        String id = scanner.next();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Program: ");
        String program = scanner.nextLine();

        System.out.print("Enter Semester: ");
        int semester = readInt();

        scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        Student student = new Student(
                id,
                name,
                program,
                semester,
                section
        );

        studentManager.addStudent(student);

        System.out.println("Student added successfully!");
    }


    // ================= SEARCH STUDENT =================

    public static void searchStudent() {

        System.out.println();
        System.out.println("---------- SEARCH STUDENT ----------");

        System.out.print("Enter Student ID: ");
        String id = scanner.next();

        try {

            Student student = studentManager.searchStudent(id);

            System.out.println();
            System.out.println("Student Found:");
            System.out.println(student);

        } catch (StudentNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }


    // ================= DELETE STUDENT =================

    public static void deleteStudent() {

        System.out.println();
        System.out.println("---------- DELETE STUDENT ----------");

        System.out.print("Enter Student ID: ");
        String id = scanner.next();

        try {

            studentManager.deleteStudent(id);

            System.out.println("Student deleted successfully!");

        } catch (StudentNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }


    // ================= EXAM MENU =================

    public static void examMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("======== EXAM MANAGEMENT ========");
            System.out.println("1. Add Exam");
            System.out.println("2. View Exams");
            System.out.println("3. Search Exam");
            System.out.println("4. Delete Exam");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");

            choice = readInt();

            switch (choice) {

                case 1:
                    addExam();
                    break;

                case 2:
                    examManager.viewExams();
                    break;

                case 3:
                    searchExam();
                    break;

                case 4:
                    deleteExam();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }


    // ================= ADD EXAM =================

    public static void addExam() {

        System.out.println();
        System.out.println("------------ ADD EXAM ------------");

        System.out.print("Enter Exam ID: ");
        String examId = scanner.next();

        scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter Date (DD-MM-YYYY): ");
        String date = scanner.nextLine();

        System.out.print("Enter Time: ");
        String time = scanner.nextLine();

        System.out.print("Enter Duration (minutes): ");
        int duration = readInt();

        Exam exam = new Exam(
                examId,
                subject,
                date,
                time,
                duration
        );

        examManager.addExam(exam);

        System.out.println("Exam added successfully!");
    }


    // ================= SEARCH EXAM =================

    public static void searchExam() {

        System.out.println();
        System.out.println("---------- SEARCH EXAM ----------");

        System.out.print("Enter Exam ID: ");
        String examId = scanner.next();

        try {

            Exam exam = examManager.searchExam(examId);

            System.out.println();
            System.out.println("Exam Found:");
            System.out.println(exam);

        } catch (ExamNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }


    // ================= DELETE EXAM =================

    public static void deleteExam() {

        System.out.println();
        System.out.println("---------- DELETE EXAM ----------");

        System.out.print("Enter Exam ID: ");
        String examId = scanner.next();

        try {

            examManager.deleteExam(examId);

            System.out.println("Exam deleted successfully!");

        } catch (ExamNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }


    // ================= SEATING ALLOCATION =================

    public static void seatingAllocation() {

        System.out.println();
        System.out.println("======== SEATING ALLOCATION ========");

        if (studentManager.getStudents().isEmpty()) {

            System.out.println("No students available.");
            System.out.println("Please add students first.");
            return;
        }

        if (examManager.getExams().isEmpty()) {

            System.out.println("No exams available.");
            System.out.println("Please add an exam first.");
            return;
        }

        System.out.print("Enter Exam ID: ");
        String examId = scanner.next();

        try {

            Exam exam = examManager.searchExam(examId);

            System.out.print("Enter number of available seats: ");
            int availableSeats = readInt();

            if (availableSeats < studentManager.getStudents().size()) {

                throw new InsufficientSeatsException(
                        "Not enough seats available for all students."
                );
            }

            System.out.println();
            System.out.println("Exam: " + exam.getSubject());
            System.out.println("Date: " + exam.getDate());
            System.out.println("Time: " + exam.getTime());

            System.out.println();
            System.out.println("------ SEATING ALLOCATION ------");

            int seatNumber = 1;

            StringBuilder seatingData = new StringBuilder();

            seatingData.append("Exam: ")
                    .append(exam.getExamId())
                    .append("\n");

            seatingData.append("Subject: ")
                    .append(exam.getSubject())
                    .append("\n\n");

            seatingData.append("Student ID\tSeat Number\n");
            seatingData.append("--------------------------------\n");

            for (Student student : studentManager.getStudents()) {

                String seat = String.format("A%02d", seatNumber);

                Seat seatObject = new Seat(
                        student.getId(),
                        seat
                );

                System.out.println(seatObject);

                seatingData.append(student.getId())
                        .append("\t\t")
                        .append(seat)
                        .append("\n");

                seatNumber++;
            }

            FileManager.saveSeating(
                    exam.getExamId(),
                    seatingData.toString()
            );

            System.out.println();
            System.out.println("Seating allocation completed!");
            System.out.println("Seating details saved to file.");

        } catch (ExamNotFoundException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientSeatsException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }


    // ================= SAFE INTEGER INPUT =================

    public static int readInt() {

        while (true) {

            try {

                return Integer.parseInt(scanner.nextLine().trim());

            } catch (NumberFormatException e) {

                System.out.print("Please enter a valid number: ");
            }
        }
    }
}