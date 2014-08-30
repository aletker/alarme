package com.terremoto.alarme;

/**
 * Hello world!
 * 
 */
public class Alarme {

	private Exercito exercito;
	private GuardaCosteira guardaCosteira;
	private CorpoDeBombeiros corpoDeBombeiros;

	public void tremorDetectado(int magnitude, boolean terrestre) {
		if (terrestre){
			exercito.suporteTragedia();			
		} else {
			guardaCosteira.suporteTragedia();
		}
		
	}
	
	public void queimadaDetectad() {
		corpoDeBombeiros.alertaIncendio();
		
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;

	}

	public void setGuardaCosteira(GuardaCosteira guardaCosteira) {
		this.guardaCosteira = guardaCosteira;
		
	}

	public void setCorpoDeBombeiros(CorpoDeBombeiros corpoDeBombeiros) {
		this.corpoDeBombeiros = corpoDeBombeiros;
		
	}

	
}
