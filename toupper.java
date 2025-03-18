import java.util.Scanner;

public class toupper {
    public static String choice(String sentence, String letter){

        String[] check = sentence.split(" ");
        for(int i = 0; i < check.length; i++){
            if(check[i] == letter){

                sentence = sentence.toUpperCase();
                return sentence;
            }
        }

        return sentence;
    }

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter your letter: ");
        String letter = input.nextLine();

        String result = choice(sentence, letter);

        System.out.println(result);

        input.close();

    }
 
}
