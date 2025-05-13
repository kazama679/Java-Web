package ra.com.service;

import ra.com.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    boolean addUser(User user);
}
