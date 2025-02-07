package fr.factory;

import fr.model.Appareil;
import fr.model.Ordinateur;

public class FabriqueOrdinateur implements FabriqueAbstraite{
    @Override
    public Appareil createProduct(String identifiant, String nom, double prixBase) {
        return new Ordinateur(identifiant, nom, prixBase);
    }
}
