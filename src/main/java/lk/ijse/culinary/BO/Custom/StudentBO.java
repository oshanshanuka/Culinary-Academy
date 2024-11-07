package lk.ijse.culinary.BO.Custom;

import lk.ijse.culinary.BO.SuperBO;
import lk.ijse.culinary.DTO.StudentDTO;
import lk.ijse.culinary.Entity.Student;

import java.io.IOException;
import java.util.List;

public interface StudentBO extends SuperBO {
    public boolean save(StudentDTO studentDto) throws IOException;
    public boolean update(StudentDTO studentDto) throws IOException;
    public boolean delete(String id) throws IOException;
    public StudentDTO getStudent(String id);
    public List<Student> getStudentList() throws IOException;
}
