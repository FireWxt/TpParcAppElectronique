package fr.model;

public class Scanner extends AppareilBase implements Appareil {

	public Scanner(String identifiant, String nom, double prixBase) {
		super(identifiant, nom, prixBase, TypeAppareil.SCANNER);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrixFinale() {
		// TODO Auto-generated method stub
		return 0;
	}

}
