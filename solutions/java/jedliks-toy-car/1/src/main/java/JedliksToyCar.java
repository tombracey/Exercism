public class JedliksToyCar {
    private int batteryLevel = 100;
    private int distance = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (batteryLevel>0) {
            return "Battery at " + batteryLevel + "%";
        }
        return "Battery empty";
    }

    public void drive() {
        if (batteryLevel>0) {
            distance += 20;
            batteryLevel -= 1;
        }
    }
}
