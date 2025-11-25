package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation = 0;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mon clan est celui de " + clan + ".");
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