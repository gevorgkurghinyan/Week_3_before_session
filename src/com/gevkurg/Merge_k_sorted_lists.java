package com.gevkurg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Merge_k_sorted_lists {
  public ListNode mergeKLists(ArrayList<ListNode> a) {
    if (a == null || a.size() == 0) {
      return null;
    }

    ListNode result = new ListNode(-1);
    ListNode current = result;
    PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.val));
    for (int i = 0; i < a.size(); ++i) {
      pq.add(a.get(i));
    }

    ListNode node = null;

    while (pq.size() > 0) {
      node = pq.poll();
      current.next = node;
      current = current.next;
      if (node.next != null) {
        pq.add(node.next);
      }
    }

    return result.next;
  }
}
