package com.example.notifications;

public class SmsDecorator implements Notifier {
    Notifier wrappee;
    String phoneNumber;
    public SmsDecorator(Notifier wrappee, String phoneNumber) {
        this.wrappee = wrappee;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        wrappee.notify(message);
        System.out.println("Sending SMS to user: " + message);
    }
}
