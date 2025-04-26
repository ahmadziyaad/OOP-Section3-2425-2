import java.util.*;

public class Advanced_Array_Practice{

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

        // 4. Declare and initialize a 2D array called matrix 
        // that stores the numbers 1 to 9 arranged in 3 rows and 3 columns.
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // 5. Create an ArrayList named grades that stores Double values for 
        // student grades.
        ArrayList<Double> grades = new ArrayList<>();

        printAverage(new int[]{10, 20, 30, 40});

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

        // 7. Find highest score
        int highestScore = findHighestScore(scores);
        System.out.println("Highest Score: " + highestScore);
        
        // 8. Print student info
        Student.printStudentInfo(students);

        //9. Total student subject marks
        int totalMarks = sumSubjectMarks(marks);
        System.out.println("Total Score: " + totalMarks);

        input.close();
    }

    // 6. Create an anonymous array to store and immediately print the 
    // average of {10, 20, 30, 40} using a helper method printAverage.        
    private static void printAverage(int[] numbers){
        double average;
        double sum = 0;

        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        average = sum/numbers.length;
        System.out.println("Average: " + average);
    }

    // 7. Create a static method named findHighestScore(int[] scores) that 
    // returns the highest value in the scores array. Call it from the 
    // main() method and print the result.
    static int findHighestScore(int[] scores){
        if (scores.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int highestScore = scores[0];
        
        for (int i=1; i<scores.length; i++){
            if (scores[i] > highestScore){
                highestScore = scores[i];
            }
        }
        return highestScore;
    }

    // 9. Write a method sumSubjectMarks(int[][] marks) that returns the sum 
    // of all elements in the marks 2D array and print the result in main().
    public static int sumSubjectMarks(int[][] marks){
        int totalSum = 0;
        for (int student = 0; student < marks.length; student++){
            for (int subject = 0; subject < marks[student].length; subject++){
                totalSum += marks[student][subject];
            }
        }
        return totalSum;
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

    // 8. Write a method named printStudentInfo(Student[] arr) to print all 
    // students’ name and age using enhanced for-each loop. Replace the 
    // existing print loop with a call to this method.
    public static void printStudentInfo(Student[] arr){
        for (Student student: arr){
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}