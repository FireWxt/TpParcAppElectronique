package fr.model;

/**
 * Classe telephone pour la creation d'un telephone
 * Elle extend AppareilBase et implemente Appareil
 * Elle a un constructeur et override les méthodes activer, getDescription et getPrixFinale
 */
public class Telephone  extends AppareilBase implements Appareil{

	/**
	 * Constructeur de la classe Telephone
	 * @param identifiant Identifiant de l'appareil
	 * @param nom Nom de l'appareil
	 * @param prixBase Prix de base de l'appareil
	 */
	public Telephone(String identifiant, String nom, double prixBase) {
		super(identifiant, nom, prixBase, TypeAppareil.TELEPHONE);
	}

	/**
	 * Méthode pour activer l'appareil
	 * Affiche un message
	 */
	@Override
	public void activer() {
		System.out.println("Allumage de l'appareil en cours !");
		
	}

	/**
	 * Méthode pour obtenir la description de l'appareil
	 * @return Retourne le nom, le type et le prix de base de l'appareil
	 */
	@Override
	public String getDescription()
	{
		return nom + " (" + type + ") - Prix de base : " + prixBase + "€";
	}

	/**
	 * Méthode pour obtenir le prix final de l'appareil
	 * @return Retourne le prix de base de l'appareil
	 */
	@Override
	public double getPrixFinale() {
		return prixBase;
	}

}
