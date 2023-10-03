# Project: Word Counter
Note: This first project must be done individually. Starting with the next project, you will work on all remaining projects with a teammate.

## Objectives
1. Familiarity with designing and coding a realistic component-based application program without being provided a skeleton solution.

### The Problem
Write a Java program that counts word occurrences in a given input file and outputs an HTML document with a table of the words and counts listed in alphabetical order. Here are some initial requirements:

- The program shall ask the user for the name of an input file and for the name of an output file.
- The input file can be an arbitrary text file. No special requirements are imposed.
- The output shall be a single well-formed HTML file displaying the name of the input file in a heading followed by a table listing the words and their corresponding counts. The words should appear in alphabetical order.
- Words contain no whitespace characters. Beyond that, it is up to you to come up with a reasonable definition of what a word is and what characters (in addition to whitespace characters) are considered separators.
- In the first item above, "name of an input file" and "name of an output file" are to be understood as follows. Each includes the notion of a path to the terminal name. The path may either be relative to a current folder or be absolute from the top of the file system. It would be bad form for the program to insert an implied sub-path or folder prior to or after what the user supplies as input. Similarly, it would be bad form for the program to supply an implied filename extension such as ".txt" or ".html" after what the user supplies as input. Therefore, the program shall respect the user input as being the complete relative or absolute path as the name of the input file, or the name of the output file, and will not augment the given path in any way, e.g., it will not supply its own filename extension. For example, a reasonable user response for the name of the input file could directly result in the String value "data/gettysburg.txt"; similarly, a reasonable user response for the name of the output file could directly result in the String value "data/gettysburg.html".
These are the stated requirements for your program. If you have questions of clarification or need additional details, ask in class.

### Setup
You're on your own! There are no other setup instructions. As a reminder, instructions on how to set up Eclipse and to create a new project from the ProjectTemplate are available here, and instructions on how to submit the project are available here.

### Method
When you are satisfied that your program works, select your Eclipse project (not just some of the files, but the whole project), create a zip archive of it, and submit the zip archive to the Carmen dropbox for this project, as described in Submitting a Project.

Your grade will depend not merely on whether the final program meets the initial requirements, of course, but also on the general software quality factors you've learned in CSE 2221: understandability, precision, appropriate use of existing software components, maintainability, adherence to coding standards, and so forth.

A sample input file is available at:

     gettysburg.txt
  
A sample of the corresponding program output is available at:

     gettysburg.html
  
You should not assume that your output must look exactly like this one, which is merely a sample of what the output might be. You should feel free to improve on it.
