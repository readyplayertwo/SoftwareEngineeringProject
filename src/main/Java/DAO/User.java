package DAO;

/**
 * Created by gerar_000 on 15/03/2016.
 */
public class User {

    private int UserId;
    private String foreName;
    private String SurName;
    private String userName;
    private String password;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        this.SurName = surName;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}