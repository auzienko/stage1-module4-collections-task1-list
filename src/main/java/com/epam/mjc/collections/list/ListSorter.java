package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer i = Integer.parseInt(a);
        Integer j = Integer.parseInt(b);

        i = getValue(i);
        j = getValue(j);

        if (i.equals(j)) {
            return a.compareTo(b);
        }
        return i.compareTo(j);
    }

    private Integer getValue(Integer x) {
        return 5 * x * x + 3;
    }


}
