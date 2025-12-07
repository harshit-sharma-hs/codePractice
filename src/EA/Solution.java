package EA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(

                new Employee("Alice", 30, 90000, "HR"),

                new Employee("Bob", 28, 85000, "HR"),

                new Employee("Carol", 35, 120000, "Sales"),

                new Employee("Dave", 40, 110000, "Engineering"),

                new Employee("Eve", 29, 95000, "Engineering"),

                new Employee("Frank", 33, 92000, "Engineering"),

                // Additional employees can be added here for more test coverage

                new Employee("Grace", 31, 70000, "HR"),

                new Employee("Hank", 38, 88000, "Sales")

        );

        Map<String, List<Employee>> map = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.toList(),list->list.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList()))));

        for(String dep : map.keySet())
        {
            List<Employee> list= map.get(dep).stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
            map.put(dep,list);
        }
        for(String dep :map.keySet())
            System.out.println(dep +"  -  "+ map.get(dep));
        //System.out.println(map);
    }
}
