class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distanceDriven = 0;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public int getSpeed() {
        return this.speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    public int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int totalMaxDrives = 100 / car.getBatteryDrain();

        int maxPossibleDistance = totalMaxDrives * car.getSpeed();

        return maxPossibleDistance >= this.distance;
    }
}
