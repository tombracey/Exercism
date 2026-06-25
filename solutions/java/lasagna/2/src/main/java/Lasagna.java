public class Lasagna {
    public static int expectedMinutesInOven() {
        int timeExpected = 40;
        return timeExpected;
    }
    
    public static int remainingMinutesInOven(int timeElapsed) {
        int totalTime = expectedMinutesInOven();
        int timeRemaining = totalTime - timeElapsed;
        return timeRemaining;
    }

    public static int preparationTimeInMinutes(int layers) {
        int timePerLayer = 2;
        int totalTime = timePerLayer * layers;
        return totalTime;
    }

    public static int totalTimeInMinutes(int layers, int timeElapsed) {
        int totalTime = timeElapsed + preparationTimeInMinutes(layers);
        return totalTime;
    }
}
