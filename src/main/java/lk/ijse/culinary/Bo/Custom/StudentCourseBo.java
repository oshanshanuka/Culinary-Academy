package lk.ijse.culinary.Bo.Custom;

import lk.ijse.culinary.Bo.SuperBo;
import lk.ijse.culinary.Entity.Student_Course;

import java.io.IOException;
import java.util.List;

public interface StudentCourseBo extends SuperBo {
    public List<Student_Course> getStudentCourseList() throws IOException;

}
