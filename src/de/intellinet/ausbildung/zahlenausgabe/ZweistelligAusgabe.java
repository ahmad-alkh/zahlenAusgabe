/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.zahlenausgabe;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 04.09.2019
 */
public class ZweistelligAusgabe {

    static String zahl[] = {"Null", "Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun"};

    /**
     * TODO Comment
     * 
     * @param args
     */
    public static void main(String[] args) {

        String nameZahl = "54";

        ZweistelligAusgabe zahlenAusgabe = new ZweistelligAusgabe();

        String ausgeschriebenezahl = zahlenAusgabe.schreibeZahlAus1(nameZahl);
    }

    String schreibeZahlAus1(String nameZahl) {

        System.out.println("Eingabe Zahl: " + nameZahl);

        for (int i = 0; i < nameZahl.length(); i++) {

            char c = nameZahl.charAt(i);
            System.out.print(" " + c + "  ");
            int position = Character.getNumericValue(c); //
            System.out.print(zahl[position]);

        }
        return null;

    }

}
