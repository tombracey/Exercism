public class Hamming {
    String leftStrand;
    String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }

    public int getHammingDistance() {

        int differenceCounter = 0;
        for (int i=0; i<leftStrand.length(); i++) {
            if (rightStrand.charAt(i) != leftStrand.charAt(i)) {
                differenceCounter += 1;
            }
        }
        return differenceCounter;
    }
}
