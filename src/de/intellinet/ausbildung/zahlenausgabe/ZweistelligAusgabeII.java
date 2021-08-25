/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.zahlenausgabe;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 25.09.2019
 */
public class ZweistelligAusgabeII {

    static String Eingabe = "50";
    static String zahlAusgabe0_19[] =
            {"Null", "Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "zehn", "Elf", "zwölf",
                    "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achzehn", "neunzehn"};
    static String zahlAusgabe0_9[] = {"", "Ein", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun"};
    static String zahlAusgabe20_90[] =
            {"", "", "Zwanzig", "Dreissig", "Vierzig", "Fünfzig", "Sechszig", "Siebzig", "Achtzig", "Neunzig"};
    static String hundert[] = {"", "hundert"};

    /**
     * 
     * TODO Comment
     * 
     * @param zahl
     * @return
     */
    public static String getZahlAusgeschrieben(int zahl) {

        if (zahl <= 19) {
            return zahlAusgabe0_19[zahl];
        } else {
            String zahlString = "" + zahl;

            int laenge = zahlString.length();

            String ergebnis = "";

            for (int i = laenge - 1; i >= 0; i--) {

                int c = zahlString.charAt(i);

                int position2 = Character.getNumericValue(c);

                if (i == 1) {
                    if (position2 == 0) {
                    } else
                        ergebnis = (zahlAusgabe0_9[position2] + "und");
                } else {
                    ergebnis += (zahlAusgabe20_90[position2]);
                }

            }
            return ergebnis;

        }
    }

    /**
     * 
     * TODO Comment
     * 
     * @param args
     */

    public static void main(String[] args) {

        System.out.println(getZahlAusgeschrieben(16));
        System.out.println(getZahlAusgeschrieben(30));
        System.out.println(getZahlAusgeschrieben(54));
    }
}
