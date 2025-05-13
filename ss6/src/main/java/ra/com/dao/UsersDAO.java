package ra.com.dao;

import ra.com.model.User;

import java.util.List;

public interface UsersDAO {
    List<User> findAll();
    User findById(int id);
    boolean addUser(User user);
}
