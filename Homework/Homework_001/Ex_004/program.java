package Homework.Homework_001.Ex_004;

// 4) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

public class program {
    public static void main(String[] args) {

        System.out.printf("\n\nРешение задачи перебоом: 2? + ?5 = 69\n");
        int e = 0;
        boolean flag = false;
        
        for (char q = '0'; q <= '9'; q++)  {            
            if (flag) break;
            for (char w = '0'; w <= '9'; w++) {
                // 2q + w5 = 69.
                int q1 = Integer.parseInt("2" + String.valueOf(q));
                int w1 = Integer.parseInt(String.valueOf(w) + "5");

                e = q1 + w1;

                if(e==69) {
                    System.out.printf("\n\nРешение для ответа 2? + ?5 = 69 найдено = %d . Значения %d и %d - символы q=%s и w=%s\n\n" + //
                            "", e, q1, w1, q, w);
                    flag = true;
                    break;
                }
                System.out.printf("Подбор: %d+%d=%d ", q1, w1, e);                
            }
        }
        if (!flag) {
            System.out.printf("\nНет решения для задачи: 2? + ?5 = 69");
        }
    }
    
}
