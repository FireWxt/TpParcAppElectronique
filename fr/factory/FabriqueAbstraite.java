package fr.factory;

import fr.model.Appareil;

public interface FabriqueAbstraite {
    Appareil createProduct(String identifiant, String nom, double prixBase);
}
