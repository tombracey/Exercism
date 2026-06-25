import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, parser);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek().toString();
        dayOfWeek = dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase();

        String month = appointmentDate.getMonth().toString();
        month = month.charAt(0) + month.substring(1).toLowerCase();

        int dayOfMonth = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();

        String timeframe = " AM.";
        int hour = appointmentDate.getHour();
        if (hour>12){
            timeframe = " PM.";
            hour -= 12;
        }

        String min = Integer.toString(appointmentDate.getMinute());
        if (min.length() == 1){
            if (min.equals("0")){
                min+="0";
            } else {min="0"+min;
        }}

        return "You have an appointment on " + dayOfWeek + ", " + month + " " + dayOfMonth + ", " + year + ", at " + hour + ":" + min + timeframe;
    }

    public LocalDate getAnniversaryDate() {
        int thisYear = LocalDate.now().getYear();
        return LocalDate.of(thisYear, 9, 15);
    }
}
