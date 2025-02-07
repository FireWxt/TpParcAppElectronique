package fr.model;


/**
 * Interface Appareil pour définir les méthodes des appareils
 */
public interface Appareil {

	/**
	 * Méthode activer pour activer l'appareil
	 */
	void activer();
	
	/**
	 * Méthode getDescription pour retourner la description de l'appareil
	 */
	public String getDescription();
	
	/**
	 * Méthode getPrixFinale pour retourner le prix final de l'appareil
	 */
	public double getPrixFinale();
}
