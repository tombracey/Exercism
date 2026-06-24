class Darts {
    int score(double xOfDart, double yOfDart) {
        double distanceFromCentre = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        if (distanceFromCentre <= 1) {
            return 10;
        } else if (distanceFromCentre <= 5) {
            return 5;
        } else if (distanceFromCentre <=10) {
            return 1;
        } else {
            return 0;
        }
    }
}
