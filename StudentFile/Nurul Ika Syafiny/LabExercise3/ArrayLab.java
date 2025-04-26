import java.util.*;

public class ArrayLab {

    // Part A: Fixed array initialization errors
    double[] gpa = new double[4]; // FIXED
    int[] points = new int[] {90, 85, 88}; // FIXED
    public static void printTotal(String title, int... values) {
    } //FIXED

    //PART B & C
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Anonymous array with average printed using helper
        printAverage(new int[] {10, 20, 30, 40}, "Average of 10, 20, 30, 40");

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

        //Matrix array declarations
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArrayList<Double> grades = new ArrayList<>();
        grades.add(88.5);
        grades.add(76.0);
        grades.add(92.5);

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Ali", 20);
        students[1] = new Student("Siti", 21);
        students[2] = new Student("Raj", 19);

        //Use helper method to print student info
        printStudentInfo(students);

        //Call method to find highest score
        int highest = findHighestScore(scores);
        System.out.println("Highest score entered: " + highest);

        //Sum of all subject marks
        int totalMarks = sumSubjectMarks(marks);
        System.out.println("Total sum of all marks: " + totalMarks);

        input.close();
    }

    public static void printAverage(int[] values, String title) {
        int sum = 0;
        for (int v : values) sum += v;
        double average = (double) sum / values.length;
        System.out.println(title + " = " + average);
    }

    //Find the highest score in an array
    public static int findHighestScore(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    //Print student info using enhanced loop
    public static void printStudentInfo(Student[] arr) {
        for (Student s : arr) {
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
    }

    //Sum of all elements in 2D array
    public static int sumSubjectMarks(int[][] marks) {
        int sum = 0;
        for (int[] row : marks) {
            for (int mark : row) {
                sum += mark;
            }
        }
        return sum;
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

