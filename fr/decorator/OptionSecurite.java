package fr.decorator;

import fr.model.Appareil;

public class OptionSecurite extends AppareilDecorator {
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