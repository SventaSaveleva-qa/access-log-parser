import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите первое число:");
        System.out.println("Введите второе число:");
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();

            int sum = firstNumber + secondNumber;
            double quotient = (double) firstNumber/secondNumber;
        System.out.println("Сумма:"+sum);
        System.out.println("Разница:" + (firstNumber - secondNumber));
        System.out.println("Произведение:" + (firstNumber * secondNumber));
        System.out.println("Частное:" + quotient);
    }
}