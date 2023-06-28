package Homework.Hhomework_002;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg
public class program {
    public static void main(String[] args) throws SecurityException, IOException {
        
        String pathProject = System.getProperty("user.dir");
        String pathFile1 = pathProject.concat("\\Seminar2-1.txt");
        String pathFile2 = pathProject.concat("\\Seminar2-2.txt");
        //addingToFile(pathFile, longStringCreator("Hello!", 5));
        addListToFile(pathFile2, showCurrentFiles(pathProject));        
    }

    static String longStringCreator(String word, int iters) {

        StringBuilder newStr = new StringBuilder();
        
        for (int i = 0; i < iters; i++) {
            newStr.append(word);
        }
        return newStr.toString() + "\n";
    }

    static String[] showCurrentFiles(String dirPath) {
            File currentDir = new File(dirPath);
            return currentDir.list();
        }
        
        static void addingToFile(String filePath, String text) {
    try {
        File myFile = new File(filePath);
        FileWriter writer = new FileWriter(myFile, true);

        writer.write(text);
        writer.close();
        } 
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }

    static void addListToFile(String filePath, String[] list) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(program.class.getName());
    FileHandler fh = new FileHandler("Seminar2-3(log).txt");

    logger.addHandler(fh);

    SimpleFormatter simple = new SimpleFormatter();
    fh.setFormatter(simple);

    try {
        File myFile = new File(filePath);

        FileWriter writer = new FileWriter(myFile);

        for (String str : list) {
            writer.write(str + "\n");
        }

        writer.close();

    } catch (Exception e) {
        logger.warning(e.getMessage());
    }

}
    
}
