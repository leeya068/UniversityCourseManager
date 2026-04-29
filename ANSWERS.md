
# Task 2: Multiple Choice Answers

## Questions & Answers

| Question | Answer | Explanation |
|----------|--------|-------------|
| 1 | **c) 42** | 3 hours/week × 14 weeks = 42 hours |
| 2 | **a) CS201** | `getCourseCode()` returns the course code identifier |
| 3 | **a) 56** | 4 hours/week × 14 weeks = 56 hours |
| 4 | **b) Data Structures Lab** | `getCourseTitle()` returns the course title |
| 5 | **c) The details will be printed** | `printCourseDetails()` is implemented correctly |
| 6 | **a)** | Lab: hours × sessions × 14 weeks; Lecture: hours × 14 weeks |
| 7 | **c) calculateTotalWorkload()** | Different course types have unique workload calculations |
| 8 | **b)** | `@Override` indicates method overrides superclass/interface |

---
## Detailed Explanations

### Question 1
`calculateTotalWorkload()` for LectureCourse = lectureHoursPerWeek × 14
= 3 × 14 = 42

### Question 3
`calculateTotalWorkload()` for second LectureCourse = 4 × 14 = 56

### Question 6
**Primary difference**: LabCourse multiplies by `numberOfSessions` (sessions per week), while LectureCourse does not have this multiplier.

### Question 7
`calculateTotalWorkload()` would need a unique implementation for OnlineCourse because online courses use different metrics (video hours, quizzes) rather than in-person hours.

### Question 8
`@Override` is an annotation that:
- Provides compile-time checking
- Improves code readability
- Prevents accidental method overloading instead of overriding


