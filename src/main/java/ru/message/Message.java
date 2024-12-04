package ru.message;

public class Message {
    private User sender;
    private User recipient;
    private String text;
    private int date;
    private int time;

    public Message(User sender, User recipient, String text, int date, int time) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.date = date;
        this.time = time;
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public int getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public String toString() {
        return "[" + date + " " + time + "]" + sender.getNickname() + "to" + recipient.getNickname() + ":" + text;
    }
}