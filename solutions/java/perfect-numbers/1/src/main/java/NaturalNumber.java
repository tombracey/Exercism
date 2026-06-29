import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class NaturalNumber {
    int number;

    NaturalNumber(int number) {
        this.number = number;
        if (number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }

    Classification getClassification() {
        int totalOfFactors = 0;
        Set<Integer> factors = getAllFactors(number);
        for (Integer number : factors) {
            totalOfFactors += number;
        }

        if (number == totalOfFactors) {
            return Classification.PERFECT;
        } else if (number > totalOfFactors) {
            return Classification.DEFICIENT;
        } else {
            return Classification.ABUNDANT;
        }
    }

    static Set<Integer> getAllFactors(int number) {
        Set<Integer> factors = new HashSet<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number != i) {
                factors.add(i);
            }
        }
        return factors;
    }
}
