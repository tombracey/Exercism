import java.math.BigInteger;

class ResistorColorTrio {
    String label(String[] colors) {
        int firstChar = codeToNumber(colors[0]);
        int secondChar = codeToNumber(colors[1]);
        String resistance = String.valueOf(firstChar) + String.valueOf(secondChar);

        int numOfZeros = codeToNumber(colors[2]);


        for (int i = 0; i < numOfZeros; i++) resistance += "0";
        BigInteger ohms = BigInteger.valueOf(Long.parseLong(resistance));
        if (ohms.compareTo(BigInteger.valueOf(1_000_000_000)) == 1) {
            resistance = (ohms.divide(BigInteger.valueOf(1_000_000_000))) + " gigaohms";
        } else if (ohms.compareTo(BigInteger.valueOf(1_000_000)) == 1) {
            resistance = (ohms.divide(BigInteger.valueOf(1_000_000))) + " megaohms";
        } else if (ohms.compareTo(BigInteger.valueOf(1_000)) == 1) {
            resistance = (ohms.divide(BigInteger.valueOf(1_000))) + " kiloohms";
        } else {resistance += " ohms";}

        if (resistance.charAt(0) == '0') resistance = resistance.substring(1);

        return resistance;
    }

    int codeToNumber(String colour) {
        return switch (colour.toLowerCase()) {
            case "black" -> 0;
            case "brown" -> 1;
            case "red" -> 2;
            case "orange" -> 3;
            case "yellow" -> 4;
            case "green" -> 5;
            case "blue" -> 6;
            case "violet" -> 7;
            case "grey" -> 8;
            case "white" -> 9;
            default -> throw new IllegalArgumentException("not found");
        };
    }
}
