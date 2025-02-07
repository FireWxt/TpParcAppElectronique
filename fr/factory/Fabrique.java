package fr.factory;

import fr.model.Appareil;
import fr.model.TypeAppareil;

/**
 * Interface Fabrique pour la création d'appareils
 */
public interface Fabrique {
    /**
     * Créé un appareil en fonction du type
     * @param type Type de l'appareil
     * @param identifiant Identifiant de l'appareil
     * @param nom Nom de l'appareil
     * @param prixBase Prix de base de l'appareil
     * @return Retourne un appareil
     */
    Appareil createProduct(TypeAppareil type,String identifiant, String nom, double prixBase);	
}
