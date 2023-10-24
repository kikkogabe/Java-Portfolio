# Project: Doubly-Linked List Implementation of List with Retreat

## Objectives
1. Familiarity with writing a kernel class for a new type and its kernel operations (List with the extra retreat method) using references (also known as pointers) to build a doubly-linked list of nodes.
2. Familiarity with developing and using specification-based test plans.

### The Problem
The problem is to complete and carefully test implementations of the constructor and all kernel methods defined in interface ListKernel plus the methods retreat and moveToFinish defined in interface List, by building a representation that involves a doubly-linked list of nodes using Java references.

The retreat method gives the client the ability to move backward one position at a time. The ListKernel allows only incremental forward movement; moving backward is possible only by "jumping" all the way back to the start using moveToStart. Method retreat is just the inverse of advance.

Note that retreat (and moveToFinish) can be implemented by layering, i.e., by using only the ListKernel methods and, indeed, such implementations exist in the ListSecondary class. You should know how to write that code! However, the execution time of the layered implementations is linear in the length of the left string of the list (for retreat or of the right string of the list for moveToFinish). The challenge here is to implement ListKernel and retreat and moveToFinish so all the methods take constant time, independent of the sizes of the left and right strings of the list. This is possible only by implementing all the methods directly, i.e., not by layering on an existing implementation of ListKernel but by creating an entirely new implementation that is based on a doubly-linked list data structure.

### Setup
Only one member of the team should follow the steps to set up an Eclipse project for this assignment. The project should then be shared with the rest of the team by using the Subversion version control system as learned in the Version Control With Subversion lab.

To get started, import the project for this assignment, ListWithRetreat, from the ListWithRetreat.zip file available at this link. If you don't remember how to do this, see these Setup instructions from an earlier project.

### Method
1. Complete the bodies of the private method createNewRep, the constructor, the kernel methods (addRightFront, removeRightFront, advance, moveToStart, leftLength, and rightLength), and the moveToFinish and retreat methods in List3 in the src folder.
2. Review the test plan for the ListKernel constructor, kernel methods, and iterator provided in ListTest in the test folder. At the end of ListTest.java, add appropriate test cases (consistent with the given plan) for the retreat method. Test your List3 implementation. Important Note: Even if your implementation passes all the given test cases, it does not mean it is correct! Testing is not a substitute for carefully and thoughtfully reviewing your code to convince yourself that it is correct through reasoning.
3. When you and your teammate(s) are done with the project, decide who is going to submit your solution. That team member should select the Eclipse project ListWithRetreat (not just some of the files, but the whole project) containing the complete group submission, create a zip archive of it, and submit the zip archive to the Carmen dropbox for this project, as described in Submitting a Project. Note that you will only be allowed one submission per group, that is, your group can submit as many times as you want, but only the last submission will be on Carmen and will be graded. Under no circumstance will teammates be allowed to submit separate solutions. Make sure that you and your partner agree on what should be submitted
