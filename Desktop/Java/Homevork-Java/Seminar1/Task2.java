import java.util.Scanner;
import java.util.Arrays;

/**
 * Вычислить n! (произведение чисел от 1 до n)
 */


public class Task2 {
    public static void main(String[] args) {
        int n = ex1(n);
        int[] array = new int[n];
        array[0] = 1;
        int res = ex2(array[]);
    }
    public static void ex1(n) {
        System.out.println("Введите число n:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt());
        int n = scanner.nextInt();
        
    }
    public static void ex2(int[] arr) {
        int prod = 1;
        for (int i = 0; i <= arr.length; i++){
            prod = prod * arr[i];
            System.out.println(prod);
        }
    }
}
