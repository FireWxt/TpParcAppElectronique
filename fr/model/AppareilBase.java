package fr.model;


public abstract class AppareilBase implements Appareil {
	
	protected String identifiant;
	protected String nom;
	protected double prixBase;
	protected TypeAppareil type;
	
	
	public AppareilBase( String identifiant, String nom, double prixBase, TypeAppareil type)
	{
		this.identifiant = identifiant;
		this.nom = nom;
		this.prixBase = prixBase;
		this.type = type;
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


