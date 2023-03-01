public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("     Задача 1");
        int salary = 15000;
        int total = 0;
        int mouth = 0;
        while (total<2_459_000) {
            total=total+salary;
            mouth++;
            System.out.println("Месяц "+mouth+ " сумма накоплений равна  "+total+"рублей");
        }
    }
    public static void task2 () {
        System.out.println("     Задача 2");
        int a=0;
        while (a<10) {
            a++;
            System.out.print(a+" ");
        }
        System.out.println();
        for(;a>=1;a--){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}