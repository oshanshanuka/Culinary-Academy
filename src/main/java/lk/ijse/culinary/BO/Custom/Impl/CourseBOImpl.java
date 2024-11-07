package lk.ijse.culinary.BO.Custom.Impl;

import lk.ijse.culinary.BO.Custom.CourseBO;
import lk.ijse.culinary.DAO.Custom.CourseDAO;
import lk.ijse.culinary.DAO.DAOFactory;
import lk.ijse.culinary.DTO.CourseDTO;
import lk.ijse.culinary.Entity.Course;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CourseBOImpl implements CourseBO{
    CourseDAO courseDao = (CourseDAO) DAOFactory.getDAOFactory().getDaoType(DAOFactory.DAOType.COURSE);

    @Override
    public boolean save(CourseDTO courseDto) throws IOException {
        Course course = new Course(courseDto.getCourse_id(),courseDto.getCourse_name(),courseDto.getDuration(),courseDto.getCourse_fee());
        return courseDao.save(course);
    }

    @Override
    public boolean update(CourseDTO courseDto) throws IOException {
        Course course = new Course(courseDto.getCourse_id(),courseDto.getCourse_name(),courseDto.getDuration(),courseDto.getCourse_fee());
        return courseDao.update(course);
    }

    @Override
    public boolean delete(String id) throws IOException {
        return courseDao.delete(id);
    }

    @Override
    public CourseDTO getCourse(String id) throws IOException {
        Course byId = courseDao.findById(id);
        CourseDTO courseDto = new CourseDTO();
        courseDto.setCourse_id(byId.getCourse_id());
        courseDto.setCourse_name(byId.getCourse_name());
        courseDto.setDuration(byId.getDuration());
        courseDto.setCourse_fee(byId.getCourse_fee());
        return courseDto;
    }

    @Override
    public List<Course> getCourseList() throws IOException {
        List<Course> courseList = new ArrayList<>();
        List<Course> courses = courseDao.getAll();
        for (Course course : courses) {
            courseList.add(new Course(course.getCourse_id(),course.getCourse_name(),course.getDuration(),course.getCourse_fee()));
        }
        return courseList;
    }
}
