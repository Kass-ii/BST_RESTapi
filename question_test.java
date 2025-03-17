import java.util.Scanner;

public class question_test{

    public static int test_the_number(int number){
        if(number < 0){
            System.out.println("I SAID NO NEGATIVE NUMBERS");
            System.exit(0);
            return 1;
        }
        else{
            return number;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first non negeative number: ");
        int first = input.nextInt();
        first = test_the_number(first);

        System.out.print("Enter the second non negative number: ");
        int second = input.nextInt();
        second = test_the_number(second);

        System.out.print("enter the third non negative number: ");
        int third = input.nextInt();
        third = test_the_number(third);

        int num1 = is_the_same(first);
        int num2 = is_the_same(second);
        int num3 = is_the_same(third);

        boolean result = (num1 == num2) || (num1 == num3) || (num2 == num3);

        System.out.println("Result is: " + result);

        input.close();
    }

    public static int is_the_same(int number){
        while(number >= 10){
            number = number / 10;
        }
        return number;
    }
}
