package ru.message;

public class UserService {
    public static User[] create4Users() {
        User[] users = new User[4];
        users[0] = new User("nick1", "Алёна", 898788888, "password1");
        users[1] = new User("nick2", "Эльвина", 898799999, "password2");
        users[2] = new User("nick3", "Азалия", 898777777, "password3");
        users[3] = new User("nick4", "Айгиз", 898766666, "password4");
        return users;
    }
}

