package com.practise.core.Comparator;

import java.util.Comparator;

public class ENameSort implements Comparator<Employee> 
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEname().compareToIgnoreCase(o1.getEname());
    }

}
