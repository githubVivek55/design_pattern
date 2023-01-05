package com.designPattern.iterator;

import java.util.Iterator;

public class StaffList implements Iterable{
    private final Employee[] employees;
    public StaffList(Employee...employees){
        this.employees=employees;
    }
    public Employee[] getEmployees(){
        return this.employees;
    }
    @Override
    public Iterator iterator() {
        return new StaffListIterator(this);
    }
}
