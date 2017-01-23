package web.model;

import java.util.Date;

/**
 * Created by asus on 2017/1/19.
 */
public class User {
     private long id;
     private String username;
     private String password;
     private String state;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    private Date create_time;
}
