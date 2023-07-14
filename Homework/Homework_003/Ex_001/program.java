package Homework.Homework_003.Ex_001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class program {

 /* 
 Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 1) + Нужно удалить из него чётные числа
 2) +Найти минимальное значение
 3) +Найти максимальное значение
 4) +Найти среднее значение
 */
     public static void main(String[] args) {
        
        List<Integer> listwork = CreateList();
        DeleteAnEven(listwork);

        System.out.println("Min: " + MinValue(listwork));
        System.out.println("Max: " + MaxValue(listwork));
        System.out.println("Mean: " + AvgValue(listwork));
    }   
 
 
    public static List<Integer> CreateList() {
        Random random = new Random();
        int size = 10;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static int MaxValue(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int MinValue(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double AvgValue(List<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum += number;
        }
    double average = sum / list.size();        
    return average;
    }       



    public static List<Integer> DeleteAnEven(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println(list.toString());
        return list;
    }
}
