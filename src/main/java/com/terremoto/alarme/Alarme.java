package com.terremoto.alarme;

/**
 * Hello world! - alterado eclipse
 * alterado git
 * 
 */
public class Alarme {

	private Exercito exercito;
	private GuardaCosteira guardaCosteira;
	private CorpoDeBombeiros corpoDeBombeiros;
	private SAMU samu;

	public void tremorDetectado(int magnitude, boolean terrestre) {
		if (terrestre){
			exercito.suporteTragedia();			
		} else {
			guardaCosteira.suporteTragedia();
		}
		samu.alertaPossiveisFeridos();
	}
	
	public void queimadaDetectad() {
		samu.alertaPossiveisFeridos();
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

	public void setSamu(SAMU samu) {
		this.samu = samu;
		
	}

	
}
