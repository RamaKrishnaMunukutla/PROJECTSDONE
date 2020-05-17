package com.practise.core.Comparator;

import java.util.Comparator;

public class IdSort implements Comparator<Employee> 
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getEid().compareTo(o1.getEid());
    }
}
