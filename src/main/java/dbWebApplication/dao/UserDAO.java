package dbWebApplication.dao;

import java.util.List;
import dbWebApplication.models.User;

public interface UserDAO {
    void addUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
    void updateUser(User updatedUser);
    void deleteUser(int id);
}
