public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        int timeExpected = 40;
        return timeExpected;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int timeElapsed) {
        int totalTime = expectedMinutesInOven();
        int timeRemaining = totalTime - timeElapsed;
        return timeRemaining;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {
        int timePerLayer = 2;
        int totalTime = timePerLayer * layers;
        return totalTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int timeElapsed) {
        int totalTime = timeElapsed + preparationTimeInMinutes(layers);
        return totalTime;
    }
}
