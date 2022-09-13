package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devs;
        Set<String> devSet = new TreeSet<>(new DevComparator());
        for (String key : projects.keySet()) {
            if (projects.get(key).contains(developer)) {
                devSet.add(key);
            }
        }
        devs = new ArrayList<>(devSet);
        return devs;
    }

    static class DevComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() != o2.length()) {
                return Integer.compare(o2.length(), o1.length());
            } else {
                return o2.compareTo(o1);
            }
        }
    }
}
