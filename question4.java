import java.util.Scanner;


public class question4 {
    public static int grades(int array[][]){
    
    /*
 int[][] grades = 2d Array

 int total_students = 0

 scanner(total_students)

 for i (0 - total_students) {
    int[] grade = 1d Array
    [0] = scanner() <- for id
    
    [1 - 3] = scanner() <- for grades
 }
*/
    Scanner input = new Scanner(System.in);

    for(int i = 0; i < 10; i++){

        System.out.print("enter your ID: ");
        int grade = input.nextInt();

        array[i][] = grade;

        for(int j = 0; j < 3; j++){
            System.out.print("What is your first score ");
            int score1 = input.nextInt();

            System.out.print("What is your second score ");
            int score2 = input.nextInt();

            System.out.print("What is your third score ");
            int score3 = input.nextInt();

            int final_score = score1 + score2 + score3;

            array[][j] = final_score / 3;
   
        }


    }
}
}
