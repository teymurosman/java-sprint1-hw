public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]); // Вывод статистики по дням
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i]; // Подсчёт суммы элементов массива days[]
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) { // Поиск максимального элемента массива days[]
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) { // Поиск лучшей серии по выполнению цели
            if (days[i] > goalByStepsPerDay) {
                currentSeries = currentSeries + 1; // Прибавление дня в серию при выполнении цели
                if (finalSeries < currentSeries) {
                    finalSeries = currentSeries; // Присваивание finalSeries макс значения
                }
            } else {
                currentSeries = 0; // Сброс серии при невыполнении цели
            }
        }
        return finalSeries;
    }
}
