package fr.decorator;

import fr.model.Appareil;

/**
 * Classe OptionSecurite dans le decorateur pour ajouter l'option sécurité à un appareil
 */
public class OptionSecurite extends AppareilDecorateur {

    /**
     * Constructeur de la classe OptionSecurite
     * @param appareil
     */
    public OptionSecurite(Appareil appareil) {
        super(appareil);
    }

    /**
     * Méthode getDescription pour retourner la description de l'appareil
     * @return Appareil + Option Sécurité (100€)
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " + Option Sécurité (50€)";
    }

    /**
     * Méthode getPrixFinale pour retourner le prix final de l'appareil
     * @return Prix final de l'appareil + 50
     */
    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 50;
    }
}