package lk.ijse.culinary.Dao.Custom;

import lk.ijse.culinary.Dao.CrudDao;
import lk.ijse.culinary.Entity.Student_Course;

public interface StudentCourseDao extends CrudDao<Student_Course> {
    Student_Course getStudentCourseById(Long value);
}
