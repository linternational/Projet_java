package com.parc.decorator;

import com.parc.model.Appareil;

public abstract class AppareilDecorator extends Appareil {
    protected Appareil appareil;

    public AppareilDecorator(Appareil appareil) {
        super(appareil.getIdentifiant(), appareil.getNom(), appareil.getPrixBase(), appareil.getType());
        this.appareil = appareil;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getPrixFinal();

    // Redéfinition de equals et hashCode pour éviter les doublons
    @Override
    public boolean equals(Object obj) {
        return appareil.equals(obj);
    }

    @Override
    public int hashCode() {
        return appareil.hashCode();
    }
}
