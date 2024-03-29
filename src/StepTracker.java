import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();
    MonthData monthData = new MonthData();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Некорректный номер месяца. Введите номер от 1 до 12");
            return;
        }
        System.out.println("Введите день");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Некорректный номер дня. Введите число от 1 до 30");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps < 1) {
            System.out.println("Некорректное количество шагов. Введите число большее 0");
            return;
        }
        MonthData monthData =  monthToData[month - 1]; // Получение соответствующего объекта MonthData из массива
        monthData.days[day - 1] = steps; // Сохранение полученных данных
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель шагов за день");
        int goalChange = scanner.nextInt(); // Ввод цели шагов за день
        if (goalByStepsPerDay > 0) {
            goalByStepsPerDay = goalChange;
            System.out.println("Цель шагов за день: " + goalByStepsPerDay);
        } else {
            System.out.println("Ошибка. Введите число больше 0");
        }
    }

    void printStatistic() {
        System.out.println("Выберите месяц");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Некорректный номер месяца. Введите число от 1 до 12");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        // Вывод статистики
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное количество шагов за день: " + monthData.maxSteps());
        System.out.println("Среднее количество шагов за месяц: " + (sumSteps / 30));
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(sumSteps));
        System.out.println("Количество сожжённых килокаллорий: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println();
    }
}
