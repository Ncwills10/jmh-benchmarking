In this simple project, I use JMH benchmarking to determine the average execution time for three different types of solutions to the 'Sum Root to Leaf Node' coding problem. 
I used ChatGPT to help with some of the solutions and to help write the code.

The 'Sum Root to Leaf Node' problem is thus:

Say we have a Binary Tree e.g.

            1
          /   \
        5       2

Return the sum of all numbers represnted by a path root to leaf, so for this, the answer is 15 + 12 = 27.

The three solutions I give use BFS, DFS with recursion, and DFS iteratively.

My results (ms/op) (My test trees were all quite small so the actual execution times are small. 
The relevant information below is the comparative times):
BFS: 10^-4 ms
DFS Recursive: 10^-5 ms
DFS: 10^-4 ms

Therefore the recursive method is quickest given the parameters of this test.
