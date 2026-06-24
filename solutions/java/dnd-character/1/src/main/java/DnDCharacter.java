import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    int ability(List<Integer> scores) {
        List<Integer> mutableScores = new ArrayList<>(scores);

        Collections.sort(mutableScores);
        mutableScores.removeFirst();

        int total = 0;
        for (int score : mutableScores) {
            total += score;
        }

        return total;
    }

    List<Integer> rollDice() {
        Random r = new Random();
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i=0; i<4; i++) {
            rolls.add(r.nextInt(6) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - 10) / 2);
    }

    int getStrength() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getDexterity() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getConstitution() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getIntelligence() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getWisdom() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getCharisma() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getHitpoints() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }
}
