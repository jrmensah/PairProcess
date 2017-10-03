import java.util.Scanner;

public class PairProcess {
    public static void main(String[]args)
    {
        int num1, num2;
        String toAdd="";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number?:" );
        num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Second number?:" );
        num2 = keyboard.nextInt();
        keyboard.nextLine();

        int sum= num1 + num2;
        System.out.print("Sum:" + sum);
        sum = keyboard.nextInt();
        keyboard.nextLine();

         if(sum>200)
             toAdd+="*";
         if(sum<1000)
             toAdd+="~";

         System.out.println("The sum is :" +sum+toAdd);

        int product= num1 * num2;
        System.out.print("Product:" + product);
        product = keyboard.nextInt();
        keyboard.nextLine();

        int average= num1 + num2 / 2;
        System.out.print("Average:" + average);
        average = keyboard.nextInt();
        keyboard.nextLine();
    }

    }


