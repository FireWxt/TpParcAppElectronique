package fr.decorator;

import fr.model.Appareil;

/**
 * Classe AppareilDecorateur pour les décorateurs des appareils
 */
abstract class AppareilDecorateur implements Appareil {
    protected Appareil appareil;

    /**
     * Constructeur de la classe AppareilDecorateur
     * @param appareil
     */
    public AppareilDecorateur(Appareil appareil) {
        this.appareil = appareil;
    }

    /**
     * Méthode activer pour activer l'appareil
     */
    @Override
    public void activer() {
        appareil.activer();
    }

    /**
     * Méthode getDescription pour retourner la description de l'appareil
     * @return Description de l'appareil
     */
    @Override
    public String getDescription() {
        return appareil.getDescription();
    }

    /**
     * Méthode getPrixFinale pour retourner le prix final de l'appareil
     * @return Prix final de l'appareil
     */
    @Override
    public double getPrixFinale() {
        return appareil.getPrixFinale();
    }
}
