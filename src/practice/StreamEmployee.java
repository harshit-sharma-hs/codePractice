package practice;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    int age;
    int Salary;
    String gender;

    Employee(String name,int age,int Salary,String gender)
    {
        this.name=name;
        this.age=age;
        this.Salary=Salary;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
public class StreamEmployee {

    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ravi",24,2000,"Male"));
        list.add(new Employee("Ram",54,3000,"Male"));
        list.add(new Employee("Shyam",34,4000,"Male"));
        list.add(new Employee("Rani",84,8000,"Female"));
        list.add(new Employee("Malti",84,4600,"Female"));

      // Optional <Employee> emp = list.stream().max(Comparator.comparingInt(Employee::getSalary));
      // Optional<Employee> emp = list.stream().max(Comparator.comparing(Employee::getSalary));
//        int sum =list.stream().map(Employee::getSalary).reduce(0,(a,b)->a+b);
//       // list.stream().collect(Collectors.groupingBy(Employee::getAge));
//       Optional<Employee> emp2 = list.stream().min(Comparator.comparingInt(Employee::getAge));
//
//       Map<Integer,Long> map= list.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
//       int second = list.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//       int axi = list.stream().map(Employee::getAge).max(Comparator.comparing(Integer::intValue)).get();
//
////        //System.out.println(emp.get().getSalary());
////       // System.out.println(mp);
////        System.out.println(sum);
////        System.out.println(emp2.get().getAge());
//        System.out.println(map);
//        System.out.println(second);

       Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(map);
        int maxSalary = list.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary();
        int sum = list.stream().map(Employee::getSalary).reduce(0,(a,b)->a+b);
        System.out.println(sum);
        int secondHighest  = list.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

    }
}
