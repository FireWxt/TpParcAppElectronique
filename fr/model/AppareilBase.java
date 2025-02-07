package fr.model;


public abstract class AppareilBase  {
	
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
	
	

}


