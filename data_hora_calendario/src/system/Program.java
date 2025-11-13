package system;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        // Data/hora AGORA
        LocalDate dt01 = LocalDate.now();
        LocalDateTime dt02 = LocalDateTime.now();
        Instant dt03 = Instant.now();

        // Texto ISO 8601
        LocalDate dt04 = LocalDate.parse("2025-11-11");
        LocalDateTime dt05 = LocalDateTime.parse("2025-11-11T19:24:33");
        Instant dt06 = Instant.parse("2025-11-11T19:26:34Z");
        Instant dt07 = Instant.parse("2025-11-11T19:24:33-03:00");

        // Texto formato customizado (formato brasileiro)
        DateTimeFormatter fmtBrDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dt08 = LocalDate.parse("11/10/2025", fmtBrDate);

        // Formatadores para exibir as datas no formato brasileiro
        DateTimeFormatter fmtBrDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Impressões formatadas
        System.out.println("dt01 (LocalDate): " + dt01.format(fmtBrDate));
        System.out.println("dt02 (LocalDateTime): " + dt02.format(fmtBrDateTime));

        // Para Instant, é preciso converter para uma zona (ex: São Paulo)
        DateTimeFormatter fmtBrInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
                .withZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("dt03 (Instant): " + fmtBrInstant.format(dt03));

        System.out.println("dt04: " + dt04.format(fmtBrDate));
        System.out.println("dt05: " + dt05.format(fmtBrDateTime));
        System.out.println("dt06: " + fmtBrInstant.format(dt06));
        System.out.println("dt07: " + fmtBrInstant.format(dt07));
        System.out.println("dt08: " + dt08.format(fmtBrDate));
    }
}
