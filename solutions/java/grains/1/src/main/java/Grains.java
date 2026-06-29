import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > 64) throw new IllegalArgumentException("square must be between 1 and 64");
        if (square==1) return new BigInteger(String.valueOf(1));

        BigInteger num = BigInteger.valueOf(1);
        for (int i=2; i<=square; i++) {
            num = num.multiply(BigInteger.valueOf(2));
        }
        return num;
    }

    BigInteger grainsOnBoard() {
        BigInteger count = BigInteger.valueOf(0);

        for (int i=1; i<=64; i++) {
            count = count.add(grainsOnSquare(i));
        }
        return count;
    }

}
