package com.parc.model;

public abstract class Appareil {
    protected String identifiant;
    protected String nom;
    protected double prixBase;
    protected AppareilType type;

    public Appareil(String identifiant, String nom, double prixBase, AppareilType type) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prixBase = prixBase;
        this.type = type;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public AppareilType getType() {
        return type;
    }

    public double getPrixBase() {
        return prixBase;
    }

    public abstract void activer();
    public abstract String getDescription();
    public abstract double getPrixFinal();

    // Ajout des méthodes equals et hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Appareil appareil = (Appareil) obj;
        return identifiant.equals(appareil.identifiant);
    }

    @Override
    public int hashCode() {
        return identifiant.hashCode();
    }
}
