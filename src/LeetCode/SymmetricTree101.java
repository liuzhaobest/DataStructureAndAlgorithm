/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
Bonus points if you could solve it both recursively and iteratively.



the solvtion 1 and 2 need further think, in order transversal the same does not mean uniquness.
1. First get the length of the tree, if even, return false, if true, record the number
in order transversal using a stack. If the node is null, still need to push into stack.

2. in order transversal same as anti in order transversal using 2 pointers
if not the same, return false, if both go back to root, return true, if either go to root and other not, return false
This one does not have the null problem.


3. iteratively
add the root twice, add the left.left,right.right,left.right,right.left. and then compare two a time to see if match.

4. recursively
compare the left child and the right child

end case:
both null, end
one null, one not, return false


*/        
