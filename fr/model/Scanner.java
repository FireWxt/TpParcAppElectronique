package fr.model;

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
