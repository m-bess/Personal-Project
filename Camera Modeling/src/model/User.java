package model;

public class User {

    //User class to log in. DB holds login information and links user_id to camera equipment and pictures

    private long id;
    private String username;

    public String getUsername() {
        return username;
    }

    public long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(long id) {
        this.id = id;
    }

}
