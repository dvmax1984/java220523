package Homework.Homework_004.Ex_002;

import java.util.Deque;
import java.util.LinkedList;

public class program {
    
    public static void main(String[] args) {
        Deque<Integer> num1 = new LinkedList<>();
        num1.addLast(-2);
        num1.addLast(3);
        num1.addLast(4);

        Deque<Integer> num2 = new LinkedList<>();
        num2.addLast(5);
        num2.addLast(-6);
        num2.addLast(7);

        Deque<Integer> sum = add(num1, num2);
        System.out.println("Результат, сумма: " + sum);
    }
    
    public static Deque<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        int carry = 0;
        Deque<Integer> sum = new LinkedList<>();

        while (!num1.isEmpty() || !num2.isEmpty() || carry != 0) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeFirst();
            int digit2 = num2.isEmpty() ? 0 : num2.removeFirst();
            int total = digit1 + digit2 + carry;
            sum.addLast(total % 10);
            carry = total / 10;
        }

        return sum;
    }

    
}