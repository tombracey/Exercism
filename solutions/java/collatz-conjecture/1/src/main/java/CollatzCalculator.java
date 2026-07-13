class CollatzCalculator {

    int computeStepCount(int start) {
        // If it's even, divide it by 2.
        // If it's odd, multiply it by 3 and add 1.
        if (start <= 0) throw new IllegalArgumentException("Only positive integers are allowed");

        int count = 0;

        while (start != 1) {
            if (start % 2 == 0) {
                start = start / 2;
                count += 1;
            } else {
                start = start * 3 + 1;
                count += 1;
            }
        }
        return count;
    }

}
