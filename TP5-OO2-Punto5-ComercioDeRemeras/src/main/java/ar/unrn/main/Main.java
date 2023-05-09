package ar.unrn.main;

import ar.unrn.domain.model.Remera;
import ar.unrn.domain.model.RemeraImportada;
import ar.unrn.domain.model.RemeraNacional;

public class Main {

	public static void main(String[] args) {

		Remera importada = new RemeraImportada(100);

		Remera nacional = new RemeraNacional(100);

		System.out.println(importada.precioFinal());
		System.out.println(nacional.precioFinal());
	}

}
