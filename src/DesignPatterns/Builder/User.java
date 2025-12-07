package DesignPatterns.Builder;

public class User {
    private int id;
    private String name;
    private int salary;

    User(UserBuilder userBuilder)
    {
        this.id= userBuilder.id;
        this.name=userBuilder.name;
        this.salary=userBuilder.salary;
    }
    static class UserBuilder{
        private int id;
        private String name;
        private int salary;

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }
        User build()
        {
            return new User(this);
        }
    }
    public String toString()
    {
        return id+" : "+name+" : "+salary;
    }
}
