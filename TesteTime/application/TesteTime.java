package application;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class TesteTime {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-12-02");
        LocalDate d05 = LocalDate.parse("14/09/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Instant d06 = Instant.parse("2022-12-28T14:30:25Z");
        LocalDateTime d07 = LocalDateTime.parse("30/07/1967 13:19", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDateTime convert = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime convert2 = LocalDateTime.ofInstant(d06, ZoneId.of("Iran"));

        System.out.println("Local Date = "+d01);
        System.out.println("Local Date Time = "+d02);
        System.out.println("Instant = "+d03);
        System.out.println("Local Date parse = "+d04);
        System.out.println("Formatter = "+d05);
        System.out.println("Instant Parse 14:30 Z = "+d06);
        System.out.println("Formatter 2 = "+d07);
        System.out.println("Instant Parse 14:30 Z in -03:00 = (Brazil) "+convert);
        System.out.println("Instant Parse 14:30 Z in Iran = "+convert2);



    }
}
