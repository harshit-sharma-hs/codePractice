package DesignPatterns.Factory;

public class Email implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email");
    }
}
