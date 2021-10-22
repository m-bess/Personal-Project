package dao;

import model.User;
//What else do I need to import to make this work?

public interface UserDao {

    //saves User information to the database to be called upon at login in CLI
    public User saveUser(String username, String password);


    public boolean isUsernameAndPasswordValid();

}
