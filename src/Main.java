public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    public static void task6() {
        System.out.println("     Задача 6");
        int deposit = 15000;
        int total = 0;
        int i=1;
        int year =0;
        do {
            year = i/12;
            total = total + total / 100 * 7;
            total = total + deposit;
            if(i%6==0) {
                System.out.println("Месяц " + i + " сумма накоплений равна  " + total);
            }

            i++;
        }
        while (  year<9);
    }
    public static void task7() {
        System.out.println("     Задача 7.1");
        int friday = 2;
                while (friday <=31){
                    System.out.println("Сегодня пятница, " +friday+"-е число. Необходимо подготовить отчет");
                    friday = friday +7;
        }
                System.out.println("     Задача 7.2");
        friday = 2;

                for (int day=0; day <31; day++){
                    if (day%7==0){
                        friday = friday + 7;
                        System.out.println("Сегодня пятница, " +friday+"-е число. Необходимо подготовить отчет");
                    }
                }


    }
    public static void task8() {
        System.out.println("     Задача 8");
        int thisyear = 2023;
        int _200Yearsago=thisyear-200;
        int after100years=thisyear+100;
        for (int year = 0; year <= after100years; year += 79){
            if(year >= _200Yearsago && year <= after100years) {
                System.out.println(year);
            }
        }
    }


}