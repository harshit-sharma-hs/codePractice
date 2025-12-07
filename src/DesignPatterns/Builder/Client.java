package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setId(1).setName("cdcd").setSalary(10000).build();
        System.out.println(user);
    }
}
