package v1;

/**
 * LectureCourse class represents a traditional lecture-based course.
 * Implements the Course interface and provides lecture-specific functionality.
*/
public class LectureCourse implements Course {
    
    // Private member variables for lecture course attributes
    private String courseCode;           // Unique identifier for the course
    private String courseTitle;          // Full name/title of the course
    private String instructorName;       // Name of the assigned instructor
    private int lectureHoursPerWeek;     // Number of lecture hours scheduled per week
    
    /**
     * Constructor to initialize a LectureCourse object with all required attributes.
     * 
     * @param courseCode Unique identifier for the course (e.g., "CS101")
     * @param courseTitle Full title/name of the course
     * @param instructorName Name of the instructor teaching the course
     * @param lectureHoursPerWeek Number of lecture hours scheduled per week
     */
    public LectureCourse(String courseCode, String courseTitle, String instructorName, int lectureHoursPerWeek) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.lectureHoursPerWeek = lectureHoursPerWeek;
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
     * Calculates the total workload hours for the lecture course per semester.
     * Formula: lectureHoursPerWeek × 14 weeks
     * 
     * Assumption: A standard semester has 14 weeks.
     * 
     * @return Total workload hours as a double value
     */
    @Override
    public double calculateTotalWorkload() {
        // Workload = lecture hours per week × number of weeks in a semester (assume 14 weeks)
        return lectureHoursPerWeek * 14;
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
     * Prints all relevant information about the lecture course to the console.
     * Displays course title, code, instructor, lecture hours, and total workload.
     * Output is formatted for easy readability.
     */
    @Override
    public void printCourseDetails() {
        System.out.println("Lecture Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println("Instructor: " + instructorName);
        System.out.println("Lecture Hours/Week: " + lectureHoursPerWeek);
        System.out.println("Total Workload (Semester): " + calculateTotalWorkload() + " hours");
    }
}