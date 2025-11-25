package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation = 0;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
    }

    public void extorquer(Commercant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai piqué les " + argentExtorque + " sous de " + victime.getNom() + 
               ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    public int getReputation() {
        return reputation;
    }
    
    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return argentPerdu;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
    
    public void provoquer(Yakuza adversaire) {
        int force = 2 * honneur;
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        
        if (force >= adversaire.getReputation()) {
            parler("Je t'ai eu petit yakuza!");
            int gain = adversaire.perdre();
            gagnerArgent(gain);
            honneur++;
        } else {
            honneur--;
            int argentPerdu = getArgent();
            perdreArgent(argentPerdu);
            adversaire.gagner(argentPerdu);
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
        }
    }
    
    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return argentPerdu;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }

    public int getReputation() {
        return reputation;
    }
    
    
}