package com.jmh.benchmarking;

import java.util.Queue;
import java.util.LinkedList;

// Solution found with help of ChatGPT

public class BfsSolution {
    
    public int sumNumbers(TreeNode root) {

        if (root == null) return 0;
        
        int sum = 0;

        Queue <Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();
            TreeNode node = p.node;
            int curr = p.num;

            if (node.left == null && node.right == null) sum += 10 * curr + node.val;
            if (node.left != null) q.add(new Pair(node.left, 10 * curr + node.val));
            if (node.right != null) q.add(new Pair(node.right, 10 * curr + node.val));

        }

        return sum;

    }
}