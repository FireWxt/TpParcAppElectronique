package fr.factory;

import fr.model.Appareil;
import fr.model.Ordinateur;
import fr.model.TypeAppareil;

public class FabriqueOrdinateur implements Fabrique{
	@Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Ordinateur(identifiant, nom, prixBase);
	}
}
