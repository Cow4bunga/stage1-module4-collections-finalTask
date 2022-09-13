package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int len = entry.getKey().length();
            Set<String> tmp = new HashSet<>();
            for (String item : sourceMap.keySet()) {
                if (item.length() == len) {
                    tmp.add(item);
                }
            }
            map.put(len, tmp);
        }
        return map;
    }
}
