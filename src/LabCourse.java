/**
 * Represents a lab-based course in the university.
 * Implements the Course interface.
 */
public class LabCourse implements Course {
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private double labHoursPerWeek;
    private int numberOfSessions;

    /**
     * Constructor for LabCourse
     * @param courseCode Unique course code
     * @param courseTitle Course title
     * @param instructorName Name of assigned instructor
     * @param labHoursPerWeek Weekly lab hours per session
     * @param numberOfSessions Number of lab sessions per week
     */
    public LabCourse(String courseCode, String courseTitle, 
                     String instructorName, double labHoursPerWeek, 
                     int numberOfSessions) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.labHoursPerWeek = labHoursPerWeek;
        this.numberOfSessions = numberOfSessions;
    }

    @Override
    public String getCourseCode() { 
        return courseCode; 
    }

    @Override
    public String getCourseTitle() { 
        return courseTitle; 
    }

    @Override
    public String getInstructorName() { 
        return instructorName; 
    }

    @Override
    public int calculateTotalWorkload() { 
        // Workload = lab hours/session × sessions/week × 14 weeks
        return (int)(labHoursPerWeek * numberOfSessions * 14);
    }

    @Override
    public void printCourseDetails() { 
        System.out.println("========== Lab Course ==========");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Lab Hours/Session: " + labHoursPerWeek);
        System.out.println("Sessions/Week: " + numberOfSessions);
        System.out.println("Total Lab Hours/Week: " + 
                           (labHoursPerWeek * numberOfSessions));
        System.out.println("Total Workload (Semester): " + 
                           calculateTotalWorkload() + " hours");
        System.out.println("================================\n");
    }
}