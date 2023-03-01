public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
       public static void task3 () {
        System.out.println("     Задача 3");
        int population=12_000_000;
        int birthRate =population/1000*17;
        int mortalityRate =population/1000*8;
        for (int year=0; year<=10; year++) {
            System.out.println("Год " + year + "" + ", численность населения составляет " +population);
            population = population + birthRate - mortalityRate;
        }
    }
     public static void task4() {
        System.out.println("     Задача 4");
        int deposit = 15000;
        int total = 0;
        int i=1;
        do {
            total= total+total/100*7;
            total=total+deposit;
            System.out.println("Месяц "+i+ " сумма накоплений равна  "+total);
            i++;
        }
        while (  total<=1_000_000);
    }
    public static void task5() {
        System.out.println("     Задача 5");
        int deposit = 15000;
        int total = 0;
        int i=1;
        do {
            total = total + total / 100 * 7;
            total = total + deposit;
            if(i%6==0) {
                System.out.println("Месяц " + i + " сумма накоплений равна  " + total);
            }

                i++;
        }
        while (  total<=1_000_000);
    }

}