package v1;

import java.util.ArrayList;

/**
 * Generic CourseManager class that manages a collection of Course objects.
 * 
 * @param <T> The type of Course that must extend the Course interface
*/
public class CourseManager<T extends Course> {
    
    // Private member variable to store the collection of courses
    private ArrayList<T> courses;
    
    /**
     * Constructor - Initializes an empty course manager.
     * Creates a new ArrayList to store course objects.
     */
    public CourseManager() {
        courses = new ArrayList<>();
    }
    
    /**
     * Adds a course to the manager.
     * 
     * @param course The course to be added (must implement Course interface)
     */
    public void addCourse(T course) {
        courses.add(course);
        System.out.println("Course added: " + course.getCourseCode());
    }
    
    /**
     * Removes a course by its unique code.
     * 
     * @param courseCode The unique code of the course to remove
     * @return true if the course was found and removed, false otherwise
     */
    public boolean removeCourse(String courseCode) {
        // Iterate through the list to find matching course code
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseCode().equals(courseCode)) {
                courses.remove(i);  // Remove the course at index i
                System.out.println("Course removed: " + courseCode);
                return true;
            }
        }
        // Course code not found
        System.out.println("Course not found: " + courseCode);
        return false;
    }
    
    /**
     * Retrieves and returns the course with the highest total workload.
     * Uses linear search to compare all courses' workloads.
     * 
     * @return The course with the highest workload, or null if collection is empty
     */
    public T getCourseWithHighestWorkload() {
        // Check if there are any courses in the manager
        if (courses.isEmpty()) {
            System.out.println("No courses in the manager.");
            return null;
        }
        
        // Assume first course has the highest workload initially
        T highestWorkloadCourse = courses.get(0);
        double maxWorkload = highestWorkloadCourse.calculateTotalWorkload();
        
        // Compare with remaining courses to find the actual highest
        for (int i = 1; i < courses.size(); i++) {
            T currentCourse = courses.get(i);
            double currentWorkload = currentCourse.calculateTotalWorkload();
            
            // Update if current course has higher workload
            if (currentWorkload > maxWorkload) {
                maxWorkload = currentWorkload;
                highestWorkloadCourse = currentCourse;
            }
        }
        
        return highestWorkloadCourse;
    }
    
    /**
     * Sorts the courses by their total workload in ascending order.
     * Uses the bubble sort algorithm for simplicity (no additional imports needed).
     * Courses with smaller workload appear first, largest workload last.
     */
    public void sortCoursesByWorkload() {
        // No need to sort if there are 0 or 1 courses
        if (courses.isEmpty() || courses.size() == 1) {
            System.out.println("No courses to sort or only one course.");
            return;  // Exit the method early
        }
        
        // Bubble sort algorithm - passes through the list multiple times
        for (int i = 0; i < courses.size() - 1; i++) {
            for (int j = 0; j < courses.size() - i - 1; j++) {
                // Get workloads of adjacent courses
                double workload1 = courses.get(j).calculateTotalWorkload();
                double workload2 = courses.get(j + 1).calculateTotalWorkload();
                
                // Swap if they are in the wrong order (workload1 > workload2)
                if (workload1 > workload2) {
                    T temp = courses.get(j);
                    courses.set(j, courses.get(j + 1));
                    courses.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("Courses sorted by workload (ascending).");
    }
    
    /**
     * Prints the details of all courses in the collection.
     * Displays course number, index, and calls each course's printCourseDetails() method.
     */
    public void printAllCourses() {
        // Check if there are any courses to display
        if (courses.isEmpty()) {
            System.out.println("No courses in the manager.");
            return;
        }
        
        // Print header with total course count
        System.out.println("           ALL COURSES (" + courses.size() + ")");
        System.out.println();
        
        // Iterate through and print each course's details
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("\n--- Course " + (i + 1) + " ---");
            courses.get(i).printCourseDetails();
        }
    }
}