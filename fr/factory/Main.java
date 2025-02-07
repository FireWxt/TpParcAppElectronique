class OptionSecurite extends AppareilDecorator {
    public OptionSecurite(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Option Sécurité";
    }

    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 50;
    }
}

class OptionPerformance extends AppareilDecorator {
    public OptionPerformance(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Boost Performance";
    }

    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 100;
    }
}

// Factory Pattern
class AppareilFactory {
    public static Appareil createAppareil(TypeAppareil type, String identifiant, String nom, double prixBase) {
        switch (type) {
            case INFORMATIQUE:
                return new Ordinateur(identifiant, nom, prixBase);
            case ELECTROMENAGER:
            case MULTIMEDIA:
            case TELEPHONIE:
                throw new IllegalArgumentException("Type d'appareil non implémenté");
            default:
                throw new IllegalArgumentException("Type d'appareil inconnu");
        }
    }
}

// Programme principal
public class Main {
    public static void main(String[] args) {
        Inventaire inventaire = Inventaire.getInstance();

        Appareil pc = AppareilFactory.createAppareil(TypeAppareil.INFORMATIQUE, "ID001", "PC Gamer", 1200);
        Appareil imprimante = new Imprimante("ID002", "HP LaserJet", 300);

        inventaire.ajouterAppareil(pc);
        inventaire.ajouterAppareil(imprimante);

        // Ajout d'options
        Appareil pcSecurise = new OptionSecurite(pc);
        Appareil pcBoosted = new OptionPerformance(pcSecurise);
        inventaire.ajouterAppareil(pcBoosted);

        // Affichage de l'inventaire
        inventaire.afficherInventaire();
    }
}
