

# 🧪 Lab Exercise: Advanced Array Practice (Java)

## 👨‍🏫 Objective
Modify the given Java program to complete the tasks below. The questions are divided into three categories:

1. 🔍 Spot the errors
2. ✍️ Write short array declarations
3. 🔧 Create and implement helper methods

---

## 💻 Starter Code (Modify This)

```java
import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // 2D array for marks of 3 students and 3 subjects
        int[][] marks = {
            {85, 78, 90},
            {88, 92, 79},
            {75, 80, 85}
        };

        // ArrayList of subjects
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Ali", 20);
        students[1] = new Student("Siti", 21);
        students[2] = new Student("Raj", 19);

        // Display all student names
        for (Student s : students) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }

        input.close();
    }
}

// Student class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
```

---

## 🔍 Part A: Spot the Errors (3 Questions)

1. ❌ Fix the following broken array initialization:
   ```java
   double gpa[] = new double(4); // Line to fix
   ```

2. ❌ The following shorthand array causes a compile error. Identify and correct the issue:
   ```java
   int[] points;
   points = {90, 85, 88}; // Line to fix
   ```

3. ❌ Correct the misuse of variable-length arguments:
   ```java
   public static void printTotal(int... values, String title) { // Invalid
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

## 📝 Submission Instructions

- Submit your Lab 3 folder in your file inside [StudentFile](../../StudentFile/)
- Ensure all outputs are printed clearly with labels

---

## ✅ Learning Outcomes

By completing this lab, you will:

- Practice using 1D, 2D, and array of objects
- Understand array passing and returning in Java
- Handle error debugging and method creation using arrays
- Use `ArrayList` and anonymous arrays effectively
- Apply variable-length arguments and nested loops

