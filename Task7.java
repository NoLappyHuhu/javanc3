import java.util.Scanner;

public class Task7{

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Input num1: ");
        int num1 = user.nextInt();
        System.out.print("Input num2: ");
        int num2 = user.nextInt();

        System.out.printf("Addition: %d\nSubtraction: %f\nMultiplication: %d\nDivision: %f\n5",
            addition(num1,num2),subtraction(num1,num2),multiplication(num1,num2),division(num1,num2)
        );
    }

    public static  int addition(int a, int b){
        return a+b;
    }
    public static double subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static double division(int a, int b){
        return a/b;
    }
}