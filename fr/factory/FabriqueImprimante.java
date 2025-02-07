package fr.factory;

import fr.model.Appareil;
import fr.model.Imprimante;

public class FabriqueImprimante implements FabriqueAbstraite {
    @Override
    public Appareil createProduct(String identifiant, String nom, double prixBase) {
        return new Imprimante(identifiant, nom, prixBase);
    }
}
