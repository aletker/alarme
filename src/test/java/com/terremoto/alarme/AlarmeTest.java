package com.terremoto.alarme;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class AlarmeTest {

	@Test
	public void terremotoForte() {

		// Cria o mock
		Exercito exercito = mock(Exercito.class);
		SAMU samu = mock(SAMU.class);

		// Prepara o ambiente
		Alarme alarme = new Alarme();
		alarme.setExercito(exercito);
		alarme.setSamu(samu);

		// Efetua o estímulo
		alarme.tremorDetectado(8, true);

		// Verificar se os mocks foram acionados
		verify(exercito).suporteTragedia();
		verify(samu).alertaPossiveisFeridos();

	}
	
	@Test
	public void maremotoForte() {

		// Cria o mock
		GuardaCosteira guardaCosteira = mock(GuardaCosteira.class);
		SAMU samu = mock(SAMU.class);

		// Prepara o ambiente
		Alarme alarme = new Alarme();
		alarme.setGuardaCosteira(guardaCosteira);
		alarme.setSamu(samu);

		// Efetua o estímulo
		alarme.tremorDetectado(8, false);

		// Verificar se os mocks foram acionados
		verify(guardaCosteira).suporteTragedia();
		verify(samu).alertaPossiveisFeridos();

	}
	
	@Test
	public void quaimada() {

		// Cria o mock
		CorpoDeBombeiros corpoDeBombeiros = mock(CorpoDeBombeiros.class);
		SAMU samu = mock(SAMU.class);

		// Prepara o ambiente
		Alarme alarme = new Alarme();
		alarme.setCorpoDeBombeiros(corpoDeBombeiros);
		alarme.setSamu(samu);

		// Efetua o estímulo
		alarme.queimadaDetectad();

		// Verificar se os mocks foram acionados
		InOrder inOrder = inOrder(samu, corpoDeBombeiros);
		inOrder.verify(samu).alertaPossiveisFeridos();
		inOrder.verify(corpoDeBombeiros).alertaIncendio();
		

	}

}
