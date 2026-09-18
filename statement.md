# ExamEase - Project Statement

## 1. Problem Statement

Managing college examinations involves maintaining student records, examination details, and seating arrangements. When these activities are handled manually, maintaining accurate records and preparing seating arrangements can become time-consuming and may lead to errors.

ExamEase is developed as a simple console-based College Examination Management System to organize these basic examination activities in one application.

The system allows an administrator to manage student records, manage examination details, and automatically allocate examination seats based on the number of available seats.

---

## 2. Scope of the Project

The scope of ExamEase is limited to the basic management of college examination-related information.

The project includes the following activities:

### Student Management

- Adding student records.
- Viewing all student records.
- Searching for a student using Student ID.
- Deleting student records.
- Detecting duplicate Student IDs.

### Exam Management

- Adding examination records.
- Viewing examination records.
- Searching for an examination using Exam ID.
- Deleting examination records.
- Detecting duplicate Exam IDs.

### Seating Allocation

- Selecting an examination for seating allocation.
- Entering the available number of seats.
- Checking whether sufficient seats are available.
- Automatically assigning sequential seat numbers.
- Displaying the generated seating arrangement.
- Saving the seating arrangement to a text file.

The current project is a console-based Java application and focuses on demonstrating the implementation of core Java programming concepts through a practical examination management problem.

---

## 3. Target Users

The primary target user of ExamEase is:

### College Examination Administrator

An examination administrator can use the system to:

- Maintain student information.
- Maintain examination information.
- Search and remove records.
- Allocate examination seats.
- Generate and save seating arrangements.

The application is intended for basic small-scale examination management rather than complete institutional examination administration.

---

## 4. High-Level Features

### 4.1 Student Management

The system provides a dedicated module for managing student records.

Main operations:

- Add Student
- View Students
- Search Student
- Delete Student

---

### 4.2 Exam Management

The system provides a dedicated module for managing examination records.

Main operations:

- Add Exam
- View Exams
- Search Exam
- Delete Exam

Examination information includes:

- Exam ID
- Subject
- Date
- Time
- Duration

---

### 4.3 Automatic Seating Allocation

The system automatically assigns sequential seat numbers to students for a selected examination.

For example:

```text
Student ID     Seat Number
--------------------------
25BAI11016     A01
25BAI11017     A02
25BAI10537     A03
