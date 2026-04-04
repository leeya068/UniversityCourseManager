package v1;

/**
 * Course interface representing an Abstract Data Type (ADT) for a course.
 * Defines the essential operations that any course implementation must provide.
 */

public interface Course {
    
    /*
    Purpose: Returns the course's unique code(identifier)
    Parameters requirement: none
     */
    String getCourseCode();
    
    /*
    Purpose: returns the course's title (full name)
    Parameters requirement: none
     */
    String getCourseTitle();
    
    /* 
    Purpose: returns the total workload hours for the course per semester
    Parameters requirement: none
     */
    double calculateTotalWorkload();
    
    /* 
    Purpose: Returns the name of the eassigned instructor
    Parameters requirement: None
     */
    String getInstructorName();
    
    /* 
    Purpose: Prints all relevant information about the course
    Parameters requirement: None
     */
    void printCourseDetails();
}