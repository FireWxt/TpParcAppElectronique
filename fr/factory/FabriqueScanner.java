package fr.factory;

import fr.model.Appareil;
import fr.model.Scanner;
import fr.model.TypeAppareil;

/**
 * Classe FabriqueScanner pour créer des scanners
 */
public class FabriqueScanner implements Fabrique {

    /**
     * Créé un appareil
     * @param type Type de l'appareil
     * @param identifiant Identifiant de l'appareil
     * @param nom Nom de l'appareil
     * @param prixBase Prix de base de l'appareil
     * @return Retourne un appareil; un scanner
     */
	@Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Scanner(identifiant, nom, prixBase);
	}

}
