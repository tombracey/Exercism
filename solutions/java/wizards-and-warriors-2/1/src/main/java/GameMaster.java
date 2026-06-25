public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod) {
        String word = switch(travelMethod.toString()) {
            case "WALKING" -> "by ";
            case "HORSEBACK" -> "on ";
            default -> "hmmmm";
        };
        return "You're traveling to your destination " + word + travelMethod.toString().toLowerCase() + ".";
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        String word = switch(travelMethod.toString()) {
            case "WALKING" -> "by ";
            case "HORSEBACK" -> "on ";
            default -> "hmmmm";
        };
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points. You're traveling to your destination " + word + travelMethod.toString().toLowerCase() + ". You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points. You're traveling to your destination by walking. You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }
}
