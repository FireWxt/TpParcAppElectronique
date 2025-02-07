package fr.factory;

import fr.model.Appareil;
import fr.model.Telephone;
import fr.model.TypeAppareil;

/**
 * Classe FabriqueTelephone pour créer des téléphones
 */
public class FabriqueTelephone  implements Fabrique{
	
	/**
     * Créé un appareil
     * @param type Type de l'appareil
     * @param identifiant Identifiant de l'appareil
     * @param nom Nom de l'appareil
     * @param prixBase Prix de base de l'appareil
     * @return Retourne un appareil; un téléphone
     */
	@Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Telephone(identifiant, nom, prixBase);
	}

}
