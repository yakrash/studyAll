package su.bzz.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String args[]) {
        LocalDateTime ld = LocalDateTime.parse("01-04-21T12:22:00");
        System.out.println(ld);



/*        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee("Alex", 35, 3000.0, 555));
        map.put(2, new Employee("Max", 32, 2000.0, 222));
        map.put(3, new Employee("Alex", 28, 5000.0, 111));
        map.put(4, new Employee("Dan", 65, 1000.0, 333));
        System.out.println(map.values().toString());
        List<Employee> employeeList = map.values().stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(employeeList);
        Employee em1 = new Employee();
        Employee em2 = em1;

        em1.age = 5;
        em2.age = 10;
        System.out.println(em1.age);*/
    }
}

class Employee {
    String name;
    int age;
    double salary;
    long mobile;

    public Employee(String name, int age, double salary, long mobile) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobile = mobile;
    }
    Employee(){

    };

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", mobile=" + mobile +
                "}\n";
    }
    // constructors, getters & setters
}
// https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
// https://target.com/index.html?port=8080&name=Bob&cookie=&host=localhost&pass=12345

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//    }
//}
