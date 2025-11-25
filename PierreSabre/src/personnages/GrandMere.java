package personnages;

import java.util.Random;

public class GrandMere extends Humain {
    private static final int TAILLE_MEMOIRE = 5;
    private Random random = new Random();

    private enum TypeHumain {
        COMMERCANT, RONIN, SAMOURAI, YAKUZA, TRAITRE, HABITANT
    }

    public GrandMere(String nom, int argent) {
        super(nom, "tisane", argent);
    }

    @Override
    protected void memoriser(Humain humain) {
        if (nbConnaissances < TAILLE_MEMOIRE) {
            super.memoriser(humain);
        } else {
            parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
        }
    }

    private String humainHasard() {
        TypeHumain[] types = TypeHumain.values();
        return types[random.nextInt(types.length)].toString().toLowerCase();
    }

    public void ragoter() {
        for (int i = 0; i < nbConnaissances; i++) {
            Humain connaissance = memoire[i];
            if (connaissance instanceof Traitre) {
                parler("Je sais que " + connaissance.getNom() + " est un traître. Petit chenapan !");
            } else {
                parler("Je crois que " + connaissance.getNom() + " est un " + humainHasard());
            }
        }
    }
}