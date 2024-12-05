package ru.message;

public class MessageService {
    public static Message[] create4Messages(User[] users) {
        Message[] messages = new Message[4];
        messages[0] = new Message(users[0], users[1], "Привет, как дела?",1,18);
        messages[1] = new Message(users[1], users[2], "Пойдём завтра гулять?",1,18);
        messages[2] = new Message(users[2], users[3], "У меня есть идея для проекта.",1,18);
        messages[3] = new Message(users[3], users[0], "Отлично, давай созвонимся.",1,18);
        return messages;
    }
}
