package com.parc.inventory;

import com.parc.model.Appareil;
import java.util.HashSet;
import java.util.Set;

public class Inventaire {
    private Set<Appareil> appareils;

    public Inventaire() {
        appareils = new HashSet<>();
    }

    public void ajouterAppareil(Appareil appareil) {
        if (appareil != null && appareils.add(appareil)) { 
            System.out.println("Ajout de l'appareil: " + appareil.getIdentifiant());
        }
    }

    public void listerAppareils() {
        for (Appareil appareil : appareils) {
            System.out.println(appareil.getDescription() + ", Prix final: " + appareil.getPrixFinal());
        }
    }
}
