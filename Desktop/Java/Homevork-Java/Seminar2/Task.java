package Seminar2;
import java.util.Scanner;
import java.util.Map;
import java.util.Hashtable;
/**
 * Доработать код на заполнение элементов
 */

public class Task {
    public static void main(String[] args) {
        GetForm();
        GetNumber();
        Input();
    }

    public static String GetForm() {
        Scanner str = new Scanner(System.in);
        String expression;
        System.out.print("Введите формулу: ");
        expression = str.nextLine();
        return expression;
    }

    public static int GetNumber(){
        Scanner numberS = new Scanner(System.in);
        int number;
        System.out.print("Введите числа, соответствующие переменным: ");
        number = numberS.nextInt();
        return number;
    }

    public static void Input() {
        Map<String, Integer> states = new Hashtable<String, Integer>();
        states.put("0", 0);
        Scanner str = new Scanner(System.in);
        String expression = GetForm();
        expression = String.format(expression).replace(" ", "");
        String[] str1 = expression.split("\\+");
        int sum = 0;
        for (int i = 0; i < str1.length; i++){
            for(Map.Entry<String, Integer> item : states.entrySet()){
                if(item.getKey() != str1[i]){
                    states.put(str1[1], str.nextInt());
                    break;
                }
            }
        }
        for(Map.Entry<String, Integer> item : states.entrySet()){
            sum += item.getValue();
        }
        System.out.println(sum);
    }
}