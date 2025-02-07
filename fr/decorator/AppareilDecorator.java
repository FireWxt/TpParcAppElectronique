package fr.decorator;

import fr.model.Appareil;

abstract class AppareilDecorator implements Appareil {
    protected Appareil appareil;

    public AppareilDecorator(Appareil appareil) {
        this.appareil = appareil;
    }

    @Override
    public void activer() {
        appareil.activer();
    }

    @Override
    public String getDescription() {
        return appareil.getDescription();
    }

    @Override
    public double getPrixFinale() {
        return appareil.getPrixFinale();
    }
}
