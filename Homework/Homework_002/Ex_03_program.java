/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//import java.io.IOException;

public class Main
{
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

        String[] words2 = new  String[19];
        
        /*for (int m=0; m<words.length; m++) {
            System.out.println("массив "+ words[m]);
        }*/
        
        String[][] res = new String[3][3];
        
        for (int m=0; m<words.length; m++) {
                    
                    String[] words3 = words[m].split(",");
                    
                    res[0][m] = words3[0]; // ФИО
                    res[1][m] = words3[1]; // Оценка
                    res[2][m] = words3[2]; // Предмет
                    
                    System.out.println("Студент " + res[0][m] + " получил " + res[1][m] + " по предмету " + res[2][m]);
        }

        for (int n=0; n<res.length; n++) {

            //System.out.println("Студент " + res[0][n] + " получил " + res[1][n] + " по предмету " + res[2][n]);
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
