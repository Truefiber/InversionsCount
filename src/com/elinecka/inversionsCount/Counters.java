package com.elinecka.inversionsCount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gennadiy on 18.05.2014.
 */
public class Counters {
    private static long count = 0;

    static List<Integer> countInversionByMergeSort(List<Integer> list) {



        if (list.size() == 1)
            return list;
        else {
            int divider = (list.size())/2 - 1;

            List<Integer> leftHalf = countInversionByMergeSort(list.subList(0, divider + 1));
            List<Integer> rightHalf = countInversionByMergeSort(list.subList(divider + 1, list.size()));
            List<Integer> cross = mergeAndCount (leftHalf, rightHalf);
            return cross;
        }

    }

    static List<Integer> mergeAndCount (List<Integer> leftList, List<Integer> rightList) {
        List<Integer> mergeList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        for (int k = 0; k < (leftList.size() + rightList.size()); k++) {
            if (i == leftList.size()) {
                mergeList.add(rightList.get(j));
                j++;
            } else if (j == rightList.size()) {
                mergeList.add(leftList.get(i));
                i++;


            } else if (leftList.get(i) < rightList.get(j)) {
                mergeList.add(leftList.get(i));
                i++;
            } else {
                mergeList.add(rightList.get(j));
                j++;

                count += leftList.size() - i;
            }
        }

        return mergeList;

    }

    static long calculateInversions(List<Integer> list) {
        countInversionByMergeSort(list);
        return count;
    }
}
