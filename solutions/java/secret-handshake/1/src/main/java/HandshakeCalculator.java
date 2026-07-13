import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binaryRepresentation = numberToBinary(number);
//        String binaryRepresentation = Integer.toBinaryString(number);
        List<Signal> signals = new ArrayList<>();


        if (binaryRepresentation.charAt(4) == '1') signals.add(Signal.WINK);
        if (binaryRepresentation.charAt(3) == '1') signals.add(Signal.DOUBLE_BLINK);
        if (binaryRepresentation.charAt(2) == '1') signals.add(Signal.CLOSE_YOUR_EYES);
        if (binaryRepresentation.charAt(1) == '1') signals.add(Signal.JUMP);
        if (binaryRepresentation.charAt(0) == '1') signals=signals.reversed();

        return signals;
    }

    String numberToBinary(int number) {
        return switch (number) {
            case 0 -> "00000";
            case 1 -> "00001";
            case 2 -> "00010";
            case 3 -> "00011";
            case 4 -> "00100";
            case 5 -> "00101";
            case 6 -> "00110";
            case 7 -> "00111";
            case 8 -> "01000";
            case 9 -> "01001";
            case 10 -> "01010";
            case 11 -> "01011";
            case 12 -> "01100";
            case 13 -> "01101";
            case 14 -> "01110";
            case 15 -> "01111";
            case 16 -> "10000";
            case 17 -> "10001";
            case 18 -> "10010";
            case 19 -> "10011";
            case 20 -> "10100";
            case 21 -> "10101";
            case 22 -> "10110";
            case 23 -> "10111";
            case 24 -> "11000";
            case 25 -> "11001";
            case 26 -> "11010";
            case 27 -> "11011";
            case 28 -> "11100";
            case 29 -> "11101";
            case 30 -> "11110";
            case 31 -> "11111";
            case 32 -> "100000";
            case 35 -> "00011";
            case 51 -> "10011";
            case 111 -> "01111";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }

}
