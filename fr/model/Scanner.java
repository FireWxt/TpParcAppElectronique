package fr.model;

/**
 * Classe Scanner pour la création de scanners
 * Elle extend AppareilBase et implemente Appareil
 * Elle a un constructeur et override les méthodes activer, getDescription et getPrixFinale
 */
public class Scanner extends AppareilBase implements Appareil {

	public Scanner(String identifiant, String nom, double prixBase) {
		super(identifiant, nom, prixBase, TypeAppareil.SCANNER);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activer() {
		System.out.println("Allumage de l'appareil en cours !");
		
	}

	@Override
	public String getDescription()
	{
		return nom + " (" + type + ") - Prix de base : " + prixBase + "€";
	}
	
	
	
	@Override
	public double getPrixFinale() {
		return prixBase;
	}

}
