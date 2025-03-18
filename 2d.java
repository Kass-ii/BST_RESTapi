import java.util.Scanner;

public class 2d{
    
    
    // Static method to calculate the average of three grades
    public static double calculateAverage(int g1, int g2, int g3) {
        return (g1 + g2 + g3) / 3.0;
    }
    
    // Static method to find the index of the highest average
    public static int findHighestIndex(double[] averages) {
        int highestIndex = 0;
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] > averages[highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }
    
    // Static method to find the index of the lowest average
    public static int findLowestIndex(double[] averages) {
        int lowestIndex = 0;
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] < averages[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 2D array: 10 students, each row holds [ID, grade1, grade2, grade3]
        int[][] studentGrades = new int[10][4];
        // 1D array to store average grades
        double[] averageGrades = new double[10];
        
        System.out.println("Enter ID and grades for 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " - ID: ");
            studentGrades[i][0] = input.nextInt();
            
            System.out.print("Enter 3 grades: ");
            studentGrades[i][1] = input.nextInt();
            studentGrades[i][2] = input.nextInt();
            studentGrades[i][3] = input.nextInt();
            
            // Calculate the average grade for this student
            averageGrades[i] = calculateAverage(
                    studentGrades[i][1],
                    studentGrades[i][2],
                    studentGrades[i][3]
            );
        }
        
        // Find indices of the highest and lowest average grades
        int highestIndex = findHighestIndex(averageGrades);
        int lowestIndex = findLowestIndex(averageGrades);
        
        // Display results formatted to two decimal places
        System.out.printf("The highest average grade is %.2f, from student ID %d.\n",
                averageGrades[highestIndex], studentGrades[highestIndex][0]);
        System.out.printf("The lowest average grade is %.2f, from student ID %d.\n",
                averageGrades[lowestIndex], studentGrades[lowestIndex][0]);
        
        input.close();
    }
}

    

