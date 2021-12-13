package model.responsivetory;

import model.bean.User;

import java.util.List;

public interface IUserDAO {
    List<User> findAll();
    User findById(int id);
    boolean save(User user);
    boolean delete(int id);
    boolean update(int ind, User user);
}
