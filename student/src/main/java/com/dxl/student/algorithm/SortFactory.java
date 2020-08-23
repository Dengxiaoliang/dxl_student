package com.dxl.student.algorithm;

import java.util.HashMap;
import java.util.Map;

public class SortFactory {
    private static Map<SortType, Sortor> sortorMap = new HashMap<SortType, Sortor>();

    public static <T extends Sortor> Sortor getInstance(SortType name, Class<T> tClass) {
        if (sortorMap.containsKey(name)) {
            return sortorMap.get(name);
        } else {
            try {
                T t = tClass.newInstance();
                sortorMap.put(name,t);
                return t;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
