# 📘 OOP Lab Exercise 3 - Advanced Array Practice (Java)

## 👨‍🏫 Objective
Modify the given Java program to complete the tasks below. The questions are divided into three categories:

1. 🔍 Spot the errors -- **(⭐Answered below⭐)**
2. ✍️ Write short array declarations -- **(⭐Answered in file name Advanced_Array_Practice.java⭐)**
3. 🔧 Create and implement helper methods -- **(⭐Answered in file name Advanced_Array_Practice.java⭐)**

---

## 🔍 Part A: Spot the Errors (3 Questions)

1. ❌ Fix the following broken array initialization:
   ```java
   double gpa[] = new double(4); // Line to fix
   ```
   ✅ The correct syntax:
   ```java
   double[] gpa = new double(4);
   ```

3. ❌ The following shorthand array causes a compile error. Identify and correct the issue:
   ```java
   int[] points;
   points = {90, 85, 88}; // Line to fix
   ```
   ✅ The correct syntax:
   ```java
   int[] points;
   points = new int[] {90, 85, 88};
   ```

4. ❌ Correct the misuse of variable-length arguments:
   ```java
   public static void printTotal(int... values, String title) { // Invalid
       // ...
   }
   ```
   ✅ The correct syntax:
   ```java
   public static void printTotal(String title, int... values) {
       // ...
   }
   ```
   
---

## ✍️ Part B: Write Short Array Declarations (3 Questions)

Modify the starter code and **add these declarations**:

4. 📌 Declare and initialize a 2D array called `matrix` that stores the numbers 1 to 9 arranged in 3 rows and 3 columns.

5. 📌 Create an ArrayList named `grades` that stores `Double` values for student grades.

6. 📌 Create an anonymous array to store and immediately print the average of `{10, 20, 30, 40}` using a helper method `printAverage`.

---

## 🔧 Part C: Create & Use Methods (3 Questions)

7. 🔧 Create a static method named `findHighestScore(int[] scores)` that returns the highest value in the `scores` array. Call it from the `main()` method and print the result.

8. 🔧 Write a method named `printStudentInfo(Student[] arr)` to print all students’ name and age using enhanced `for-each` loop. Replace the existing print loop with a call to this method.

9. 🔧 Write a method `sumSubjectMarks(int[][] marks)` that returns the sum of all elements in the `marks` 2D array and print the result in `main()`.

---

