package java220523.Seminar.Seminar_001;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args) {
        //helloUser();
        quantityOfSame();
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
}
