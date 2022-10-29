package org.sever;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now(ZoneId.of("Europe/Istanbul"));
        LocalDate countDate=LocalDate.of(2022,10,20);
        LocalDate ldd=countDate.plusDays(2);
        System.out.println(ldd);
        ldd=countDate.minusDays(2);
        System.out.println(ldd);

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("MMMM??dd/yy");
        LocalDate current=LocalDate.now();
        String str=dt.format(current);
        System.out.println(str);


        LocalDate mahmut=LocalDate.of(1984,02,05);
        LocalDate hatice=LocalDate.of(1985,07,18);
        Long fark= ChronoUnit.DAYS.between(mahmut,hatice);
        System.out.println(fark);

    }
}
