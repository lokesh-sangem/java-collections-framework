package com.tac.treeset;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
   private int id;
   private String name;

    public Employee(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id,otherEmployee.id);
    }
}
public class TreeSetUserDefinedObjectsExample {
    public static void main(String[] args) {
        SortedSet<Employee>employees = new TreeSet<>();
        employees.add(new Employee(101,"Ramesh"));
        employees.add(new Employee(103,"Sanjay"));
        employees.add(new Employee(102,"Pramod"));
    employees.forEach((employee)-> System.out.println(employee));

        System.out.println("Employees are sorted in ascending order:");
    SortedSet<Employee>employeeTreeSet = new TreeSet<>(Comparator.comparing(Employee::getName));
        employeeTreeSet.add(new Employee(101,"Ramesh"));
        employeeTreeSet.add(new Employee(102,"Bingo"));
        employeeTreeSet.add(new Employee(103,"Ram"));
        employeeTreeSet.add(new Employee(107,"Pooja"));
        employeeTreeSet.add(new Employee(106,"Raj"));
        employeeTreeSet.add(new Employee(104,"Pramod"));
        System.out.println(employeeTreeSet);
    }

}
