import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Part A : 
        double[] gpa = new double[4]; // Q1
        int[] points = {90,85,88}; //Q2


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

        //Part B
        //Q4
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        //Q5
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(70.0);
        grades.add(86.5);
        grades.add(94.5);

        //Q6
        printAverage(new int[]{10,20,30,40});

        //Part C
        //Q7
        int highest = findHighestScore(scores);
        System.out.println("Highest score:" + highest);

        //Q8
        printStudentInfo(students);

        //Q9
        int totalMarks = sumSubjectMarks(marks);
        System.out.println("Total marks: " + totalMarks);

        input.close();
    }

    //Part A Q3
    public static void printTotal(String title, int... values) {
        int total = 0;
        for (int v : values)
        total += v;
        System.out.println(title + total);
    }

    //Part B Q6
    public static void printAverage(int[] nums){
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        double avg = (double) sum / nums.length;
        System.out.println("Average: " + avg);
    }

    //Part C Q7

    public static int findHighestScore(int[] scores) {
        int max = scores[0];
        for (int s : scores) {
            if (s>max)
            max = s;
        }
        return max;
    }

    //Part C Q8

    public static void printStudentInfo(Student[] arr){
             for (Student s : arr) {
                System.out.println("Student: " + s.getName() + ", Age: " + s.getAge());
            }
    }

    //Part C Q9
    public static int sumSubjectMarks (int[][] marks) {
        int sum = 0;
        for(int[]row : marks){
            for (int v : row){
                sum += v;
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