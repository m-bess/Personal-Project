package model;

public class User {

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
