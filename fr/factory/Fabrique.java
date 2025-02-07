package fr.factory;

import fr.model.Appareil;

public interface Fabrique {
    Appareil createProduct(String identifiant, String nom, double prixBase);
}
