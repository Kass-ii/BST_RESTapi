import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = input.nextLine();

        System.out.println("your name is: " + name);

        input.close();
    }   
}
