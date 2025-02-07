package fr.model;

/**
 * Classe Imprimante pour créer des imprimantes
 * Elle étend AppareilBase et implémente Appareil
 * Elle a un constructeur et redéfinit les méthodes activer, getDescription et getPrixFinale
 */
public class Imprimante extends AppareilBase implements Appareil{

	public Imprimante(String identifiant, String nom, double prixBase) {
		super(identifiant, nom, prixBase, TypeAppareil.IMPRIMANTE);
		
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
