package com.jmh.benchmarking;

// This TreeNode class is taken from the LeetCodee task: "Sum Root to Leaf Numbers"

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;
        this.left = left;
        this.right = right;
        
  }
}