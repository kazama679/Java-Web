package ra.com.service;

import ra.com.dao.UsersDAO;
import ra.com.dao.UsersDAOImp;
import ra.com.model.User;

import java.util.List;

public class UserServiceImp implements UserService {
    private final UsersDAO usersDAO;

    public UserServiceImp() {
        usersDAO = new UsersDAOImp();
    }

    @Override
    public List<User> findAll() {
        return usersDAO.findAll();
    }

    @Override
    public User findById(int id) {
        return usersDAO.findById(id);
    }

    @Override
    public boolean addUser(User user) {
        return usersDAO.addUser(user);
    }
}
