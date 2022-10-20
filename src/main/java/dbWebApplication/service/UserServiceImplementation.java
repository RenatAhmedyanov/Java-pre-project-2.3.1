package dbWebApplication.service;

import java.util.List;
import dbWebApplication.models.User;
import dbWebApplication.dao.UserDAO;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(readOnly = true)
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public User findUserById(Integer id) {
        return userDAO.findUserById(id);
    }

    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }

    @Transactional
    public void updateUser(User updatedUser) {
        userDAO.updateUser(updatedUser);
    }

    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
