package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        sourceMap.forEach((name, digit) -> addNameLengthAndNameToMap(name, map));
        return map;
    }

    private void addNameLengthAndNameToMap(String name, Map<Integer, Set<String>> map){
        if (!map.containsKey(name.length())){
            Set<String> set = new HashSet<>();
            set.add(name);
            map.put(name.length(), set);
        }
        else {
            map.get(name.length()).add(name);
        }
    }
}
