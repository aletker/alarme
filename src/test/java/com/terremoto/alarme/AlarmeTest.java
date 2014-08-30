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

}
