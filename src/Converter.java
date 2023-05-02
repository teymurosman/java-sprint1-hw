public class Converter {

    int convertToKm(int steps) {
        int convertToKm = steps * 75 / 100000;
        return convertToKm;
    }

    int convertStepsToKilocalories(int steps) {
        int stepsToKilocalories = steps * 50 / 1000;
        return stepsToKilocalories;
    }
}
