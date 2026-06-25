import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {
        String returnString = "";

        boolean capitaliseNextLetter = false;

        for(int i=0; i<identifier.length(); i++) {
            char c = identifier.charAt(i);

            if (c == ' ') {
                returnString += '_';
            } else if (c == '-') {
                capitaliseNextLetter = true;
            } else if (List.of('4', '3', '0', '1', '7').contains(c)) {
                    returnString += switch(c) {
                        case '4' -> 'a';
                        case '3' -> 'e';
                        case '0' -> 'o';
                        case '1' -> 'l';
                        case '7' -> 't';
                        default -> "hmmmmm";
                    };
            } else if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
                    continue;
            } else {
                if (capitaliseNextLetter) {
                    returnString += String.valueOf(c).toUpperCase();
                    capitaliseNextLetter = false;
                } else {
                    returnString += c;
                }
            }
        }

        return returnString;
    }
}