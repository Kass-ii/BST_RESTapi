import java.util.Scanner;

public class toUpper_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter a letter: ");
        String letter = sc.nextLine();
        
        
    
        char target = Character.toLowerCase(letter.charAt(0));
        
    
        String[] words = sentence.split(" ");
        
    
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty() && Character.toLowerCase(words[i].charAt(0)) == target) {
                words[i] = words[i].toUpperCase();
            }
        }
        
    
        String newSentence = String.join(" ", words);
        System.out.println("Modified sentence: " + newSentence);
        
        sc.close();
    }
}
