package com.parc.model;

public class Imprimante extends Appareil {
    public Imprimante(String identifiant, String nom, double prixBase) {
        super(identifiant, nom, prixBase, AppareilType.IMPRIMANTE);
    }

    @Override
    public void activer() {
        System.out.println("L'imprimante " + nom + " est activée.");
    }

    @Override
    public String getDescription() {
        return "Imprimante: " + nom + ", Prix de base: " + prixBase;
    }

    @Override
    public double getPrixFinal() {
        return prixBase;
    }
}