package fr.factory;

import fr.model.Appareil;
import fr.model.TypeAppareil;

public interface Fabrique {
      Appareil createProduct(TypeAppareil type,String identifiant, String nom, double prixBase);	
}
