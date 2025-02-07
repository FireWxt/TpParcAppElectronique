package fr.decorator;

import fr.model.Appareil;

public class OptionEcran extends AppareilDecorateur {

	public OptionEcran(Appareil appareil) {
		super(appareil);
	}
	
    @Override
    public String getDescription() {
        return super.getDescription() + " + Ajout d'ecrans (250€)";
    }
    @Override
    public double getPrixFinale() {
        return super.getPrixFinale() + 250;
    }
}
