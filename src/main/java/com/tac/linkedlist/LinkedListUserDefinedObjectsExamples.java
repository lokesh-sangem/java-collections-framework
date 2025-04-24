package com.tac.linkedlist;

import java.util.LinkedList;
import java.util.List;

class Student{
     private int id;
     private String name;
     private String department;

     public Student(int id, String name,String department) {
         this.id = id;
         this.name = name;
         this.department = department;
     }


     @Override
     public String toString() {
         return "Student{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", department='" + department + '\'' +
                 '}';
     }
 }
public class LinkedListUserDefinedObjectsExamples {

    public static void main(String[] args) {
        List<Student>studentList = new LinkedList<>();
        studentList.add(new Student(1,"Lokesh","ECE"));
        studentList.add(new Student(2,"Rautela","'CSE"));
        studentList.add(new Student(3,"Srinivas","IT"));

        studentList.forEach(student-> System.out.println(student));
    }

}
