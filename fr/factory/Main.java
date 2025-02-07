package fr.factory;

import fr.decorator.*;
import fr.inventory.Inventaire;
import fr.model.Appareil;
import fr.model.Imprimante;
import fr.model.*;

public class Main {
    public static void main(String[] args) {
        Inventaire inventaire = Inventaire.getInstance();
        
        Fabrique fabriqueImprimante = new FabriqueImprimante();
        Fabrique fabriqueOrdinateur = new FabriqueOrdinateur();
        Fabrique fabriqueScanner = new FabriqueScanner();
        
        Appareil ordinateur = fabriqueOrdinateur.createProduct(TypeAppareil.ORDINATEUR, "ID001", "PC Gamer", 1200);
        Appareil imprimante = fabriqueImprimante.createProduct(TypeAppareil.IMPRIMANTE,"ID002", "HP LaserJet", 300);
        Appareil scanner = fabriqueScanner.createProduct(TypeAppareil.SCANNER, "ID003", "DELL SCAN ++", 550);

        inventaire.ajouterAppareil(ordinateur);
        inventaire.ajouterAppareil(imprimante);
        inventaire.ajouterAppareil(scanner);


        Appareil pcSecurise = new OptionSecurite(ordinateur);
        Appareil pcPerformant = new OptionPerformance(pcSecurise);
        
        inventaire.ajouterAppareil(pcPerformant);

        inventaire.afficherInventaire();
    }
}
