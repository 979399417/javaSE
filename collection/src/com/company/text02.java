package com.company;

import java.util.*;

public class text02 {


    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id", 001);
        map.put("name", "帅哥");
        map.put("department", "打杂");
        map.put("hiredate", "2017-1-1");
        map.put("salary", 50000);
        List<Map> list = new ArrayList<Map>();
        list.add(map);
        Map map2 = new HashMap();
        map2.put("id", 001);
        map2.put("name", "bu 哥");
        map2.put("department", "老板");
        map2.put("hiredate", "2016-1-1");
        map2.put("salary", 50000);
        list.add(map2);
        printfmap(list);


    }
    public static final void printfmap(List<Map>list){
        for (int i=0;i<list.size();i++){
            Map temp=list.get(i);
            System.out.println(temp.get("name")+"-----"+temp.get("salary"));
        }
    }
}
