# 🏫 University Course Management System

[![Java](https://img.shields.io/badge/Java-21%2B-blue.svg)](https://www.java.com)

## 📋 Overview

A comprehensive course management system developed as part of the **WIA1002 - Object-Oriented Programming** assignment. This system demonstrates the practical application of **Object-Oriented Programming (OOP) principles**, **Generics**, and **Abstract Data Type (ADT) design** in Java to build a functional university course management application.

## 🎯 Features

- **Course Management**: Handle both Lecture-based and Lab-based courses
- **Instructor Assignment**: Track instructors for each course
- **Workload Calculation**: Automatically calculate semester workload for different course types
- **Generic Course Manager**: Type-safe course collection using Java Generics
- **Sorting & Search**: Find courses with the highest workload and sort by workload

## 📚 Course Types

### Lecture Course
- Weekly lecture hours
- Workload = `lectureHours × 14 weeks`

### Lab Course  
- Lab hours per session
- Number of sessions per week
- Workload = `labHours × sessions × 14 weeks`

## 🚀 Getting Started

### Prerequisites
- Java JDK 21 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Compilation & Execution

```bash
# Compile all Java files
javac *.java

# Run the application
java Main
```

--- 
## Sample Usage

```
// Create courses
LectureCourse cs101 = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3);
LabCourse cs101L = new LabCourse("CS101L", "Programming Lab", "Dr. Smith", 2.5, 2);

// Create manager and add courses
CourseManager<Course> manager = new CourseManager<>();
manager.addCourse(cs101);
manager.addCourse(cs101L);

// Find the course with the highest workload
Course highest = manager.getCourseWithHighestWorkload();

// Sort courses by workload
manager.sortCoursesByWorkload();

// Remove a course
manager.removeCourse("CS101");
```
---
## 💡 Key OOP Concepts Demonstrated
- Concept	Implementation
- Encapsulation	Private fields with public getter methods
- Abstraction	Course interface defining the contract
- Inheritance	Classes implementing the Course interface
- Polymorphism	CourseManager<T extends Course> using generics
- ADT Design	Course interface as an Abstract Data Type

--- 
## 📊 Sample Output
```
=== UNIVERSITY COURSE MANAGEMENT SYSTEM ===

--- Adding Courses to Manager ---
Added: CS101 - Introduction to Programming
Added: CS101L - Programming Lab

--- Course with Highest Workload ---
Course: Programming Lab (CS101L)
Total Workload: 70 hours

--- Sorting Courses by Workload ---
1. CS101 - 42 hours
2. CS101L - 70 hours

--- Removing a Course ---
Removed: CS101 - Introduction to Programming
Remaining courses: 1
```

---
## 🧪 Testing
The Main class demonstrates:
- Creating multiple course objects
- Adding courses to the manager
- Finding highest workload course
- Sorting courses by workload
- Removing a course by code
- Displaying remaining courses

## 📁 Repository Structure
```
├── Course.java              # ADT interface
├── LectureCourse.java       # Lecture course implementation
├── LabCourse.java          # Lab course implementation  
├── CourseManager.java      # Generic course manager
├── Main.java               # Testing and demonstration
├── README.md               # This file
└── ANSWERS.md              # Multiple choice answers (Task 2)
```

## 📝 Assignment Tasks Completed
✅ Task 1: Course Interface (ADT) with proper documentation
✅ Task 2: Code analysis and multiple choice questions
✅ Task 3: Generic CourseManager class with all operations
✅ Task 4: Complete LabCourse implementation and testing

---

## 📄 License
This project is for educational purposes as part of the WIA1002 course assignment.

## 🤝 Acknowledgments
- Course instructors and lab demonstrators
- University of Malaya

⭐ If you found this helpful, consider giving it a star!
