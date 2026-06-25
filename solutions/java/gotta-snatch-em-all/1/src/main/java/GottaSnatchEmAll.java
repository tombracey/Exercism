import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> uniqueCards = Set.copyOf(cards);
        return uniqueCards;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean comparison1 = false;
        boolean comparison2 = false;

        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                comparison1 = true;
            }
        }

        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                comparison2 = true;
            }
        }
        return comparison1 && comparison2;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> cardsInCommon = new HashSet<>();

        Set<String> collection1 = collections.getFirst();
        Set<String> collection2 = collections.getLast();
        for (String card : collection1) {
            if (collection2.contains(card)) {
                cardsInCommon.add(card);
            }
        }

        return cardsInCommon;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for (Set<String> collection : collections) {
            for (String card : collection) {
                all.add(card);
            }
        }
        return all;
    }
}
