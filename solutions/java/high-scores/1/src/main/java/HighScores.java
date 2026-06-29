import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    List<Integer> scores = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.getLast();
    }

    Integer personalBest() {
        int highest = 0;
        for (int score : scores) highest = score>highest? score : highest;
        return highest;
    }

    List<Integer> personalTopThree() {
        if (scores.size() == 1) return List.of(scores.getFirst());
        if (scores.size() == 2) return List.of(Collections.max(scores), Collections.min(scores));

        int highest = 0;
        int secondHighest = 0;
        int thirdHighest = 0;

        for (int score : scores) {
            if (score > highest) {
                thirdHighest = secondHighest;
                secondHighest = highest;
                highest = score;
            }
        }
        return List.of(highest, secondHighest, thirdHighest);
    }
}
