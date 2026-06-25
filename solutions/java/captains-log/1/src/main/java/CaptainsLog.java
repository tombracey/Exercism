import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        char[] planets = {'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
        int randomIndex = random.nextInt(planets.length);
        return planets[randomIndex];
    }

    String randomShipRegistryNumber() {
        String registryNumber = "NCC-";
        int number = random.nextInt(9000) + 1000;
        registryNumber += number;
        return registryNumber;
    }

    double randomStardate() {
        return random.nextDouble()*1000 + 41000;
    }
}
