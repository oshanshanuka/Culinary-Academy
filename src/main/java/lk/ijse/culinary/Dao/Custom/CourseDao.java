package lk.ijse.culinary.Dao.Custom;

import lk.ijse.culinary.Dao.CrudDao;
import lk.ijse.culinary.Entity.Course;

import java.io.IOException;
import java.util.List;

public interface CourseDao extends CrudDao<Course> {
    String getCurrentId() throws IOException;

    List<String> getCourseId();

    List<String> getCourseIds();

    Course getCourseById(String courseId);
    int getProgramCount();
}
