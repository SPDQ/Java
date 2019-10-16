# Running_time_test_java

Introduction
---
In this project, we use junit to write a running time test program by Java. The program to be tested is a function which judges whether the
input integer is a prime or not. We set the time limit as two seconds. 

Run the test program
---
We run our program in windows operation system. After download our code, open command prompt and come to your program directory. Then input
command below in command prompt to compile all the .java file.
```
set CLASSPATH=./hamcrest-core-1.3.jar;./timelimited.jar;./junit-4.11.jar;%classpath%
javac -d . *.java
```
Use the command below to run test program. The first command is to test whether the outcome of the program to be tested is correct. The 
second command is to test whether the program's running time is within the time limit.
```
java org.junit.runner.JUnitCore com.vroom.core.test.MathTest
java org.junit.runner.JUnitCore com.vroom.core.test.RealMathTest
```
