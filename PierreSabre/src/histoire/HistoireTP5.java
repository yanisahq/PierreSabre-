package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Samourai;
import personnages.Traitre;
import personnages.GrandMere;

public class HistoireTP5 {
    public static void main(String[] args) {
        /*
        // ANCIEN MAIN
        Commercant marco = new Commercant("Marco", 20);
        Commercant chonin = new Commercant("Chonin", 40);
        Commercant kumi = new Commercant("Kumi", 10);
        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        Ronin roro = new Ronin("Roro", "shochu", 60);

        marco.faireConnaissanceAvec(roro);
        marco.faireConnaissanceAvec(yaku);
        marco.faireConnaissanceAvec(chonin);
        marco.faireConnaissanceAvec(kumi);

        marco.listerConnaissance();
        roro.listerConnaissance();
        yaku.listerConnaissance();
        
        Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
        akimoto.direBonjour();
        akimoto.faireConnaissanceAvec(marco);
        akimoto.listerConnaissance();
        akimoto.boire("thé");
        
        Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
        masako.direBonjour();
        masako.ranconner(kumi);
        masako.ranconner(chonin);
        masako.ranconner(marco);
        masako.direBonjour();
        
        masako.faireConnaissanceAvec(akimoto);
        masako.faireConnaissanceAvec(yaku);
        masako.faireLeGentil();
        masako.direBonjour();
        */

        // NOUVEAU MAIN 
        Commercant marco = new Commercant("Marco", 20);
        Commercant chonin = new Commercant("Chonin", 40);
        Commercant kumi = new Commercant("Kumi", 10);
        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
        Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);

        GrandMere grandMere = new GrandMere("Grand-Mère", 10);
        grandMere.faireConnaissanceAvec(akimoto);
        grandMere.faireConnaissanceAvec(yaku);
        grandMere.faireConnaissanceAvec(masako);
        grandMere.faireConnaissanceAvec(kumi);
        grandMere.faireConnaissanceAvec(marco);
        grandMere.faireConnaissanceAvec(chonin); 
        
        grandMere.ragoter();
    }
}