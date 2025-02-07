package fr.decorator;

import fr.model.Appareil;

/**
 * Classe OptionPerformance dans le decorateur pour ajouter l'option performance à un appareil
 */
public class OptionPerformance extends AppareilDecorateur {

    /**
     * Constructeur de la classe OptionPerformance
     * @param appareil
     */
    public OptionPerformance(Appareil appareil) {
        super(appareil);
    }

    /**
     * Méthode getDescription pour retourner la description de l'appareil
     * @return Appareil + Boost Performance (50€)
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " + Boost Performance (50€)";
    }

    /**
     * Méthode getPrixFinale pour retourner le prix final de l'appareil
     * @return Prix final de l'appareil + 100
     */
    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 100;
    }
}
