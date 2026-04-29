/**
 * Represents a lecture-based course in the university.
 * Implements the Course interface.
 */
public class LectureCourse implements Course {
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private int lectureHoursPerWeek;

    /**
     * Constructor for LectureCourse
     * @param courseCode Unique course code
     * @param courseTitle Course title
     * @param instructorName Name of assigned instructor
     * @param lectureHoursPerWeek Weekly lecture hours
     */
    public LectureCourse(String courseCode, String courseTitle, 
                         String instructorName, int lectureHoursPerWeek) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.lectureHoursPerWeek = lectureHoursPerWeek;
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
    public int calculateTotalWorkload() { 
        // Workload = lecture hours per week × number of weeks (14)
        return lectureHoursPerWeek * 14; 
    }

    @Override
    public String getInstructorName() { 
        return instructorName; 
    }

    @Override
    public void printCourseDetails() { 
        System.out.println("========== Lecture Course ==========");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Lecture Hours/Week: " + lectureHoursPerWeek);
        System.out.println("Total Workload (Semester): " + 
                           calculateTotalWorkload() + " hours");
        System.out.println("====================================\n");
    }
}