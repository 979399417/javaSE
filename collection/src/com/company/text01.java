package com.company;

import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class text01 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();

       Employee e=new Employee(001,"ss",15155,"se","2007--1");
       list.add(e);
       printfEmpname(list);
}
public static void printfEmpname(List<Employee> list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName());
        }
}
}
