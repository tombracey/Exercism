class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int count = 0;
        for (int i=1; i<=input; i++) {
            count += i;
        }
        return (int) Math.pow(count, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int count = 0;
        for (int i=1; i<=input; i++) {
            count += (int) Math.pow(i, 2);
        }
        return count;
    }

    int computeDifferenceOfSquares(int input) {
        int squareOfSumTo = computeSquareOfSumTo(input);
        int sumOfSquaresTo = computeSumOfSquaresTo(input);

        return Math.abs(squareOfSumTo - sumOfSquaresTo);
    }

}
