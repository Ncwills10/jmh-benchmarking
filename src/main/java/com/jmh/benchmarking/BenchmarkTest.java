package com.jmh.benchmarking;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import java.util.Random;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)

public class BenchmarkTest {

    private TreeNode root;
    private BfsSolution bfs;
    private DfsRecursiveSolution dfsRecursion;
    private DfsSolution dfs;

    @Setup(Level.Invocation)
    public void setUp() {

        root = createTree();
        bfs = new BfsSolution();
        dfsRecursion = new DfsRecursiveSolution();
        dfs = new DfsSolution();

    }

    @Benchmark
    public int testBfsSolution() {

        return bfs.sumNumbers(root);

    }

    @Benchmark
    public int testDfsRecursiveSolution() {

        return dfsRecursion.sumNumbers(root);

    }

    @Benchmark
    public int testDfsSolution() {

        return dfs.sumNumbers(root);

    }

    private TreeNode createTree() {
        
        Random rand = new Random();
        TreeNode root = new TreeNode(rand.nextInt(9) + 1);
        root.left = new TreeNode(rand.nextInt(9) + 1);
        root.right = new TreeNode(rand.nextInt(9) + 1);
        root.left.left = new TreeNode(rand.nextInt(9) + 1);
        root.left.right = new TreeNode(rand.nextInt(9) + 1);
        root.right.left = new TreeNode(rand.nextInt(9) + 1);
        root.right.right = new TreeNode(rand.nextInt(9) + 1);
        return root;

    }
}