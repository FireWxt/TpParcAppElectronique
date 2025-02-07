package fr.factory;

import fr.model.Appareil;
import fr.model.Imprimante;
import fr.model.TypeAppareil;

public class FabriqueImprimante implements Fabrique {
	@Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Imprimante(identifiant, nom, prixBase);
	}
}
