package ru.message;

public class User {
    private String name;
    private String nickname;
    private int phoneNumber;
    private String password;

    public User () {}
    public User(String name, String nickname, int phoneNumber, String password) {
        this.name = name;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
