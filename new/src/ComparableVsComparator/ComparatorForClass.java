package ComparableVsComparator;


import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - $" + salary;
    }
}

public class ComparatorForClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 70000));
        employees.add(new Employee("Charlie", 60000));

        // Sorting by name using Comparator
        Collections.sort(employees, (e1, e2) -> e2.name.compareTo(e1.name));

        System.out.println(employees);
    }
}

