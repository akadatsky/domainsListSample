package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("test.com");
        list.add("test.com");
        list.add("test.com");
        list.add("asdf.com");
        list.add("asdf.com");
        list.add("test.com");
        list.add("google.com");
        list.add("google.com");
        list.add("google.com");
        list.add("test.com");
        list.add("123.com");

        Map<String, Integer> map = new HashMap<>();
        for (String domain : list) {
            if (map.containsKey(domain)) {
                int count = map.get(domain);
                count++;
                map.put(domain, count);
            } else {
                map.put(domain, 1);
            }
        }

        System.out.println(map);

        List<Map.Entry<String, Integer>> entries  = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        System.out.println(entries);



    }
    
}
