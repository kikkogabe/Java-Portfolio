# Project: NaturalNumber Roots

## Objectives
1. Familiarity with using NaturalNumber objects and methods.
2. Familiarity with using interval halving to invert a function.

### The Problem
Your job is to implement the root static method for NaturalNumber using the interval halving root algorithm you developed in an earlier homework and lab for integer roots.

### Setup
1. Create a new Eclipse project by copying ProjectTemplate or a previous project you have created, naming the new project NaturalNumberRoot.
2. Open the src folder of this project and then open (default package). As a starting point you can use any of the Java files. Rename it NaturalNumberRoot and delete the other files from the project.
3. Follow the link to NaturalNumberRoot.java, select all the code on that page and copy it to the clipboard; then open the NaturalNumberRoot.java file in Eclipse and paste the code to replace the file contents. Save the file.

### Method
1. Edit NaturalNumberRoot.java to implement the root static method with the interval halving algorithm. Here is the contract:
```java
/**
 * Updates {@code n} to the {@code r}-th root of its incoming value.
 * 
 * @param n
 *            the number whose root to compute
 * @param r
 *            root
 * @updates n
 * @requires r >= 2
 * @ensures n ^ (r) <= #n < (n + 1) ^ (r)
 */
public static void root(NaturalNumber n, int r) {...}
```
2. For this method you can use any NaturalNumber methods except for NaturalNumber's own instance method root. Run the NaturalNumberRoot program to test your implementation of root.
Select your Eclipse project NaturalNumberRoot (not just some of the files, but the whole project), create a zip archive of it, and submit the zip archive to the Carmen dropbox for this project, as described in Submitting a Project.
