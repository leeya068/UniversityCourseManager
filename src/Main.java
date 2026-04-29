/**
 * Main class to test the university course management system.
 * Demonstrates all required functionality.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNIVERSITY COURSE MANAGEMENT SYSTEM ===\n");
        
        // 1. Create course objects
        System.out.println("--- Creating Courses ---");
        
        // Lecture courses
        LectureCourse lecture1 = new LectureCourse(
            "CS101", 
            "Introduction to Programming", 
            "Dr. Smith", 
            3
        );
        
        LectureCourse lecture2 = new LectureCourse(
            "CS205", 
            "Object-Oriented Programming", 
            "Prof. Johnson", 
            4
        );
        
        // Lab courses
        LabCourse lab1 = new LabCourse(
            "CS101L", 
            "Programming Lab", 
            "Dr. Smith", 
            2.5, 
            2
        );
        
        LabCourse lab2 = new LabCourse(
            "CS205L", 
            "OOP Lab", 
            "Prof. Johnson", 
            3.0, 
            1
        );
        
        // 2. Create CourseManager instance
        CourseManager<Course> manager = new CourseManager<>();
        
        System.out.println("\n--- Adding Courses to Manager ---");
        // 3. Add all courses to manager
        manager.addCourse(lecture1);
        manager.addCourse(lecture2);
        manager.addCourse(lab1);
        manager.addCourse(lab2);
        
        // Display all courses
        manager.printAllCourses();
        
        // 4. Get and display course with highest workload
        System.out.println("\n--- Course with Highest Workload ---");
        Course highestWorkloadCourse = manager.getCourseWithHighestWorkload();
        if (highestWorkloadCourse != null) {
            System.out.println("Course with highest workload:");
            highestWorkloadCourse.printCourseDetails();
        }
        
        // 5. Sort courses by workload and print
        System.out.println("\n--- Sorting Courses by Workload ---");
        manager.sortCoursesByWorkload();
        manager.printAllCourses();
        
        // 6. Remove a course and verify
        System.out.println("\n--- Removing a Course ---");
        manager.removeCourse("CS101");
        System.out.println("\n--- Remaining Courses After Removal ---");
        manager.printAllCourses();
        
        // Additional verification: Show workload calculations
        System.out.println("\n--- Workload Calculation Summary ---");
        System.out.println("CS101 (Lecture): 3 hrs/week × 14 = 42 hours");
        System.out.println("CS205 (Lecture): 4 hrs/week × 14 = 56 hours");
        System.out.println("CS101L (Lab): 2.5 hrs/session × 2 sessions × 14 = 70 hours");
        System.out.println("CS205L (Lab): 3.0 hrs/session × 1 session × 14 = 42 hours");
        System.out.println("\nVerification from system:");
        System.out.println("CS101L workload: " + lab1.calculateTotalWorkload() + " hours");
        System.out.println("CS205 workload: " + lecture2.calculateTotalWorkload() + " hours");
        
        System.out.println("\n=== Program Execution Complete ===");
    }
}