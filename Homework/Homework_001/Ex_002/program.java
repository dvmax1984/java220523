//Задача 2) Вывести все простые числа от 1 до 1000

package Homework.Homework_001.Ex_002;

public class program {
    public static void main(String[] args) {
        
        boolean b = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                
                if ((i % j) == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.printf("%d ", i);
            else b = true;
        }
    }
}

