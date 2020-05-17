package com.practise.core.Comparator;

import java.util.Comparator;

public class ElocSort implements Comparator<Employee> 
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getEloc().compareTo(o1.getEloc());
    }
}
