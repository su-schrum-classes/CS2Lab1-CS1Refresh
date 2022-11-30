# CS1 Refresher

This lab will introduce you to using GitHub codespaces, unit testing with gradle, and refresh you on some content that you hopefully learned in CS1. However, everyone's background is different, and some people have programmed less frequently than others, so don't worry if you can't complete all of these exercises. However, do let me know where you need the most help, and try to fill in the gaps.

## Code to Write

The file you need to write code in is `src/main/java/refresh/Refresh.java`. The reason that such a convoluted file path is needed is because the tool we will be using for unit testing, `gradle`, imposes some restrictions on the directory structure. More on this in a moment. There are too many exercises in `Refresh.java` for you to reasonably complete in the class time. I recommend that you attempt one or two easy exercises of your choice, and then challenge yourself by specifically attempting one that you perceive as more difficult. If you successfully code these exercises, then keep going, but be sure to verify that your code works before moving on to other exercises.

## Unit Testing

A major focus of this class will be writing unit tests to verify the functionality of your code. However, for today, you will mainly just be using pre-existing unit tests to be able to appreciate their benefit. To test the functionality of your code, type the following in the console and press enter:
```
gradle test
```
Given that you are starting from scratch, this should report that the build failed. All of the exercises will be listed with a stack track detailing exactly how the output produced by your code different from what was expected. As you succesfully complete the exercises in `Refresh.java`, the red FAILED messages will change to green PASSED messages.