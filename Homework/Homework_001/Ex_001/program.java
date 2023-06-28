package Homework.Homework_001.Ex_001;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
//        n! (произведение чисел от 1 до n)

public class program {
    
    public static void main(String[] args) {
        CalcSum(10);        //сумма чисел от 1 до n
        CalcMultiplic(10);  //произведение чисел от 1 до n
    }

    public static void CalcSum(int n) {
        
        int r = 0;

        System.out.printf("Сумма чисел от 1 до %d\n", n);

        for (int i = 1; i < n; i++) {
            r += i;                             //0+1=1 1+1=2 2+2=4 3+3=6 6+4=10 10+5=15 
            System.out.printf(" %d", r);
        }

        System.out.printf("\nОтвет: %d \n", r);
    }

    public static void CalcMultiplic(int n) {
        
        int r = 1;

        System.out.printf("Произведение чисел от 1 до %d\n", n);

        for (int i = 1; i < n; i++) {
            r *= i;                                 //1*1=1 1*2=2 2*3=6 6*4=24 24*5=120
            System.out.printf(" %d", r);
        }

        System.out.printf("\nОтвет: %d \n", r);
    }
}
