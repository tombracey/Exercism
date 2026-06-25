public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double baseProduction = 221;

        double successRate = 1;
        if (speed >= 5) {successRate = 0.9;}
        if (speed == 9) {successRate = 0.8;}
        if (speed == 10) {successRate = 0.77;}

        double productionRate = speed * baseProduction * successRate;

        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        double productionRate = productionRatePerHour(speed);
        return (int) productionRate/60;
    }
}
