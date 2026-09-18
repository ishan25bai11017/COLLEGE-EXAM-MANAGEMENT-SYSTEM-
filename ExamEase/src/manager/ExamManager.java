package manager;

import model.Exam;
import exception.ExamNotFoundException;

import java.util.ArrayList;

public class ExamManager {

    private ArrayList<Exam> exams;

    public ExamManager() {
        exams = new ArrayList<>();
    }

    // Add exam
    public void addExam(Exam exam) {

        for (Exam e : exams) {

            if (e.getExamId().equalsIgnoreCase(
                    exam.getExamId())) {

                System.out.println("Exam ID already exists.");
                return;
            }
        }

        exams.add(exam);

        System.out.println("Exam added successfully.");
    }

    // View exams
    public void viewExams() {

        if (exams.isEmpty()) {
            System.out.println("No exams available.");
            return;
        }

        System.out.println("\n========== EXAM SCHEDULE ==========");

        for (Exam exam : exams) {
            System.out.println(exam);
        }
    }

    // Search exam
    public Exam searchExam(String examId)
            throws ExamNotFoundException {

        for (Exam exam : exams) {

            if (exam.getExamId()
                    .equalsIgnoreCase(examId)) {

                return exam;
            }
        }

        throw new ExamNotFoundException(
                "Exam with ID " + examId + " not found."
        );
    }

    // Delete exam
    public void deleteExam(String examId)
            throws ExamNotFoundException {

        Exam exam = searchExam(examId);

        exams.remove(exam);

        System.out.println("Exam deleted successfully.");
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }
}