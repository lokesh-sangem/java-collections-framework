package com.tac.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HashSetUserDefinedObjectsExample {
    public static void main(String[] args) {
        Set<Student>students = new HashSet<>();
        students.add(new Student(101,"Ramesh Fadatare"));
        students.add(new Student(102,"Priya Sharma"));
        students.add(new Student(103,"Rajesh Kumar"));

        students.forEach((student)-> System.out.println(student));
    }


}
