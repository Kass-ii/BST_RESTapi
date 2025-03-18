import java.util.Scanner;

public class palendrome {

    public static void rev(String word){

        String[] blank = word.split(" ");

        for(int i = 0; i < blank.length; i++){
            if(isPal(blank[i])){
                System.out.println("is pal");
            }
            else{
                System.out.println("is not pal");
            }
        }
    }

        public static boolean isPal(String blank){

            String Lowerword = blank.toLowerCase();
            int left = 0;
            int right = Lowerword.length() - 1;

            while(left < right){
                if(Lowerword.charAt(left) != Lowerword.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your word to be tested: ");
        String word = input.nextLine();

        rev(word);

        input.close();
    }
}
