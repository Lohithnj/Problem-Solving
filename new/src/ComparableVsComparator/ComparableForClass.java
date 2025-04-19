package ComparableVsComparator;

import java.util.*;
// When to Use?
//Use Comparable<T> when natural ordering is sufficient (e.g., sorting numbers, names, marks).
//
//Use Comparator<T> when you need multiple sorting criteria (e.g., sorting by marks, name, or both).
class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // compareTo() method for sorting by marks in ascending order
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class ComparableForClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        Collections.sort(students);  // 🔹 Calls compareTo() automatically
        System.out.println(students);
    }
}

