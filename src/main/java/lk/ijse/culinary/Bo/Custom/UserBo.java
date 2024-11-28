package lk.ijse.culinary.Bo.Custom;

import lk.ijse.culinary.Bo.SuperBo;
import lk.ijse.culinary.Dto.UserDto;
import lk.ijse.culinary.Entity.User;

import java.io.IOException;
import java.util.List;

public interface UserBo extends SuperBo {
    public boolean save(UserDto userDto) throws IOException;
    public boolean update(UserDto userDto) throws IOException;
    public boolean delete(String id) throws IOException;
    public UserDto getUser(String id);
    public List<User> getUserList() throws IOException;

}
