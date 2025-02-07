package fr.decorator;

import fr.model.Appareil;

/**
 * Classe OptionPerformance dans le decorateur pour ajouter l'option performance à un appareil
 */
public class OptionPerformance extends AppareilDecorateur {
    public OptionPerformance(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Boost Performance (50€)";
    }

    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 100;
    }
}
