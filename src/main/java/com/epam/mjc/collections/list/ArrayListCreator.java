package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int index = 1;
        ArrayList<String> resultList = new ArrayList<>();
        for (String s : sourceList) {
             if (index++ % 3 == 0) {
                 resultList.add(s);
                 resultList.add(s);
             }
        }
        return resultList;
    }
}
