package fr.model;


/**
 * Classe AppareilBase pour définir les attributs de base des appareils
 * C'est une classe abstraite
 * Elle a un constructeur avec des paramètres prenant les attributs des appareils
 * Elle a des attributs : identifiant, nom, prixBase, type
 */
public abstract class AppareilBase  {
	protected String identifiant;
	protected String nom;
	protected double prixBase;
	protected TypeAppareil type;
	
	/**
	 * Constructeur de la classe AppareilBase
	 * @param identifiant Identifiant de l'appareil
	 * @param nom Nom de l'appareil
	 * @param prixBase Prix de base de l'appareil
	 * @param type Type de l'appareil
	 */
	public AppareilBase( String identifiant, String nom, double prixBase, TypeAppareil type)
	{
		this.identifiant = identifiant;
		this.nom = nom;
		this.prixBase = prixBase;
		this.type = type;
	}
	
	

}


