//Реализовать простой калькулятор
//Написал на методах
package Homework.Homework_001.Ex_003;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        PrintMenuStart();
        float act[] = SelectAction();
        float result = Calculate(act);
        PrintResult(result);        
    }

    private static void PrintResult(float result) {
        System.out.printf("Результат: %f", result);
    }

    static void PrintMenuStart() {
        System.out.println("Калькулятор, 1е выбор действия; 2е - ввод двух чисел по очереди.");
        System.out.println("Выбор действий: \n[1] сложение, \n[2] произведение, \n[3] деление, \n[4] разность, \n[0] выход");
    }

    static float[] SelectAction() {
        
        float acc[] = new float[3];
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите действие: ");
        acc[0] = sc.nextFloat();

        if (acc[0] == 0 || acc[0] >= 5)  {
                sc.close();    
                System.out.print("Выбрали выход из программы");
                System.exit(0);
        }
        
        System.out.print("Введите первое число: ");
        acc[1] = sc.nextFloat();  //hasNextInt
        
        System.out.print("Введите второе число: ");
        acc[2] = sc.nextFloat();

        sc.close();

        return acc;
    }

    static float Calculate(float[] acc) {
        
        float res = 0;

        switch (String.valueOf(acc[0])) {
            case "1.0":
                res = acc[1] + acc[2];
                break;
            case "2.0":
                res = acc[1] * acc[2];
                break;
            case "3.0":
                if (acc[1] == 0 || acc[2] == 0) {
                    System.out.print("Ошибка: на нуль делить нельзя!");
                    System.exit(0);
                }                
                res = acc[1] / acc[2];
                break;
            case "4.0":
                res = acc[1] - acc[2];
                break;

        default:
                System.out.print("Допускается выбор только разрешенных действий. Программа будет закрыта");
                System.exit(0);
                break;
        }        
        return res;
    }
    
}
