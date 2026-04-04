package v1;

/**
 * LabCourse class represents a laboratory-based course.
 * Implements the Course interface and provides lab-specific functionality.
*/

public class LabCourse implements Course {
    
    // Private member variables for lab course attributes
    private String courseCode;        // Unique identifier for the course
    private String courseTitle;       // Full name/title of the course
    private String instructorName;    // Name of the assigned instructor
    private double labHoursPerWeek;   // Number of lab hours scheduled per week
    private int numberOfSessions;     // Number of lab sessions per week or weeks in semester
    
    /**
     * Constructor to initialize a LabCourse object with all required attributes.
     * 
     * @param courseCode Unique identifier for the course (e.g., "CS101L")
     * @param courseTitle Full title/name of the course
     * @param instructorName Name of the instructor teaching the course
     * @param labHoursPerWeek Number of lab hours scheduled per week
     * @param numberOfSessions Number of lab sessions or weeks in the semester
     */
    public LabCourse(String courseCode, String courseTitle, String instructorName, double labHoursPerWeek, int numberOfSessions) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.labHoursPerWeek = labHoursPerWeek;
        this.numberOfSessions = numberOfSessions;
    }
    
    /**
     * Returns the course's unique code.
     * 
     * @return The unique course code as a String
     */
    @Override
    public String getCourseCode() {
        return courseCode;
    }
    
    /**
     * Returns the course's title.
     * 
     * @return The course title as a String
     */
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }
    
    /**
     * Returns the name of the assigned instructor.
     * 
     * @return The instructor's name as a String
     */
    @Override
    public String getInstructorName() {
        return instructorName;
    }
    
    /**
     * Calculates the total workload hours for the lab course per semester.
     * Formula: labHoursPerWeek × numberOfSessions × 14 weeks
     * 
     * Assumptions:
     * - labHoursPerWeek represents total lab hours scheduled per week
     * - numberOfSessions represents the number of sessions per week
     * - A standard semester has 14 weeks
     * 
     * @return Total workload hours as a double value
     */
    @Override
    public double calculateTotalWorkload() {
        // Calculate total workload: weekly hours × sessions per week × weeks in semester
        return labHoursPerWeek * numberOfSessions * 14;
    }
    
    /**
     * Prints all relevant information about the lab course to the console.
     * Displays course code, title, instructor, lab hours, sessions, and total workload.
     * Output is formatted for easy readability.
     */
    @Override
    public void printCourseDetails() {
        System.out.println("=== Lab Course Details ===");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Lab Hours Per Week: " + labHoursPerWeek + " hours");
        System.out.println("Number of Sessions: " + numberOfSessions);
        System.out.println("Total Workload Per Semester: " + calculateTotalWorkload() + " hours");
    }
}