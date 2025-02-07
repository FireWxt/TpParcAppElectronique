package fr.factory;

import fr.model.Appareil;

public class Main {

	public static void main(String[] args) {
		// Tester la fabrique
		Fabrique fabriqueImprimante = new FabriqueImprimante();
		Fabrique fabriqueOrdinateur = new FabriqueOrdinateur();
		Fabrique fabriqueScanner = new FabriqueScanner();

		Appareil appareil = fabriqueImprimante.createProduct("IMP-001", "Imprimante HP", 100);
		System.out.println(appareil.getDescription());
	}
}
