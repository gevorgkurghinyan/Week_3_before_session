package com.gevkurg;

public class Least_Common_Ancestor {
  private boolean v1 = false;
  private boolean v2 = false;

  public int lca(TreeNode a, int val1, int val2) {

    if (checkVals(a, val1, val2)) {

      TreeNode n = lcaHelper(a, val1, val2);
      if (n == null) {
        return -1;
      }

      return n.val;
    }

    return -1;
  }

  private TreeNode lcaHelper(TreeNode a, int val1, int val2) {
    if (a == null) {
      return null;
    }

    if (a.val == val1 || a.val == val2) {
      return a;
    }

    TreeNode leftNode = lcaHelper(a.left, val1, val2);
    TreeNode rightNode = lcaHelper(a.right, val1, val2);

    if (leftNode != null && rightNode != null) {
      return a;
    }

    return leftNode != null ? leftNode : rightNode;
  }

  private boolean checkVals(TreeNode n, int val1, int val2) {
    if (n == null) {
      return false;
    }

    if (n.val == val1) {
      v1 = true;
      if (v2) {
        return true;
      }
    }

    if (n.val == val2) {
      v2 = true;
      if (v1) {
        return true;
      }
    }

    return checkVals(n.left, val1, val2) || checkVals(n.right, val1, val2);
  }
}
