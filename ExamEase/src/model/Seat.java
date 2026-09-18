package model;

public class Seat {

    private String studentId;
    private String seatNumber;

    public Seat(String studentId, String seatNumber) {
        this.studentId = studentId;
        this.seatNumber = seatNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               "  |  Seat: " + seatNumber;
    }
}