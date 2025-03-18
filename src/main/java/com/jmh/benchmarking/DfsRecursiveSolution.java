package com.jmh.benchmarking;
 
public class DfsRecursiveSolution {
    
    public int sumNumbers(TreeNode root) {

        return helper(root, 0);

    }

    public int helper(TreeNode root, int sum) {

        if (root == null) return 0;
        if (root.left == null && root.right == null) return sum * 10 + root.val;

        return helper(root.left, 10 * sum + root.val) + helper(root.right, 10 * sum + root.val);

    }
}