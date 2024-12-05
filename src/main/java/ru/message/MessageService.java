package ru.message;

public class MessageService {
    public static Message[] create4Messages(User[] users) {
        Message[] messages = new Message[4];
        messages[0] = new Message(users[0], users[1], "Привет, как дела?","1.12.24","18:00");
        messages[1] = new Message(users[1], users[2], "Пойдём завтра гулять?","1.12.24","18:05");
        messages[2] = new Message(users[2], users[3], "У меня есть идея для проекта.","1.12.24","19:34");
        messages[3] = new Message(users[3], users[0], "Отлично, давай созвонимся.","1.12.24","19:36");
        return messages;
    }
}
