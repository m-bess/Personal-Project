package dao;

import model.User;




public interface UserDao {

    //Saves User information to the database to be called upon at login in CLI
    public User saveUser(String username, String password);


    public boolean isUsernameAndPasswordValid();

}
