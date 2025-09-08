package com.example.notifications;

public class WhatsAppDecorator implements Notifier {
    Notifier wrappee;
    String userwa;
    public WhatsAppDecorator(Notifier wrappee, String userwa ) {
        this.wrappee = wrappee;
        this.userwa = userwa;
    }

    @Override
    public void notify(String message) {
        wrappee.notify(message);
        System.out.println("Sending WhatsApp message to user: " + message);
    }
    
}
