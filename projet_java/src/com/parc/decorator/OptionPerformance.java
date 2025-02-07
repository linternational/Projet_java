package com.parc.decorator;

import com.parc.model.Appareil;

public class OptionPerformance extends AppareilDecorator {
    private double prixOption = 100.0;

    public OptionPerformance(Appareil appareil) {
        super(appareil);
    }

    @Override
    public String getDescription() {
        return appareil.getDescription() + " + Option Performance";
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