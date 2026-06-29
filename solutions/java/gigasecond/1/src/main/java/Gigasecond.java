import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime ldt;

    public Gigasecond(LocalDate moment) {
        this.ldt = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.ldt = moment;
    }

    public LocalDateTime getDateTime() {
        return ldt.plusSeconds(1_000_000_000);
    }
}
