package lk.ijse.culinary.BO.Custom;

import lk.ijse.culinary.BO.SuperBO;
import lk.ijse.culinary.DTO.UserDTO;
import lk.ijse.culinary.Entity.User;

import java.io.IOException;
import java.util.List;

public interface UserBO extends SuperBO {
    public boolean save(UserDTO userDto) throws IOException;
    public boolean update(UserDTO userDto) throws IOException;
    public boolean delete(String id) throws IOException;
    public UserDTO getUser(String id);
    public List<User> getUserList() throws IOException;

}
