package lk.ijse.culinary.Dao.Custom;

import lk.ijse.culinary.Dao.CrudDao;
import lk.ijse.culinary.Entity.Student;
import lk.ijse.culinary.Entity.Student_Course;

import java.io.IOException;

public interface StudentDao extends CrudDao<Student> {
    String getCurrentId() throws IOException;

    Student getStudentById(String text);

    void saveStudentCourseDetails(Student_Course studentCourse) throws IOException;
    boolean isStudentRegisteredForCourse(String stuId, String courseId) throws IOException;
    int getStudentCount();
}
