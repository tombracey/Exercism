public class LogLevels {

    public static String message(String logLine) {
        int strIndex = logLine.indexOf(':') + 2;
        String output = logLine.substring(strIndex).trim();
        return output;
    }

    public static String logLevel(String logLine) {
        int indexOne = 1;
        int indexTwo = logLine.indexOf(']');
        String output = logLine.substring(indexOne, indexTwo).toLowerCase();
        return output;
    }

    public static String reformat(String logLine) {
        int messageStartIndex = logLine.indexOf(':') + 2;
        String message = logLine.substring(messageStartIndex).trim();

        int levelStartIndex = logLine.indexOf('[') + 1;
        int levelStopIndex = logLine.indexOf(']');
        String level = logLine.substring(levelStartIndex, levelStopIndex).toLowerCase();

        String outputString = message + " " + "(" + level + ")";
        return outputString;
    }
}