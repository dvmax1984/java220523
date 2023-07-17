package Homework.Homework_004.Ex_001;

import java.util.Deque;
import java.util.LinkedList;

public class program {

    public static void main(String[] args) {
        Deque<Integer> num1 = new LinkedList<>();
        num1.addLast(2);
        num1.addLast(3);
        num1.addLast(4);

        Deque<Integer> num2 = new LinkedList<>();
        num2.addLast(5);
        num2.addLast(6);
        num2.addLast(7);

        Deque<Integer> product = multiply(num1, num2);
        System.out.println("Очередь: " + product);
    }

    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        int size1 = num1.size();
        int size2 = num2.size();
        int[] result = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            int digit1 = num1.removeFirst();
            int carry = 0;

            for (int j = 0; j < size2; j++) {
                int digit2 = num2.removeFirst();
                int product = digit1 * digit2 + result[i + j] + carry;
                result[i + j] = product % 10;
                carry = product / 10;
                num2.addLast(digit2);
            }

            if (carry > 0) {
                result[i + size2] += carry;
            }

            num1.addLast(digit1);
        }

        Deque<Integer> product = new LinkedList<>();
        int i = size1 + size2 - 1;

        while (i >= 0 && result[i] == 0) {
            i--;
        }

        while (i >= 0) {
            product.addLast(result[i]);
            i--;
        }

        return product;
    }


}