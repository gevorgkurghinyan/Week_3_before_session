package com.gevkurg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<> (Arrays.asList(9, 10, 11, 12, 14, 15, 17, 19, 24, 25, 30, 39, 40, 44, 46, 48, 51, 53, 54, 56, 59, 60, 69, 70, 73, 75, 80, 87, 88, 89, 92, 93, 97, 99, 104, 107, 109, 110, 111, 117, 123, 124, 125, 126, 127, 128, 135, 136, 137, 141, 148, 153, 154, 161, 166, 167, 169, 175, 177, 180, 181, 182, 185, 186, 189, 193, 198, 202, 1, 2, 6, 7));

        Rotated_Sorted_Array_Search.search(list, 198);
    }
}
