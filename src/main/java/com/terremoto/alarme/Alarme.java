package com.terremoto.alarme;

/**
 * Hello world!
 * 
 */
public class Alarme {

	private Exercito exercito;

	public void tremorDetectado(int magnitude, boolean terrestre) {
		exercito.suporteTragedia();
		
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;
		
	}

}
