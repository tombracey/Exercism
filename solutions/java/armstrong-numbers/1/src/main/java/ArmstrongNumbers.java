class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] digitArray = String.valueOf(numberToCheck).toCharArray();

        int sumOfDigitsRaised = 0;
        for (int i=0; i<digitArray.length; i++) {
            int currentDigit = Integer.parseInt(String.valueOf(digitArray[i]));
            int exponent = digitArray.length;

            int digitRaised = (int) Math.pow(currentDigit, exponent);
            sumOfDigitsRaised += digitRaised;
        }

        return numberToCheck == sumOfDigitsRaised;
    }
}
