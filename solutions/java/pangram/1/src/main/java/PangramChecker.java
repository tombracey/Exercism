public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean result = false;

        String allLetters = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<allLetters.length(); i++) {
            if (input.indexOf(allLetters.charAt(i)) == -1) return false;
        }

        return true;
    }

}
