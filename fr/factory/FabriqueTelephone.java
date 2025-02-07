package fr.factory;

import fr.model.Appareil;
import fr.model.Telephone;
import fr.model.TypeAppareil;

/**
 * Classe FabriqueTelephone pour créer des téléphones
 */
public class FabriqueTelephone  implements Fabrique{
	@Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Telephone(identifiant, nom, prixBase);
	}

}
