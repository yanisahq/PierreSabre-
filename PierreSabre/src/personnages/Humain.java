package personnages;

public class Humain {
	 private String nom;
	 private String boissonFavorite;
	 private int argent;
	 protected int nbConnaissances;  
	 protected Humain[] memoire;    
	 private static final int TAILLE_MEMOIRE = 30;
   
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
        this.nbConnaissances = 0;
        this.memoire = new Humain[TAILLE_MEMOIRE];
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
            perdreArgent(prix);
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
        }
    }

    public void faireConnaissanceAvec(Humain autreHumain) {
        direBonjour();
        autreHumain.repondre(this);
        memoriser(autreHumain);
        autreHumain.memoriser(this);
    }

    private void memoriser(Humain humain) {
        if (nbConnaissances < TAILLE_MEMOIRE) {
            memoire[nbConnaissances] = humain;
            nbConnaissances++;
        } else {
            for (int i = 0; i < TAILLE_MEMOIRE - 1; i++) {
                memoire[i] = memoire[i + 1];
            }
            memoire[TAILLE_MEMOIRE - 1] = humain;
        }
    }

    private void repondre(Humain humain) {
        direBonjour();
    }

    public void listerConnaissance() {
        StringBuilder texte = new StringBuilder("Je connais beaucoup de monde dont : ");
        for (int i = 0; i < nbConnaissances; i++) {
            texte.append(memoire[i].getNom());
            if (i < nbConnaissances - 1) {
                texte.append(", ");
            }
        }
        parler(texte.toString());
    }

    protected void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    protected void gagnerArgent(int gain) {
        argent += gain;
    }

    protected void perdreArgent(int perte) {
        argent -= perte;
    }
}