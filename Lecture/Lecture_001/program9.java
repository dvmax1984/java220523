package Lecture_001;
public class program9 {
        public static void main(String[] args) {
            int value = 321;
            int count = 0;
            while (value != 0) {
                value /= 10;
                count++;
            }
            System.out.println(count);
        }

}
