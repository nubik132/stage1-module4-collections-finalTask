package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)){
                list.add(entry.getKey());
            }
        }
        //list.sort(sortDescendingLength);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if (sortDescendingLength(list.get(i), list.get(j)) < 0){
                    String tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        return list;
    }

    private int sortDescendingLength(String str1, String str2){
        int result = str1.length() - str2.length();
        return result != 0 ? result : str1.compareTo(str2);
    }
}
