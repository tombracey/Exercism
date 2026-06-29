class ResistorColorDuo {
    int value(String[] colors) {
        String returnString = "";

        for (String colour : colors) {
            returnString += switch (colour.toLowerCase()) {
                case "black" -> 0;
                case "brown" -> 1;
                case "red" -> 2;
                case "orange" -> 3;
                case "yellow" -> 4;
                case "green" -> 5;
                case "blue" -> 6;
                case "violet" -> 7;
                case "grey" -> 8;
                case "white" -> 9;
                default -> throw new IllegalArgumentException("not found");
            };
        }
        return Integer.valueOf(returnString.substring(0, 2));
    }
}
