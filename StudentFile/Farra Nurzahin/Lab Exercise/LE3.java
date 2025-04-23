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
        
        //Part A: Question 1
        double gpa[] = new double[4];
        
        //Part A: Question 2
        int[] points = {90, 85, 88};

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
    
    //Part A: Question 3
    public static void printTotal(String title, int... values) { 
    // ...
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
