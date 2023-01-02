package ru.DmitriyS.PP_CRUD_BOOT.dao;

import ru.DmitriyS.PP_CRUD_BOOT.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> getAllUsers();
    User userInfo(int id);
    void updateUser(User user);

    void deleteUser(int id);

}
