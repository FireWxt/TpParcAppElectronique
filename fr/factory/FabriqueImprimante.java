package fr.factory;

import fr.model.Appareil;
import fr.model.Imprimante;
import fr.model.TypeAppareil;

/**
 * Classe FabriqueImprimante pour créer des imprimantes
 */
public class FabriqueImprimante implements Fabrique {
	
    /**
     * Créé un appareil
     * @param type Type de l'appareil
     * @param identifiant Identifiant de l'appareil
     * @param nom Nom de l'appareil
     * @param prixBase Prix de base de l'appareil
     * @return Retourne un appareil; une imprimante
     */
    @Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Imprimante(identifiant, nom, prixBase);
	}
}
