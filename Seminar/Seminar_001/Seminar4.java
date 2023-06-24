package java220523.Seminar.Seminar_001;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Seminar4 {
    public static void main(String[] args) {
        //helloUser();
        //quantityOfSame();
        //magicIndex();
        reversePhrase();
    }

    static void helloUser() {                
        Scanner sc = new Scanner(System.in);

        int hour = LocalDateTime.now().getHour();
        //System.out.println(hour);

        System.out.println("Input your name here: ");
        String name = sc.nextLine();

        String dayTime = "";
        if(hour >= 4 && hour < 11)
            dayTime = "morning";
        else if (hour >= 11 && hour < 17)
            dayTime = "day";
        else if (hour >= 11 && hour < 17)
            dayTime = "evening";       
        else
            dayTime = "night"; 

        System.out.printf("Good %s, %s", dayTime, name);
        sc.close();
    }

    static void quantityOfSame() {
// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.
        int[] array = new int[] {1,1,0,1,1,1};
        
        int maxCount = 0;
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) count++;
            else if (count > maxCount){
                maxCount = count;
                count = 0;
            }
            else count = 0;
        }
        if(count > maxCount) maxCount = count;
        System.out.println(maxCount);
    }

    static void magicIndex() {
        
        int[] array = new int[] {1,7,3,6,5,6};
        
        for (int i = 0; i < array.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            
            for(int i1 = 0; i1 < i; i1++)
                leftSum += array[i1];
            for(int i2 = i + 1; i2 < array.length; i2++)
                rightSum += array[i2];
            
            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1); // сочетание сумм не нашлось
    }

    static void reversePhrase() {
      // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your phrase:");
        String phrase = scanner.nextLine();
        
        String[] words = phrase.split(" ");
        String[] res = new String[words.length];
        
        for (int i = 0; i < words.length; i++) 
            res[i] = words[words.length - 1 - i];

        for (String word : res) {
            System.out.print(word + " ");
        }

        scanner.close();
    }

}
