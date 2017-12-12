package com.gevkurg;

import java.util.Stack;


public class BstIterator {
  private Stack<TreeNode> stack;

  public BstIterator(TreeNode root) {
    stack = new Stack<>();
    loadNodes(root);
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode n = stack.pop();
    int val = n.val;
    loadNodes(n.right);
    return val;
  }

  private void  loadNodes (TreeNode node) {
    while (node != null) {
      stack.push(node);
      node = node.left;
    }
  }
}
