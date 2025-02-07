package fr.factory;

import fr.decorator.*;
import fr.inventory.Inventaire;
import fr.model.Appareil;
import fr.model.*;

/**
 * Classe principale du programme
 */
public class Main {
    public static void main(String[] args) {
        Inventaire inventaire = Inventaire.getInstance();
        
        Fabrique fabriqueImprimante = new FabriqueImprimante();
        Fabrique fabriqueOrdinateur = new FabriqueOrdinateur();
        Fabrique fabriqueScanner = new FabriqueScanner();
        Fabrique fabriqueTelephone = new FabriqueTelephone();

        
        Appareil ordinateur = fabriqueOrdinateur.createProduct(TypeAppareil.ORDINATEUR, "ID001", "PC Gamer", 1200);
        Appareil imprimante = fabriqueImprimante.createProduct(TypeAppareil.IMPRIMANTE,"ID002", "HP LaserJet", 300);
        Appareil scanner = fabriqueScanner.createProduct(TypeAppareil.SCANNER, "ID003", "DELL SCAN ++", 550);
        Appareil telephone = fabriqueTelephone.createProduct(TypeAppareil.SCANNER, "ID004", "XIAOMI 4090", 1800);


        inventaire.ajouterAppareil(ordinateur);
        Appareil pcSecurise = new OptionSecurite(ordinateur);
        Appareil pcPerformant = new OptionPerformance(pcSecurise);       
        inventaire.ajouterAppareil(pcPerformant);
          
        inventaire.ajouterAppareil(telephone);
        Appareil telSecurise = new OptionSecurite(telephone);
        Appareil telPliable = new OptionEcran(telSecurise);
        inventaire.ajouterAppareil(telPliable);
        
        
        inventaire.ajouterAppareil(imprimante);
        inventaire.ajouterAppareil(scanner);
             
        inventaire.afficherInventaire();
    }
}
