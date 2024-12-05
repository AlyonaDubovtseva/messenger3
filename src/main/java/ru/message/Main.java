package ru.message;

public class Main {
    public static void main(String[] args) {
        User[] users = UserService.create4Users();
        System.out.println("Список пользователей:");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
        Message[] messages = MessageService.create4Messages(users);
        System.out.println("\nСписок сообщений:");
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
        }
    }
}
