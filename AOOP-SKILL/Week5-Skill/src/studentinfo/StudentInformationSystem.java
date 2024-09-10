package studentinfo;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Sreya", "S001");
        Student student2 = new Student("Raghu", "S002");
        Student student3 = new Student("Shiva", "S003");
        Student student4 = new Student("Sai Prasad", "S004");
        Student student5 = new Student("Deekshita", "S005");
        Student student6 = new Student("Chandrika", "S006");
        Student student7 = new Student("Shashank", "S007");
        Student student8 = new Student("Lavanya", "S008");

        // Create courses
        Course course1 = new Course("C001", "AOOP");
        Course course2 = new Course("C002", "AIML");
        Course course3 = new Course("C003", "Operating Systems");
        Course course4 = new Course("C004", "French");
        Course course5 = new Course("C005", "German");
        Course course6 = new Course("C006", "SIL");

        // Create enrollment service
        EnrollmentService enrollmentService = new EnrollmentService();

        // Enroll students in courses
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student1, course5);

        enrollmentService.enroll(student2, course1);
        enrollmentService.enroll(student2, course3);
        enrollmentService.enroll(student2, course6);

        enrollmentService.enroll(student3, course1);
        enrollmentService.enroll(student3, course4);
        enrollmentService.enroll(student3, course6);

        enrollmentService.enroll(student4, course2);
        enrollmentService.enroll(student4, course6);
        enrollmentService.enroll(student4, course5);

        enrollmentService.enroll(student5, course3);
        enrollmentService.enroll(student5, course6);

        enrollmentService.enroll(student6, course4);
        enrollmentService.enroll(student6, course6);

        enrollmentService.enroll(student7, course1);
        enrollmentService.enroll(student7, course3);
        enrollmentService.enroll(student7, course5);

        enrollmentService.enroll(student8, course2);
        enrollmentService.enroll(student8, course4);

        // Displays enrolled students for each course
        printCourseEnrollments(course1);
        printCourseEnrollments(course2);
        printCourseEnrollments(course3);
        printCourseEnrollments(course4);
        printCourseEnrollments(course5);
        printCourseEnrollments(course6);
    }

    private static void printCourseEnrollments(Course course) {
        System.out.println("Students enrolled in " + course.getCourseName() + ":");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
        System.out.println(); // Adds a line break between course enrollments
    }
}
