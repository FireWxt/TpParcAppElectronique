package fr.decorator;

import fr.model.Appareil;

/**
 * Classe OptionSecurite dans le decorateur pour ajouter l'option sécurité à un appareil
 */
public class OptionSecurite extends AppareilDecorateur {
    public OptionSecurite(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Option Sécurité (100€)";
    }

    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 50;
    }
}