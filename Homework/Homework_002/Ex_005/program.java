package Homework.Homework_002.Ex_005;

import java.io.IOException;

// 5) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// "select * from students where name='Ivanov' and country='Russia' and city='Moscow'

public class program {
    public static void main(String[] args) throws SecurityException, IOException {
        
        String str0 = "select * from students where ";
        String str1 = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
       
        StringBuilder sb = new StringBuilder(str1);        
        System.out.println("Дана строка: " + str1 + "\n");
        
        replaceAll(sb, "{", "");
        replaceAll(sb, "}", "");
        replaceAll(sb, "\":\"", "=");
        replaceAll(sb, "\", \"", ", "); // ", "  >> ', 
        replaceAll(sb, "\"", "");

        System.out.println("Парсинг строки: " + sb + "\n");
        
        String str2 = sb.toString();
        String[] words = str2.split(", ");
        
        String splitter = "";
        StringBuilder sb2 = new StringBuilder();

        for (String word : words) {
            if (!word.contains("null")) {

                sb2.append(splitter);
                splitter = ", ";
                sb2.append(word);
            }
        }
        
        replaceAll(sb2, "=", "='");
        replaceAll(sb2, ", ", "' AND ");
        System.out.println("Результирущая строка для SQL запроса : " + str0 + sb2 + "'"); 
    }

    public static void replaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
    
        while (index != -1) {
        builder.replace(index, index + from.length(), to);
        index += to.length();
        index = builder.indexOf(from, index);
    }
}
 
        
 
    
}
