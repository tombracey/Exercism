class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        int score = 0;
        for (int i=0; i<word.length(); i++) {
            score += scoreForOneLetter(word.charAt(i));
        }
        return score;
    }

    int scoreForOneLetter(char character) {
        return switch(character) {
            case 'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't' -> 1;
            case 'd', 'g' -> 2;
            case 'b', 'c', 'm', 'p' -> 3;
            case 'f', 'h', 'v', 'w', 'y' -> 4;
            case 'k' -> 5;
            case 'j', 'x' -> 8;
            case 'q', 'z' -> 10;
            default -> throw new IllegalStateException("Unexpected value: " + character);
        };
    }

}
