public class Converter {

    int convertToKm(int steps) {
        int stepCm = 75; // Длина 1 шага в см
        int convertToKm = steps * stepCm / 100000;
        return convertToKm;
    }

    int convertStepsToKilocalories(int steps) {
        int stepCal = 50; // Кол-во  каллорий в 1 шаге
        int stepsToKilocalories = steps * stepCal / 1000;
        return stepsToKilocalories;
    }
}
