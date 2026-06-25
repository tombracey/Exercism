import java.rmi.Remote;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int numberOfVictories;

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar obj) {
        ProductionRemoteControlCar o = (ProductionRemoteControlCar) obj;
        if (this.numberOfVictories > o.numberOfVictories) return -1;
        if (this.numberOfVictories < o.numberOfVictories) return 1;
        return 0;
    }
}
