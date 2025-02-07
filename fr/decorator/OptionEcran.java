package fr.decorator;

import fr.model.Appareil;

/**
 * Classe OptionEcran dans le decorateur pour ajouter l'option ecran à un appareil
 */
public class OptionEcran extends AppareilDecorateur {

    /**
     * Constructeur de la classe OptionEcran
     * @param appareil Appareil
     */
	public OptionEcran(Appareil appareil) {
		super(appareil);
	}
	
    /**
     * Méthode getDescription pour retourner la description de l'appareil
     * @return Appareil + Ajout d'ecrans (250€)
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " + Ajout d'ecrans (250€)";
    }

    /**
     * Méthode getPrixFinale pour retourner le prix final de l'appareil
     * @return Prix final de l'appareil + 250
     */
    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 250;
    }
}
