import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Generic manager class for handling collections of Course objects.
 * @param <T> Type that extends Course interface
 */
public class CourseManager<T extends Course> {
    private ArrayList<T> courses;
    
    /**
     * Constructor initializes an empty course collection
     */
    public CourseManager() {
        courses = new ArrayList<>();
    }
    
    /**
     * Adds a course to the manager
     * @param course The course to add
     */
    public void addCourse(T course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Added: " + course.getCourseCode() + 
                               " - " + course.getCourseTitle());
        }
    }
    
    /**
     * Removes a course by its unique code
     * @param courseCode The code of the course to remove
     * @return true if course was found and removed, false otherwise
     */
    public boolean removeCourse(String courseCode) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseCode().equals(courseCode)) {
                T removed = courses.remove(i);
                System.out.println("Removed: " + removed.getCourseCode() + 
                                   " - " + removed.getCourseTitle());
                return true;
            }
        }
        System.out.println("Course not found: " + courseCode);
        return false;
    }
    
    /**
     * Retrieves and returns the course with the highest total workload
     * @return The course with highest workload, or null if collection is empty
     */
    public T getCourseWithHighestWorkload() {
        if (courses.isEmpty()) {
            System.out.println("No courses in the manager.");
            return null;
        }
        
        T highest = courses.get(0);
        for (T course : courses) {
            if (course.calculateTotalWorkload() > 
                highest.calculateTotalWorkload()) {
                highest = course;
            }
        }
        return highest;
    }
    
    /**
     * Sorts the courses by their total workload in ascending order
     */
    public void sortCoursesByWorkload() {
        Collections.sort(courses, new Comparator<T>() {
            @Override
            public int compare(T c1, T c2) {
                return Integer.compare(c1.calculateTotalWorkload(), 
                                      c2.calculateTotalWorkload());
            }
        });
        System.out.println("Courses sorted by workload (ascending).");
    }
    
    /**
     * Prints the details of all courses in the collection
     */
    public void printAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        
        System.out.println("\n=== All Courses (" + courses.size() + " total) ===");
        for (T course : courses) {
            course.printCourseDetails();
        }
    }
    
    /**
     * Returns the number of courses in the manager
     * @return Size of the course collection
     */
    public int getCourseCount() {
        return courses.size();
    }
}