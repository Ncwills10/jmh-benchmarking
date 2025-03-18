package com.jmh.benchmarking;

import java.util.Stack;

// Solution found with help of ChatGPT

public class DfsSolution {

    public int sumNumbers(TreeNode root) {
        
        if (root == null) return 0;

        int sum = 0;

        Stack <Pair> stack = new Stack<>();

        stack.push(new Pair(root, 0));

        while (!stack.isEmpty()) {

            Pair p = stack.pop();
            TreeNode node = p.node;
            int curr = p.num;

            if (node.left == null && node.right == null) sum += 10 * curr + node.val;
            if (node.left != null) stack.push(new Pair(node.left, 10 * curr + node.val)); 
            if (node.right != null) stack.push(new Pair(node.right, 10 * curr + node.val)); 

        }

        return sum;

    }
}