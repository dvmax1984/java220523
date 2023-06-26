package Homework.Homework_001.Ex_003;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class program_split {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите задачу, в одно действие, пример: 2*5: ");
        String s = sc.nextLine();
        sc.close();

        s = s.replaceAll("\\+", " +");

        int index1 = s.indexOf("+");

        if(index1 != - 1) {
            // +
            String[] words = s.split(" +");
            words[1] = words[1].replaceAll(" +", "");
            for (String word : words)
            System.out.println(word);
        }
        else {
            System.out.println("sdsd");
        }

        // else if (s.indexOf("*") != - 1) {
        //     // +
        // }
        // else if (s.indexOf("/") != - 1) {
        //     // /
        // }
        // else if (s.indexOf("-") != - 1) {
        //     // -
        // }         
        // else {
        //  System.out.println("Знак дейсвтия не определен");
        // }
        }    
    }

