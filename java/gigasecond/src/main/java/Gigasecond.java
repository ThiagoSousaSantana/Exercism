import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {

    private LocalDateTime date;

    Gigasecond(LocalDate birthDate) {
        LocalTime time = LocalTime.of(0,0);
        this.date = LocalDateTime.of(birthDate,time);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.date = birthDateTime;
    }

    LocalDateTime getDate() {
        long gigaSecond = (long) Math.pow(10,9);
        return this.date.plusSeconds(gigaSecond);
    }

}
