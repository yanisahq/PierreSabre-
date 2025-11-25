package histoire;

import personnages.Commercant;

public class HistoireTP4 {
    public static void main(String[] args) {
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
    }
}