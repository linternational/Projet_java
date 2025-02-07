package com.parc;

import com.parc.model.Appareil;
import com.parc.model.AppareilType;
import com.parc.inventory.Inventaire;
import com.parc.decorator.OptionSecurite;
import com.parc.decorator.OptionPerformance;
import com.parc.factory.AppareilFactory;

public class Main {
    public static void main(String[] args) {
        Inventaire inventaire = new Inventaire();

        Appareil ordinateur1 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "Gaming DELL Valentin", 1500);
        Appareil ordinateur2 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "Bureau HP ProBook 4", 400);
        Appareil ordinateur3 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "Portable ASUS Acer Nitro", 800);
        Appareil ordinateur4 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "LENEVO ThinkPad 360", 750);
        Appareil ordinateur5 = AppareilFactory.createAppareil(AppareilType.ORDINATEUR, "YOGA XRR", 1600);

        // Ajouter les appareils à l'inventaire
        inventaire.ajouterAppareil(ordinateur1);
        inventaire.ajouterAppareil(ordinateur2);
        inventaire.ajouterAppareil(ordinateur3);
        inventaire.ajouterAppareil(ordinateur4);
        inventaire.ajouterAppareil(ordinateur5);

        // Appliquer des options de sécurité et de performance (exemple)
        ordinateur1 = new OptionSecurite(ordinateur1);
        ordinateur2 = new OptionPerformance(ordinateur2);
        ordinateur3 = new OptionSecurite(new OptionPerformance(ordinateur3));
        ordinateur4 = new OptionPerformance(ordinateur4);
        ordinateur5 = new OptionSecurite(ordinateur5);

        // Ajouter les appareils décorés à l'inventaire
        inventaire.ajouterAppareil(ordinateur1);
        inventaire.ajouterAppareil(ordinateur2);
        inventaire.ajouterAppareil(ordinateur3);
        inventaire.ajouterAppareil(ordinateur4);
        inventaire.ajouterAppareil(ordinateur5);

        // Afficher la liste des appareils
        System.out.println("Liste des appareils dans l'inventaire:");
        inventaire.listerAppareils();
    }
}