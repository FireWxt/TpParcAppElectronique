package fr.factory;

import fr.model.Appareil;
import fr.model.Scanner;
import fr.model.TypeAppareil;

/**
 * Classe FabriqueScanner pour créer des scanners
 */
public class FabriqueScanner implements Fabrique {

	@Override
	public Appareil createProduct(TypeAppareil type, String identifiant, String nom, double prixBase) {
		return new Scanner(identifiant, nom, prixBase);
	}

}
