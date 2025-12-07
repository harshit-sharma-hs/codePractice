package DesignPatterns.Factory;

public class Client {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
        notification=NotificationFactory.createNotification("Email");
        notification.notifyUser();
    }
}
