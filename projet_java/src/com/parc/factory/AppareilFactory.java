package com.parc.factory;

import com.parc.model.Appareil;
import com.parc.model.AppareilType;
import com.parc.model.Ordinateur;
import com.parc.model.Imprimante;

public class AppareilFactory {
    public static Appareil createAppareil(AppareilType type, String nom, double prixBase) {
        switch (type) {
            case ORDINATEUR:
                return new Ordinateur("ID_" + nom, nom, prixBase);
            case IMPRIMANTE:
                return new Imprimante("ID_" + nom, nom, prixBase);
            default:
                throw new IllegalArgumentException("Type d'appareil non supporté.");
        }
    }
}