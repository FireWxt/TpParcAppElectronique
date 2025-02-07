package fr.model;

public class Ordinateur extends AppareilBase implements Appareil{

	public Ordinateur(String identifiant, String nom, double prixBase) {
		super(identifiant, nom, prixBase, TypeAppareil.ORDINATEUR);
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
