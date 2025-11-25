package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
    public static void main(String[] args) {
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        
        Commercant marco2 = new Commercant("Marco", 15);
        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        yaku.direBonjour();
        yaku.extorquer(marco2);
        
        Ronin roro = new Ronin("Roro", "shochu", 60);
        roro.direBonjour();
        roro.donner(marco);

        roro.provoquer(yaku);
    }

}