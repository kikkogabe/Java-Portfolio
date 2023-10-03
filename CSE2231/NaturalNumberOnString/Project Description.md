# Project: NaturalNumber on String

## Objectives
1. Familiarity with writing a kernel class for a new type and its kernel operations (NaturalNumber layered on String).
2. Familiarity with developing and using specification-based test plans.

### The Problem
The problem is to complete and carefully test implementations of all the constructors and kernel methods defined in interface NaturalNumberKernel, building the data structure representing a NaturalNumber object by layering it on top of java.lang.String.

### Setup
Only one member of the team should follow these steps to set up an Eclipse project for this assignment. The project should then be shared with the rest of the team by using the Subversion version control system as learned in the Version Control With Subversion lab.

For this assignment, instead of creating a new project, you will import a project already set-up for you. First you need to download the project, NaturalNumberOnString.zip, to your computer. Click on this download link and save the file somewhere on your hard drive where you can easily find it. Make sure that you do not expand this archive. If your browser automatically expands downloaded zip archives, that's OK too. Just pay attention to the special instructions in the following few steps. You may want to make a note of where you saved it.

Import your new project by following these steps:

1. From the File menu select Import....
2. In the new window, expand General and select Existing Projects into Workspace. Click Next.
3. Click on the radio button next to Select archive file and then click the Browse... button. (If the archive was expanded when you downloaded the file to your own computer, click on Select root directory... instead.)
4. In the file selection window, find the NaturalNumberOnString.zip file and select it. (If your browser expanded the archive, find the NaturalNumberOnString directory instead.) Click OK.
5. Click Finish.

### Method
1. Complete the body of the private method createNewRep, of the four constructors, and of the kernel methods (multiplyBy10, divideBy10, and isZero) in NaturalNumber3 in the src folder.
2. Complete the body of the four constructorTest methods and of the four constructorRef methods in NaturalNumber3Test in the test folder. You can choose any of the available implementations of NaturalNumber as the reference implementation.
3. Develop a complete and systematic test plan for the NaturalNumberKernel constructors and kernel methods and add your test cases at the end of NaturalNumberTest in the test folder. See the lab where you implemented Queue on Sequence for an example of such a test plan, how it is designed, and how each test case is named and structured. A significant portion of your grade for this project will depend on the quality of your test plan.
4. When you and your teammate are done with the project, decide who is going to submit your solution. That team member should select the Eclipse project NaturalNumberOnString (not just some of the files, but the whole project) containing the complete group submission, create a zip archive of it, and submit the zip archive to the Carmen dropbox for this project, as described in Submitting a Project. Note that you will only be allowed one submission per group, that is, your group can submit as many times as you want, but only the last submission will be on Carmen and will be graded. Under no circumstance will teammates be allowed to submit separate solutions. Make sure that you and your partner agree on what should be submitted.
