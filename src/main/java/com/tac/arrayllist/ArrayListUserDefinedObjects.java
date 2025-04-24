package com.tac.arrayllist;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee(int id, String lastName, String firstName, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class ArrayListUserDefinedObjects {
    public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Ramesh","Fadatare","ramesh@gmail.com"));
        employees.add(new Employee(2,"Kyatham","Mangli","mangli@gmail.com"));
        employees.add(new Employee(3,"Pramod","Jadhav","pramod@gmail.com"));
        employees.add(new Employee(4,"John","Cena","john@gmail.com"));

        employees.forEach((employee)->{
            System.out.println(employee);
        });
    }

}
