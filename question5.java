import java.util.Scanner;


public class question5 {
    public static String strip(String arraylist){
        String[] parses = arraylist.split("[!.,@ ]+");

        for(String parse : parses){
            System.out.println("Your final string words: " +parse);
        }

       return arraylist;

    }
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("enter your sentence: ");

        String words = input.nextLine();
        
        strip(words);

        input.close();


    }
}
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

