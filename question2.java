import java.util.Scanner;

public class question2 {

    public static int MyProgram(int number, String sentence, int count){
        
        String[] words = sentence.split(" ");

        for(String word : words){

            if(word.length() == number){
                count++;
            }

        }

        return count;
    }

        public static void main(String[] args){
            int count = 0;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your sentence: ");
            String words = input.nextLine();

            System.out.print("Enter the target number: ");
            int number = input.nextInt();

            int result = MyProgram(number,words,count);

            System.out.println("The result of words with length: " + number + " is " + result);
        
            input.close();
        }
      

}
