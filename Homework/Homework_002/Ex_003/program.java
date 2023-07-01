// 3) Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class program {
	public static void main(String[] args)  {
        String str_1 = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},";
        String str_2 = "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},";
        String str_3 = "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        
        String str = str_1 + str_2 + str_3;       
       
        StringBuilder sb = new StringBuilder(str);        
        replaceAll(sb, "}]", "},");
        replaceAll(sb, "[", "");
        replaceAll(sb, "{", "");
        replaceAll(sb, "\"", "");
        replaceAll(sb, "фамилия", "");
        replaceAll(sb, "оценка", "");
        replaceAll(sb, "предмет", "");
        replaceAll(sb, ":", "");
        
        String str2 = sb.toString();
        String[] words = str2.split("},");
        
        String[][] res = new String[3][3];
        
        for (int m=0; m<words.length; m++) {
                    
            String[] words3 = words[m].split(",");
            
            res[0][m] = words3[0]; // ФИО
            res[1][m] = words3[1]; // Оценка
            res[2][m] = words3[2]; // Предмет
            
            System.out.println("Студент " + res[0][m] + " получил " + res[1][m] + " по предмету " + res[2][m]);
        }       
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
