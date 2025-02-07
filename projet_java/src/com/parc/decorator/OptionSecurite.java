package com.parc.decorator;

import com.parc.model.Appareil;

/**
 * Décorateur ajoutant une option de sécurité à un appareil.
 */
public class OptionSecurite extends AppareilDecorator {
    private double prixOption = 50.0;

    /**
     * Constructeur du décorateur OptionSecurite.
     *
     * @param appareil Appareil auquel ajouter l'option
     */
    public OptionSecurite(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return appareil.getDescription() + " + Option Sécurité";
    }

    @Override
    public double getPrixFinal() {
        return appareil.getPrixFinal() + prixOption;
    }

	@Override
	public void activer() {
		// TODO Auto-generated method stub
		
	}
}
