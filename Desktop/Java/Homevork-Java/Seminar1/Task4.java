import java.util.Scanner;

/**
 * Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
 */

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int num1 = getInt1();
        int num2 = getInt2();
        char operation = operation();
        int result = calc(num1,num2,operation);
        System.out.println("Ответ: "+result);
    }

    public static int getInt1(){
        System.out.println("Введите первое число:");
        if(scanner.hasNextInt());
        int num1 = scanner.nextInt();
        return num1;
    }

    public static int getInt2(){
        System.out.println("Введите второе число:");
        if(scanner.hasNextInt());
        int num2 = scanner.nextInt();
        return num2;
    }

    public static char operation(){
        System.out.println("Введите операцию(+, -, *, /):");
        char operation;
        if(scanner.hasNext());
        operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result = 0;
        if (operation == '+'){
            result = num1 + num2;
        }
        if (operation == '-'){
            result = num1 - num2;
        }
        if (operation == '*'){
            result = num1 * num2;
        }
        if (operation == '/'){
            result = num1 / num2;
        }
        return result;
    }
}



