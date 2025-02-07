package fr.factory;

import fr.model.Appareil;
import fr.model.Scanner;

public class FabriqueScanner implements Fabrique {
    @Override
    public Appareil createProduct(String identifiant, String nom, double prixBase) {
        return new Scanner(identifiant, nom, prixBase);
    }

}
