public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int saveUp = 2_459_000;
        int postponed = 15_000;
        int mounth = 0;
        double interestRate = 0.01;
        float total = 0;

        while (total <= saveUp) {
            total += postponed + total * interestRate;
            mounth++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", mounth, total);
        }

        System.out.println("Задание №2");
        int numbers = 1;
        while (numbers <= 10) {
            System.out.print(numbers + " ");
            numbers++;
        }
        System.out.println(" ");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        System.out.println("Задание №3");
        int population = 12_000_000;
        float BirthPopulation = (float) 17 / 1000;
        float DeathPopulation = (float) 8 / 1000;
        for (int year = 1; year < 11; year++) {
            population = (int) (population + (population * BirthPopulation) - (population * DeathPopulation));
            System.out.printf("Год %d, численность населения составляет %d%n", year, population);
        }
        System.out.println("Задание №4");
        int requiredAmount = 12_000_000;
        int month = 1;
        double monthlyPercentage = 0.07;
        float depositAmount = 15_000;
        while (depositAmount <= requiredAmount) {
            depositAmount += depositAmount * monthlyPercentage;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, depositAmount);
            month++;
        }
        System.out.println("Задание №5");
        requiredAmount = 12_000_000;
        month = 1;
        monthlyPercentage = 0.07;
        depositAmount = 15_000;
        while (depositAmount <= requiredAmount) {
            depositAmount += depositAmount * monthlyPercentage;

            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, depositAmount);
            }
            month++;
        }


        System.out.println("Задание №6");
        int monthPurpose = 12 * 9;
        month = 1;
        monthlyPercentage = 0.07;
        depositAmount = 15_000;
        while (month <= monthPurpose) {
            depositAmount += depositAmount * monthlyPercentage;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, depositAmount);
            }
            month++;
        }

        System.out.println("Задание №7");
        int friday = 1;
        int dayTotal = 31;
        while (friday <= dayTotal) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет%n", friday);
            friday+=7;
        }

        System.out.println("Задание №8");
        int todayYear= 2023;
        int startYear=todayYear-200;
        int andYear= todayYear+100;
        for (int Year=startYear; Year<=andYear;Year++){
            if (Year%79==0){
                System.out.println(Year);
            }
        }
    }
}