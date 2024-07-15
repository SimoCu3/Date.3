/*
CONSEGNA:
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
*/

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        String dateStringYears = date.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Anno: " + dateStringYears);

        String dateStringMonth = date.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("Mese: " + dateStringMonth);

        String dateStringDay1 = date.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("Giorno: " + dateStringDay1);

        String dateStringDay2 = date.format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("Giorno della settimana: " + dateStringDay2);

    }
}

/*
CORREZIONE:

*/