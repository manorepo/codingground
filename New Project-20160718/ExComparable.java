import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int compareTo(Employee e2){
       // Employee e2=(Employee)o;
    return this.name.compareTo(e2.name);
    }
}

public class ExComparable{

     public static void main(String []args){
        System.out.println("Hello World");
        Employee e1=new Employee(1,"one",1000);
        Employee e2=new Employee(3,"three",100);
     Employee e3=new Employee(6,"six",500);
     Employee e4=new Employee(2,"two",2000);
     Employee e5=new Employee(4,"four",1300);
     Employee e6=new Employee(7,"seven",700);
     ArrayList<Employee> list=new ArrayList<Employee>();
     list.add(e1);
     list.add(e2);
         list.add(e3);
         list.add(e4);
         list.add(e5);
         list.add(e6);
         Collections.sort(list);
         for(int i=0;i<list.size();i++){
         System.out.println(list.get(i).id+" "+list.get(i).name);
         }
     }
}
