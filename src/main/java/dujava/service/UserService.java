package dujava.service;

import dujava.model.Login;
import dujava.model.User;

public interface UserService {

    int register(User user);

    User validateUser(Login login);
}