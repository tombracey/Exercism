class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String acronym = String.valueOf(phrase.charAt(0));
        boolean capitaliseNextLetter = false;

        for (int i=0; i<phrase.length(); i++) {
            String charAsString = String.valueOf(phrase.charAt(i));

            if (charAsString.equals(" ") || charAsString.equals(",") || charAsString.equals("-") || charAsString.equals("_")) {
                capitaliseNextLetter = true;
                continue;
            }

            if (capitaliseNextLetter) {
                acronym += charAsString.toUpperCase();
                capitaliseNextLetter = false;
            }
        }
        return acronym;
    }

}
