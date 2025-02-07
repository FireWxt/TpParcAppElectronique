package fr.inventory;

import java.util.ArrayList;
import java.util.List;

import fr.model.Appareil;

public class Inventaire {
    private static Inventaire instance;
    private List<Appareil> appareils;

    private Inventaire() {
        appareils = new ArrayList<>();
    }

    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }

    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void afficherInventaire() {
        for (Appareil a : appareils) {
            System.out.println(a.getDescription());
        }
    }

}
