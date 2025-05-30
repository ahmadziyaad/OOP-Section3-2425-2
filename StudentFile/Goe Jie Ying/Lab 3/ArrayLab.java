import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part A
        // Question 1
        System.out.println("Part A Q1");
        double gpa [] = new double[4];
        System.out.println("double gpa [] = new double[4];\n");

        // Question 2
        System.out.println("Part A Q2");
        int[] points = {90, 85, 88};
        System.out.println("int[] points = {90, 85, 88};\n");

        // Question 3
        System.out.println("Part A Q3");
        System.out.println("public static void printTotal(String title,int... values) { // Invalid\r\n" + //
                        "        // ...\r\n" + //
                        "    }\n");

        // Part B
        // Question 4
        System.out.println("Part B Q4");
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};\n");

        // Question 5
        System.out.println("Part B Q5");
        ArrayList<Double> grades = new ArrayList<Double>();
        System.out.println("ArrayList<Double> grades = new ArrayList<Double>();\n");

        // Question 6
        printAverage(new int[] {10,20,30,40}); 

        // 1D array for student scores
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // Part C
        // Question 7
        System.out.println("\nPart C Q7");
        int highestScore = findHighestScore(scores);
        System.out.println("Highest Score: " + highestScore);

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

        // Question 8
        System.out.println("\nPart C Q8");
        printStudentInfo(students);

        // Question 9
        System.out.println("\nPart C Q9");
        int marksSum = sumSubjectMarks(marks);
        System.out.println("Sum of Subjects = " + marksSum);

        input.close();
    }
    // Part A Question 3
    public static void printTotal(String title,int... values) { // Invalid
        // ...
    }

    // Part B Question 6
    public static void printAverage(int[] avg){
        int total = 0;
        int count = 0;
        for (int x : avg){
            total += x;
            count++;
        }
        System.out.println("Average = " + total/count + "\n");
    }

    // Part C Question 7
    public static int findHighestScore(int[] scores){
        int highest = scores[0];

        for (int x : scores) {
            if (x > highest){
                highest = x;
            }
        }
        return highest;
    }

    // Part C Question 8
    public static void printStudentInfo(Student[] arr){
        for (Student s : arr){
            System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
        }
    }

    // Part C Question 9
    public static int sumSubjectMarks(int[][] marks){
        int sum = 0;
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j< marks[i].length; j++){
                sum += marks[i][j];
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
