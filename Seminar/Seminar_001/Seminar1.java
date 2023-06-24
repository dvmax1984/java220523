package java220523.Seminar.Seminar_001;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        helloUser();
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
}
