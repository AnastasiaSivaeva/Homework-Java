import java.util.Scanner;

/**
 * Вывести все простые числа от 1 до 1000 
 * (простые числа - это числа которые делятся только на себя и на единицу без остатка. Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
 */

public class Task3 {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 1000; i++){
            boolean a = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    a = false;
                    break;
                }
            }
            if (a){
                System.out.println(i);
        }
    }
}
}
