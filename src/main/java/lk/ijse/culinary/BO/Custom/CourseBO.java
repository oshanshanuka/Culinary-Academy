package lk.ijse.culinary.BO.Custom;

import java.io.IOException;
import lk.ijse.culinary.BO.SuperBO;
import lk.ijse.culinary.DTO.CourseDTO;
import lk.ijse.culinary.Entity.Course;

import java.util.List;

public interface CourseBO {
    public boolean save(CourseDTO courseDto) throws IOException;
    public boolean update(CourseDTO courseDto) throws IOException;
    public boolean delete(String id) throws IOException;
    public CourseDTO getCourse(String id) throws IOException;
    public List<Course> getCourseList() throws IOException;
}
