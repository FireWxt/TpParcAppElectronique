package fr.decorator;

import fr.model.Appareil;

public class OptionPerformance extends AppareilDecorator {
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
