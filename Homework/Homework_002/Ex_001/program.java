package Homework.Homework_002.Ex_001;

import java.io.File;
import java.io.IOException;

// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

public class program {
    public static void main(String[] args) throws SecurityException, IOException {        
        String pathProject = System.getProperty("user.dir");
        String path = pathProject.concat("\\java220523\\Homework\\Homework_002\\Ex_001\\files");       
        PrintFileList(showCurrentFiles(path));        
    }

    static String[] showCurrentFiles(String dirPath) throws SecurityException, IOException {       
        File currentDir = new File(dirPath);
        if (currentDir.listFiles() == null) { 
            System.out.println("Каталог не содержит файлов");
        }
        return currentDir.list(); 
    }

    static void PrintFileList(String[] list) throws SecurityException, IOException {
        
        try {                       
            for (String str : list) {

                int idxStart = str.lastIndexOf("."); //последний индекс вхождения подстроки
                int idxEnd = str.length();

                if (idxStart != -1) {            
                    String stringExcerpt = str.substring(idxStart+1, idxEnd);
                    System.out.println("Расширение файла: " + stringExcerpt);
                }
                else {
                    System.out.println("Расширение файла: ");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Возникло исключение: " + e);
        }
        
        // //замутил проверку на null вместо обработки исключения, не не пошло
        // NullArrayExample obj = new NullArrayExample(); 
        // if (obj.list != null) {
        //     for (String str : list) {
        //         System.out.println(str);
        //     }
        // }
        // else {
        //     System.out.println("Каталог не содержит файлов");
        // }
    }    
}


        
