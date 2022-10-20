package dbWebApplication.service;

import java.util.List;
import dbWebApplication.models.User;

public interface UserService {
    void addUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
    void updateUser(User updatedUser);
    void deleteUser(int id);

}
