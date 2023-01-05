package com.designPattern.iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Employee emp1 = new Employee("vivek");
        Employee emp2 = new Employee("Neha");
        Employee emp3 = new Employee("Rahul");

        StaffList staffList = new StaffList(emp1,emp2,emp3);
        Iterator iterator = staffList.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            System.out.println(employee.getName());
        }
    }
}
