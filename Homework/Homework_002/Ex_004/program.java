package Homework.Homework_002.Ex_004;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//4) К калькулятору из предыдущего ДЗ добавить логирование.

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class program {

    static String pathProject = System.getProperty("user.dir");
    static String pathFile = pathProject.concat("\\java220523\\Homework\\Homework_002\\Ex_004\\logfile.txt");
    static String pathFile2 = pathProject.concat("\\java220523\\Homework\\Homework_002\\Ex_004\\logfile2.txt");

    public static void main(String[] args) throws SecurityException, IOException {
       
        PrintMenuStart();
        float act[] = SelectAction();
        float result = Calculate(act);
        PrintResult(result);        
    }

    private static void PrintResult(float result) throws SecurityException, IOException {
        System.out.printf("Результат: %f", result);
        
        FileWrite(pathFile, "Результат: "+ String.valueOf(result));
        //addListToFile(pathFile,"Результат: "+ String.valueOf(result));
    }

    static void PrintMenuStart() {
        System.out.println("Калькулятор, 1е выбор действия; 2е - ввод двух чисел по очереди.");
        System.out.println("Выбор действий: \n[1] сложение, \n[2] произведение, \n[3] деление, \n[4] разность, \n[0] выход");
        FileWrite(pathFile, "Запуск программы");
        FileWrite(pathFile, "Выбор действий: [1] сложение, [2] произведение, [3] деление, [4] разность, [0] выход");
    }

    static float[] SelectAction() {
        
        float acc[] = new float[3];
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите действие: ");
        acc[0] = sc.nextFloat();
        FileWrite(pathFile, "Пользователь выбрал действие: "+ String.valueOf(acc[0]));

        if (acc[0] == 0 || acc[0] >= 5)  {
                sc.close();    
                System.out.print("Выбрали выход из программы");
                System.exit(0);
        }
        
        System.out.print("Введите первое число: ");
        acc[1] = sc.nextFloat();  //hasNextInt
        FileWrite(pathFile, "Пользователь ввел первое число: "+ String.valueOf(acc[1]));
        
        System.out.print("Введите второе число: ");
        acc[2] = sc.nextFloat();
        FileWrite(pathFile, "Пользователь ввел второе число: "+ String.valueOf(acc[2]));

        sc.close();

        return acc;
    }

    static float Calculate(float[] acc) {
        
        float res = 0;

        switch (String.valueOf(acc[0])) {
            case "1.0":
                res = acc[1] + acc[2];
                break;
            case "2.0":
                res = acc[1] * acc[2];
                break;
            case "3.0":
                if (acc[1] == 0 || acc[2] == 0) {
                    System.out.print("Ошибка: на нуль делить нельзя!");
                    System.exit(0);
                }                
                res = acc[1] / acc[2];
                break;
            case "4.0":
                res = acc[1] - acc[2];
                break;

        default:
                System.out.print("Допускается выбор только разрешенных действий. Программа будет закрыта");
                System.exit(0);
                break;
        }        
        return res;
    }

    public static void FileWrite(String filePath, String text) {

        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());

        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile, Charset.forName("utf-8"), true);

            writer.write(timeStamp + " " + text + "\n");
            writer.close();
            } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            }
    }

    static void addListToFile(String filePath, String string) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(program.class.getName());
        FileHandler fh = new FileHandler("logfile2.txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);

        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());

    try {
        File myFile = new File(filePath);

        FileWriter writer = new FileWriter(myFile);

        //for (String str : string) {
            writer.write(timeStamp + " " + string + "\n");
        //}

        writer.close();
    } 
        catch (Exception e) {
        logger.warning(e.getMessage());
        }
    }
}
