package model;

public class Student extends User {

    private String program;
    private int semester;
    private String section;

    public Student(String id, String name, String program,
                   int semester, String section) {

        super(id, name);

        this.program = program;
        this.semester = semester;
        this.section = section;
    }

    public String getProgram() {
        return program;
    }

    public int getSemester() {
        return semester;
    }

    public String getSection() {
        return section;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public String toString() {

        return "Student ID: " + id +
               ", Name: " + name +
               ", Program: " + program +
               ", Semester: " + semester +
               ", Section: " + section;
    }
}