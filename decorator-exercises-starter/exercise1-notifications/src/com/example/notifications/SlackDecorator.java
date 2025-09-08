package com.example.notifications;

public class SlackDecorator implements Notifier {
    Notifier wrappee;
    String channel;
    public SlackDecorator(Notifier wrappee, String channel) {
        this.wrappee = wrappee;
        this.channel = channel;
    }

    @Override
    public void notify(String message) {
        wrappee.notify(message);
        System.out.println("Sending Slack message to user: " + message);
    }

}
