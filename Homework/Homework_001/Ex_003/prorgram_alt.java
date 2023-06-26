//Реализовать простой калькулятор

package Homework.Homework_001.Ex_003;

import java.util.Scanner;

public class prorgram_alt {
    public static void main(String[] args) {
        
        System.out.println("Калькулятор, 1е - вводим два числа, 2е- выбираем действия");
        System.out.println("Выбор действий: \n[1] сложение, \n[2] произведение, \n[3] деление, \n[4] разность, \n[0] выход");

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float num1 = sc.nextFloat();  //hasNextInt
        
        System.out.print("Введите второе число: ");
        float num2 = sc.nextFloat();

        System.out.print("Введите второе число: ");
        int act = sc.nextInt();

        sc.close();

        float res = 0;

        switch (act) {
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 * num2;
                break;
            case 3:
                res = num1 / num2;
                break;
            case 4:
                res = num1 - num2;
                break;
            case 0:
                System.exit(0);
        default:
                //text = "mistake";
                break;

        }
        System.out.println(res);        
    }    
}