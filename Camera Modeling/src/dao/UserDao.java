package dao;

import model.User;

public interface UserDao {

    public User saveUser(String username, String password);

    public boolean isUsernameAndPasswordValid();

}
