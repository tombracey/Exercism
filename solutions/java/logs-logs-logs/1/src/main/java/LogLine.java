public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String symbol = logLine.substring(1, 4);

        String level = switch(symbol) {
            case "TRC" -> "TRACE";
            case "DBG" -> "DEBUG";
            case "INF" -> "INFO";
            case "WRN" -> "WARNING";
            case "ERR" -> "ERROR";
            case "FTL" -> "FATAL";
            default -> "UNKNOWN";
        };

        return LogLevel.valueOf(level);
    }

    public String getOutputForShortLog() {
        String symbol = logLine.substring(1, 4);

        int level = switch(symbol) {
            case "TRC" -> 1;
            case "DBG" -> 2;
            case "INF" -> 4;
            case "WRN" -> 5;
            case "ERR" -> 6;
            case "FTL" -> 42;
            default -> 0;
        };
        return level + ":" + logLine.substring(7);
    }
}
