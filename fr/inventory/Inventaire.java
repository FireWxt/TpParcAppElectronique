package fr.inventory;

import java.util.ArrayList;
import java.util.List;

import fr.model.Appareil;

/**
 * Classe Inventaire pour gérer et stocker les appareils
 * Patron de conception Singleton
 * La classe contient une instance d'elle-même et une liste d'appareils
 */
public class Inventaire {
    private static Inventaire instance;
    private List<Appareil> appareils;

    /**
     * Constructeur de la classe Inventaire
     */
    private Inventaire() {
        appareils = new ArrayList<>();
    }

    /**
     * Méthode getInstance pour retourner l'instance de la classe Inventaire
     * Si l'instance est null, on crée une nouvelle instances, sinon on retourne l'instance existante
     * @return Instance de la classe Inventaire
     */
    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    /**
     * Méthode ajouterAppareil pour ajouter un appareil à la liste
     * @param appareil
     */
    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    /**
     * Méthode supprimerAppareil pour supprimer un appareil de la liste
     */
    public void afficherInventaire() {
        for (Appareil a : appareils) {
            System.out.println(a.getDescription());
        }
    }

}
