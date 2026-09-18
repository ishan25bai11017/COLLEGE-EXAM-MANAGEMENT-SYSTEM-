package model;

public class Exam {

    private String examId;
    private String subject;
    private String date;
    private String time;
    private int duration;

    public Exam(String examId, String subject,
                String date, String time, int duration) {

        this.examId = examId;
        this.subject = subject;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public String getExamId() {
        return examId;
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Exam ID: " + examId +
                " | Subject: " + subject +
                " | Date: " + date +
                " | Time: " + time +
                " | Duration: " + duration + " hours";
    }
}