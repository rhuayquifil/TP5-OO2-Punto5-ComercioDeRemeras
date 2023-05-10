package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ar.unrn.domain.model.Remera;
import ar.unrn.domain.model.RemeraImportada;
import ar.unrn.domain.model.RemeraNacional;

public class PruebasUnitarias {

	@Test
	public void remeraImportada() {
		Remera importada = new RemeraImportada(100);

		double precioFinal = importada.precioFinal();

		assertEquals(133.0, precioFinal);
	}

	@Test
	public void remeraNacional() {
		Remera nacional = new RemeraNacional(100);

		double precioFinal = nacional.precioFinal();

		assertEquals(136.5, precioFinal);
	}
}
