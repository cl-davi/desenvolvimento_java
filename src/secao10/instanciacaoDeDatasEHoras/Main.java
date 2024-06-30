package secao10.instanciacaoDeDatasEHoras;

import java.time.*;
import java.time.format.DateTimeFormatter;

// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

public class Main {
    public static void main(String[] args) {
        // Todos estes padrões utilizam o formato de texto ISO 8601
        LocalDate localDate = LocalDate.now(); // Exibe o [Ano-Mes-Dia] atual
        LocalDateTime localDateTime = LocalDateTime.now(); // Exibe o [Ano-Mes-Dia], junto com [Hora:Minuto:Segundo] atual
        LocalTime localTime = LocalTime.now(); // Exibe o [Hora:Minuto:Segundo] atual
        Instant instant = Instant.now(); // Exibe instante [Ano-Mes-Dia] atual, junto com [Hora:Minuto:Segundo](Z) atual em Londres

        System.out.println();

        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);
        System.out.println(instant);

        System.out.println();

        LocalDate localDate1 = LocalDate.parse("2022-07-21");
        LocalDateTime localDateTime1 = LocalDateTime.parse("2023-06-10T01:20:45");
        LocalTime localTime1 = LocalTime.parse("05:10:22");
        Instant instant1 = Instant.parse("2024-06-30T07:31:21Z");
        Instant instant2 = Instant.parse("2024-06-30T07:31:21-03:00");

        System.out.println(localDate1);
        System.out.println(localDateTime1);
        System.out.println(localTime1);
        System.out.println(instant1);
        System.out.println(instant2);

        System.out.println();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o padrão que a data será inserida
        LocalDate localDate2 = LocalDate.parse("23/10/2003", dateTimeFormatter);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Define o padrão que a data e a hora será inserida
        LocalDateTime localDateTime2 = LocalDateTime.parse("23/10/2003 10:05:00", dateTimeFormatter1);
        // Outra forma de instanciação do DateTimeFormatter
        LocalDate localDate3 = LocalDate.parse("23/10/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime localDateTime3 = LocalDateTime.parse("23/10/2003 10:05:02", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(localDate2);
        System.out.println(localDateTime2);
        System.out.println(localDate3);
        System.out.println(localDateTime3);

        System.out.println();

        LocalDate localDate4 = LocalDate.of(22, 7, 20);
        LocalDateTime localDateTime4 = LocalDateTime.of(2022, 7, 20, 1, 30, 21);

        System.out.println(localDate4);
        System.out.println(localDateTime4);

        System.out.println();

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.println(localDate4.format(dateTimeFormatter));
        System.out.println(localDateTime4.format(dateTimeFormatter1));
        System.out.println(dateTimeFormatter2.format(instant2));

        System.out.println();

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println(dateTimeFormatter3.format(instant2));
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter4));
        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(localDate.format(dateTimeFormatter5));
    }
}
