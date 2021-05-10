package dujava.dao;

import dujava.model.Login;
import dujava.model.User;


public interface UserDao {

    int register(User user);

    User validateUser(Login login);
}