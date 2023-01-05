package com.designPattern.iterator;

import java.util.Iterator;

public class StaffListIterator implements Iterator {
    StaffList staffList;
    private int index;
    public StaffListIterator(StaffList staffList){
        this.staffList = staffList;
        index=0;
    }
    @Override
    public boolean hasNext() {
        if(index<staffList.getEmployees().length){
            return true;
        }
        return false;
    }

    @Override
    public Employee next() {
        if(hasNext()){
            return this.staffList.getEmployees()[index++];
        }
        return null;
    }
}
