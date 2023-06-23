package Lecture_001;

public class program {
    public static void main(String[] args) {
        //int i = 123;
        //String s = "qwer";
        //s.charAt(0);
        //int[] arr = new int[10];
        //System.out.println(arr.length);
        //arr = new int[] {1, 2, 3, 4, 5 };
        //System.out.println(arr.length);
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
        System.out.println();
        }

    }    
}