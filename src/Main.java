import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создание нового экземпляра
        StepTracker stepTracker = new StepTracker(scanner);
        MonthData monthData = new MonthData();
        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay(); // Ввод шагов за определённый день и месяц
            } else if (i == 2) {
                stepTracker.changeStepGoal(); // Изменение цели шагов за день
            } else if (i == 3) {
                stepTracker.printStatistic(); // Вывод статистики за месяц
            } else if (i == 0) {
                System.out.println("Выход из приложения");
                break;
            } else {
                System.out.println("Извините, данная команда не поддерживается");
            }
        }
    }

    public static void printMenu() { // Вывод доступных команд
        System.out.println("Выберите команду:");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов за день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("0 - Выйти из приложения");
    }
}
