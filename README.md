# ExamEase - College Examination Management System

## 1. Project Title

**ExamEase - College Examination Management System**

---

## 2. Project Overview

ExamEase is a console-based College Examination Management System developed using Java.

The purpose of the project is to simplify basic examination management activities by providing a single system for managing student records, examination details, and examination seating allocation.

The system follows a menu-driven approach where the administrator can select different operations from the main menu.

ExamEase demonstrates the practical application of Java programming concepts such as Object-Oriented Programming, inheritance, polymorphism, collections, exception handling, and file handling.

The system also generates a text file containing the seating arrangement after successful seat allocation.

---

## 3. Features

### 3.1 Student Management

The Student Management module provides the following operations:

- Add a new student.
- View all registered students.
- Search for a student using Student ID.
- Delete a student.
- Detect duplicate Student IDs.
- Handle cases where a requested student does not exist.

Student information includes:

- Student ID
- Student Name
- Program
- Semester
- Section

---

### 3.2 Exam Management

The Exam Management module provides the following operations:

- Add a new examination.
- View all examinations.
- Search for an examination using Exam ID.
- Delete an examination.
- Detect duplicate Exam IDs.
- Handle cases where a requested examination does not exist.

Examination information includes:

- Exam ID
- Subject
- Date
- Time
- Duration

---

### 3.3 Seating Allocation

The Seating Allocation module is used to assign examination seats to students.

The system:

- Allows the administrator to select an examination.
- Accepts the number of available seats.
- Checks whether enough seats are available.
- Automatically assigns sequential seat numbers.
- Generates seat numbers such as A01, A02, A03, etc.
- Prevents allocation when available seats are insufficient.
- Displays the seating arrangement.
- Saves the seating arrangement into a text file.

Example:

```text
Student ID    Seat Number
--------------------------------
25BAI11016    A01
25BAI11017    A02
25BAI10537    A03
