package src;

/**
 * Course ADT (Abstract Data Type) that defines the contract for all course types
 * in the university management system.
 */
public interface Course {
    
    /**
     * Returns the course's unique code.
     * @return String representing the unique course code
     */
    String getCourseCode();
    
    /**
     * Returns the course's title.
     * @return String representing the course title
     */
    String getCourseTitle();
    
    /**
     * Returns the total workload hours for the course per semester.
     * Calculation method may vary by course type (lecture, lab, etc.)
     * @return int total workload hours per semester
     */
    int calculateTotalWorkload();
    
    /**
     * Returns the name of the assigned instructor.
     * @return String representing the instructor's name
     */
    String getInstructorName();
    
    /**
     * Prints all relevant information about the course including
     * course code, title, instructor, workload, and type-specific details.
     */
    void printCourseDetails();
}