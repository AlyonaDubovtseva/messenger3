package ru.message;

public class Message {
    private User sender;
    private User recipient;
    private String text;
    private String date;
    private String time;

    public Message(User sender, User recipient, String text, String date, String time) {
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

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String toString() {
        return "[" + date + " " + time + "]" + sender.getNickname() + " to " + recipient.getNickname() + ":" + text;
    }
}