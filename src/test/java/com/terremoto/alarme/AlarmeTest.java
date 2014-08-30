package com.terremoto.alarme;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class AlarmeTest {

	@Test
	public void terremotoForte() {

		// Cria o mock
		Exercito exercito = mock(Exercito.class);

		// Prepara o ambiente
		Alarme alarme = new Alarme();
		alarme.setExercito(exercito);

		// Efetua o estímulo
		alarme.tremorDetectado(8, true);

		// Verificar se os mocks foram acionados
		verify(exercito).suporteTragedia();

	}
	
	@Test
	public void maremotoForte() {

		// Cria o mock
		GuardaCosteira guardaCosteira = mock(GuardaCosteira.class);

		// Prepara o ambiente
		Alarme alarme = new Alarme();
		alarme.setGuardaCosteira(guardaCosteira);

		// Efetua o estímulo
		alarme.tremorDetectado(8, false);

		// Verificar se os mocks foram acionados
		verify(guardaCosteira).suporteTragedia();

	}
	
	@Test
	public void quaimada() {

		// Cria o mock
		CorpoDeBombeiros corpoDeBombeiros = mock(CorpoDeBombeiros.class);

		// Prepara o ambiente
		Alarme alarme = new Alarme();
		alarme.setCorpoDeBombeiros(corpoDeBombeiros);

		// Efetua o estímulo
		alarme.queimadaDetectad();

		// Verificar se os mocks foram acionados
		verify(corpoDeBombeiros).alertaIncendio();

	}

}
