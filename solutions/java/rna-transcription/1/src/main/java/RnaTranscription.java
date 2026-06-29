class RnaTranscription {

    String transcribe(String dnaStrand) {
        String transcription = "";

        for (int i=0; i<dnaStrand.length(); i++) {
            transcription += switch (dnaStrand.charAt(i)) {
                case 'G' -> "C";
                case 'C' -> "G";
                case 'T' -> "A";
                case 'A' -> "U";
                default -> "";
            };
        }
        return transcription;
    }

}
