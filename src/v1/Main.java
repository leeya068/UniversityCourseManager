package v1;

public class Main {
    public static void main(String[] args) {
        
        // Create course objects (2 LectureCourses and 2 LabCourses)
        LectureCourse lec1 = new LectureCourse("CS101", "Introduction to Programming", "Dr. Alice Johnson", 3);
        LectureCourse lec2 = new LectureCourse("CS201", "Data Structures", "Prof. Robert Chen", 4);
        LabCourse lab1 = new LabCourse("CS101L", "Programming Lab", "Dr. Alice Johnson", 2.5, 2);
        LabCourse lab2 = new LabCourse("CS201L", "Data Structures Lab", "Prof. Robert Chen", 3.0, 2);
        
        // Display created courses
        System.out.println("Created: " + lec1.getCourseCode() + " - " + lec1.getCourseTitle());
        System.out.println("Created: " + lec2.getCourseCode() + " - " + lec2.getCourseTitle());
        System.out.println("Created: " + lab1.getCourseCode() + " - " + lab1.getCourseTitle());
        System.out.println("Created: " + lab2.getCourseCode() + " - " + lab2.getCourseTitle());
        
        // Create CourseManager instance
        CourseManager<Course> manager = new CourseManager<>();
        System.out.println("CourseManager created successfully.\n");
        
        // Add all courses to the manager
        manager.addCourse(lec1);
        manager.addCourse(lec2);
        manager.addCourse(lab1);
        manager.addCourse(lab2);
        
        // Print the course with the highest total workload
        Course highestWorkloadCourse = manager.getCourseWithHighestWorkload();
        if (highestWorkloadCourse != null) {
            System.out.println("\n*** COURSE WITH HIGHEST WORKLOAD ***");
            highestWorkloadCourse.printCourseDetails();
            System.out.println();
        }
        
        // Sort courses by workload and print all course details
        manager.sortCoursesByWorkload();
        manager.printAllCourses();
        
        // Remove a course by its course code and print remaining courses
        System.out.println("Removing course: CS101L");
        manager.removeCourse("CS101L");
        System.out.println("\n--- Remaining Courses After Removal ---");
        manager.printAllCourses();
    }
}