package studentinfo;

import java.util.List;

public interface StudentOperations {
    String getName();
    String getId();
    void enrollCourse(Course course);
    List<Course> getCourses();
}
