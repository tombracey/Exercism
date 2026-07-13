import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        List<Character> charsSeen = new ArrayList<>();

        for (int i=0; i<phrase.length(); i++) {
            char latestChar = phrase.charAt(i);
            if (latestChar != '-' && latestChar != ' ') {
                if (charsSeen.contains(latestChar)) {
                    return false;
                }
                charsSeen.add(latestChar);
            }
        }
        return true;
    }
}
