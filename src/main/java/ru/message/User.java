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

    public String getName() {
        return name;
    }


    public String getNickname() {
        return nickname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Никнейм: " + nickname + ", Имя: " + name + ", Телефон: " + phoneNumber;
    }

}
