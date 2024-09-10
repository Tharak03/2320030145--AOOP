package studentinfo;

import java.util.List;

public interface CourseOperations {
    String getCourseId();
    String getCourseName();
    void enrollStudent(Student student);
    List<Student> getEnrolledStudents();
}
