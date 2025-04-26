Below is a fully reworked and well-organized **Markdown version of the notes** from "Chapter 4 - Array" with:

- ✅ All key concepts highlighted
- ✅ Sample code for each concept
- ✅ A complete example at the end that ties everything together
- ✅ In-depth comments to guide learners

---


```markdown
# Chapter 4 - Arrays in Java

## 🔸 What is an Array?

An **array** is a data structure used to store multiple values of the **same type** in a **single variable**, instead of declaring separate variables for each value.

```java
int[] myArray = new int[5]; // stores 5 integers
```

---

## 🔸 Declaring and Creating Arrays

### Method 1: Two-Step Declaration

```java
double[] myList;             // Step 1: Declare
myList = new double[10];     // Step 2: Create
```

### Method 2: One-Step Declaration

```java
double[] myList = new double[10]; // Preferred
```

---

## 🔸 Accessing Array Elements

Use an index starting from `0`:

```java
myList[0] = 5.6;                 // Assign value
System.out.println(myList[0]);  // Access value
```

---

## 🔸 Array Length

Get the number of elements using `.length`:

```java
System.out.println(myList.length); // prints 10
```

---

## 🔸 Default Values

| Data Type  | Default Value |
|------------|---------------|
| int, double, float | 0           |
| char       | '\u0000'      |
| boolean    | false         |

---

## 🔸 Initializing with Loop

```java
final int SIZE = 10;
double[] myList = new double[SIZE];
for(int i = 0; i < myList.length; i++) {
    myList[i] = i * 1.5;
}
```

---

## 🔸 Shorthand Initialization

```java
double[] myList = {5.6, 4.5, 3.3, 13.2, 4.0};
```

❗Cannot split this into two statements. This will throw error:

```java
double[] myList;
myList = {5.6, 4.5}; // ❌ Error
```

---

## 🔸 For-each Loop (Enhanced For Loop)

```java
for (double value : myList) {
    System.out.println(value);
}
```

---

## 🔸 Passing Arrays to Methods

### Passing an Element

```java
public static void showValue(int num) {
    System.out.println(num + 2);
}
```

### Passing an Entire Array

```java
public static void showArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```

---

## 🔸 Returning Array from Method

```java
public static int[] reverse(int[] list) {
    int[] result = new int[list.length];
    for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
        result[j] = list[i];
    }
    return result;
}
```

---

## 🔸 Variable-Length Arguments

```java
public static void printMax(double... numbers) {
    double max = numbers[0];
    for (double num : numbers) {
        if (num > max) max = num;
    }
    System.out.println("Max: " + max);
}
```

---

## 🔸 Two-Dimensional Arrays

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Loop through 2D array:

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## 🔸 Ragged Arrays

```java
int[][] triangle = new int[5][];
for (int i = 0; i < triangle.length; i++) {
    triangle[i] = new int[i + 1]; // different lengths
}
```

---

## 🔸 Array of Objects

```java
class Employee {
    int id;
    double salary;
    Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
}

Employee[] empList = new Employee[3];
empList[0] = new Employee(1, 3000);
```

---

## 🔸 ArrayList (Dynamic Array)

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Ali");
names.add("Siti");
System.out.println(names.get(0)); // Ali
```

With generics:

```java
ArrayList<Integer> nums = new ArrayList<>();
nums.add(10);
nums.add(20);
System.out.println(nums); // [10, 20]
```

---

# ✅ Complete Code Example (All Concepts Combined)

```java
import java.util.*;

public class ArraySummaryDemo {

    // Reverse an array
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    // Print values of a 1D array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Declare and initialize an array
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt(); // input values
        }

        // 2. Print using regular for loop
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 3. Print using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int val : numbers) {
            System.out.print(val + " ");
        }

        // 4. Reverse and return new array
        int[] reversed = reverse(numbers);
        System.out.println("\nReversed array:");
        printArray(reversed);

        // 5. Demonstrate 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("2D Array:");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // 6. ArrayList usage
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kuala Lumpur");
        cities.add("Johor Bahru");
        System.out.println("Cities: " + cities);

        input.close();
    }
}
```



