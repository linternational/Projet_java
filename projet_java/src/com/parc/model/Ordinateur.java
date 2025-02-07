package com.parc.model;

public class Ordinateur extends Appareil {
    public Ordinateur(String identifiant, String nom, double prixBase) {
        super(identifiant, nom, prixBase, AppareilType.ORDINATEUR);
    }

    @Override
    public void activer() {
        System.out.println("L'ordinateur " + nom + " est activé.");
    }

    @Override
    public String getDescription() {
        return "Ordinateur: " + nom + ", Prix de base: " + prixBase;
    }

    @Override
    public double getPrixFinal() {
        return prixBase;
    }
}