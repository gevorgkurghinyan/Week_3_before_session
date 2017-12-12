package com.gevkurg;

import java.util.List;


public class Rotated_Sorted_Array_Search {
  public static int search(final List<Integer> a, int b) {
    if (a == null || a.size() == 0) {
      return -1;
    }

    int start = 0;
    int end = a.size() - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (a.get(mid) == b) {
        return mid;
      }

      if (a.get(start) < a.get(mid)) {
        if (b >= a.get(start) && b < a.get(mid)) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (b > a.get(mid) && b <= a.get(end)) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }

    return a.get(start) == b ? start : -1;
  }
}
