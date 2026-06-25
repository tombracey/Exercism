
class BirdWatcher {
    private final int[] birdsPerDay;
    int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        int birdsToday = birdsLastWeek[birdsLastWeek.length - 1];
        return birdsToday;
    }

    public void incrementTodaysCount() {
        birdsLastWeek[birdsLastWeek.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i=0; i<birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {return true;}
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;

        int daysToAccountFor = Math.min(numberOfDays, 7);

        for (int i=0; i<daysToAccountFor; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i=0; i<birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                count += 1;
            }
        }
        return count;
    }
}
