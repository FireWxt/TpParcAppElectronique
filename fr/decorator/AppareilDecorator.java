package fr.decorator;

import fr.model.Appareil;

/**
 * Classe AppareilDecorateur pour les décorateurs des appareils
 */
abstract class AppareilDecorateur implements Appareil {
    protected Appareil appareil;

    public AppareilDecorateur(Appareil appareil) {
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
