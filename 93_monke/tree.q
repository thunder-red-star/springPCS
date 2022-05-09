JAWS: Jacob Kirmayer, Ari Gurovich, William Vongphanith
APCS pd6
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent:0.5 hrs

In which direction does a tree grow?
Down

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
A graph in which a closed tour cannot be generated without going to the same point twice, and in which there exists a path between each
pai of nodes.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?

So the leaf nodes can be accessed by moving down the tree one more time if needed.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?

A tree such that two consecutive numbers are the only possible depths of leaves.

Is a perfect tree complete? 

Yes, because the bottom row is full, and is therefore left justified.

Is a complete tree balanced? 

Yes, because the height of any two nodes differs by at most 1, so the height of the two main subtrees differ by
at most 1.

Is the Man Who Is Tall Happy?



What must be true of perfect trees but not others?

All leaves are at the same depth.

C'EST POSSIBLE?
------------------------------------------------
Solution:

1. Notice that E is first in the pre-order, so it is the root
2. Since E is first in the in-order, it has no children on the left. If it did, they would be first.
3. Since G is second in the pre-order, it must be a child of E, and by step 2, it must be on the right.
4. Since G is last in the in-order, it had no children on the right. If it did, they would be last.
5. Since D is after G in the pre-order, and after E in the in-order, it must be a child of G, and by step 4 it is on the left.
6. Since K is before D in the in-order, K is D's child on the left. As it is right between E and D in the in-order, it has no children.
7. Since I is after K in the pre-order, it must be D's child on the right, since there are no other vacant spots on the tree thus far to
the right of K.
8. Since N is to the left of I and the right of D in the in-order, it must be I's child to the left.
As it is right between I and D in the in-order, it has no children.
9. Since L is to the right of N in the pre-order, it must be I's right child.
10.Since O is to the left of L and the right of I in the in-order, it must be L's child to the left.
As it is right between L and I in the in-order, it has no children.
11. This leaves W, which must be L's right child, completing the tree. 
================================================
