import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> returnList = new ArrayList<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numOfChar = charToNumber(a);
        for (int i=0; i<numOfChar; i++) {
            String characterToAdd = String.valueOf(alphabet.charAt(i));
            int spacesBeforeChar = numOfChar - (i+1);
            int spacesBetweenChar = i<=1? i : i*2-1;

            String listElement = " ".repeat(spacesBeforeChar) + characterToAdd;
            if (!characterToAdd.equals("A")) {
                listElement += " ".repeat(spacesBetweenChar) + characterToAdd;
            }
            listElement += " ".repeat(spacesBeforeChar);
            returnList.add(listElement);
        }
        returnList.addAll(returnList.subList(0, returnList.size()-1).reversed());

        return returnList;
    }

    int charToNumber(char a) {
        return switch (a) {
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            case 'D' -> 4;
            case 'E' -> 5;
            case 'F' -> 6;
            case 'G' -> 7;
            case 'H' -> 8;
            case 'I' -> 9;
            case 'J' -> 10;
            case 'K' -> 11;
            case 'L' -> 12;
            case 'M' -> 13;
            case 'N' -> 14;
            case 'O' -> 15;
            case 'P' -> 16;
            case 'Q' -> 17;
            case 'R' -> 18;
            case 'S' -> 19;
            case 'T' -> 20;
            case 'U' -> 21;
            case 'V' -> 22;
            case 'W' -> 23;
            case 'X' -> 24;
            case 'Y' -> 25;
            case 'Z' -> 26;
            default -> throw new IllegalStateException("Unexpected value: " + a);
        };
    }
}
