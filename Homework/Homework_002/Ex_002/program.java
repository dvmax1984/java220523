package Homework.Homework_002.Ex_002;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//2) Реализуйте алгоритм сортировки пузырьком числового массива, 
//   результат после каждой итерации запишите в лог-файл.

public class program {
        
    static String pathProject = System.getProperty("user.dir");
    static String pathFile = pathProject.concat("\\java220523\\Homework\\Homework_002\\Ex_002\\result.txt");
    public static void main(String[] args) throws SecurityException, IOException  {
        
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        addingToFile(pathFile, timeStamp + " Сортировка пузырьком\nИсходная строка\n");

        int[] sortArr = {16, 8, 5, 22, 1, 4, 11, 7};
        
        bubbleSort(sortArr);
        printArray(sortArr);
        


    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            
            if (arr[i]<=10) {
                addingToFile(pathFile, String.valueOf(" " + arr[i]) + " ");
            }
            else {
                addingToFile(pathFile, String.valueOf(arr[i]) + " ");
            }
        }
        addingToFile(pathFile, "\n");
    }


    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];

                    printArray(sortArr);

                    sortArr[j] = sortArr[j + 1];

                    printArray(sortArr);

                    sortArr[j + 1] = swap;
                }
            }
        }
    }


    public static void addingToFile(String filePath, String text) {
        
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile, Charset.forName("utf-8"), true);

            writer.write(text + " ");
            writer.close();
            } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            }
    }   
}
    

