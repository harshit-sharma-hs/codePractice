package DesignPatterns.Factory;

public class NotificationFactory {
    static Notification createNotification(String type)
    {
        if(type.equals("SMS"))
            return new SMS();
        else if(type.equals("Email"))
            return new Email();
        return null;
    }
}
