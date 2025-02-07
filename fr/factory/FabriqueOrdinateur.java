package fr.factory;

import fr.model.Appareil;
import fr.model.Ordinateur;
import fr.model.TypeAppareil;

/**
 * Classe FabriqueOrdinateur pour créer des ordinateurs
 */
public class FabriqueOrdinateur implements Fabrique{
	
    /**
     * Créé un appareil
     * @param type Type de l'appareil
     * @param identifiant Identifiant de l'appareil
     * @param nom Nom de l'appareil
     * @param prixBase Prix de base de l'appareil
     * @return Retourne un appareil; un ordinateur
     */
    @Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Ordinateur(identifiant, nom, prixBase);
	}
}
