import java.util.*;

public class ArrayLab {

    // Part A: Spot the Errors
    // 1.
    double[] gpa = new double[4];
    // 2.
    int[] points = { 90, 85, 88 };

    // 3.
    public static void printTotal(String title, int... values) {
    }

    // Part B:
    // 4.
    int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    // 5.
    ArrayList<Double> grade = new ArrayList<Double>();

    //6.
    public static void printAverage(int[] averageOfArray) {
        int sum = 0;
        for (int i = 0; i < averageOfArray.length; i++) {
            sum += averageOfArray[i];
        }
        int average = sum / averageOfArray.length;

        System.out.println("Average: " + average);
    }

    // 7.
    public static void findHighestScore(int[] scores) {
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        System.out.println("Highest score: " + highest);
    }

    // 8.
    public static void printStudentInfo(Student[] stu) {
        for (Student i : stu) {
            System.out.println("Student: " + i.getName() + ", Age: " + i.getAge());
        }
    }

    // 9.
    public static void sumSubjectMarks(int[][] marks) {
        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            System.out.println("Total marks for student " + (i + 1) + ": " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 6.
        printAverage(new int[] { 10, 20, 30, 40 });

        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // 7.
        findHighestScore(scores);

        // 2D array for marks of 3 students and 3 subjects
        int[][] marks = {
                { 85, 78, 90 },
                { 88, 92, 79 },
                { 75, 80, 85 }
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
        printStudentInfo(students);

        // Display total marks for each student
        sumSubjectMarks(marks);

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
