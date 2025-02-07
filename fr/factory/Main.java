package fr.factory;

import fr.model.*;
import fr.inventory.Inventaire;


public class Main {
    public static void main(String[] args) {
    	Inventaire inventaire = Inventaire.getInstance();

        Appareil pc = AppareilFactory.createAppareil(TypeAppareil.INFORMATIQUE, "ID001", "PC Gamer", 1200);
        Appareil imprimante = new Imprimante("ID002", "HP LaserJet", 300);

        inventaire.ajouterAppareil(pc);
        inventaire.ajouterAppareil(imprimante);


        Appareil pcSecurise = new OptionSecurite(pc);
        Appareil pcBoosted = new OptionPerformance(pcSecurise);
        inventaire.ajouterAppareil(pcBoosted);

        inventaire.afficherInventaire();
    }
}
