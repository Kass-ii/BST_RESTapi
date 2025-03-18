import java.util.Scanner;



public class redo {
    public static int counting(String sentence, int result, int number){

        int count = 0;
        String[] words = sentence.split(" ");
        for(String word : words){
            if(word.length() == number){
                count++;
            }

        }
        result = count;
        return result;
    }

    public static void main(String[] args){

        int track = 0;

        Scanner input = new Scanner(System.in);
    
        System.out.print("enter your sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter your target letter count: ");
        int number = input.nextInt();

       

       int result = counting(sentence, track, number);

       System.out.println("Your target word count is: " +result);

       input.close();
    }
}
