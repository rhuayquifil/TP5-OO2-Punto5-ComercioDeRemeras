package ar.unrn.domain.model;

public class RemeraImportada extends Remera {

	public RemeraImportada(double precioUnitario) {
		super(precioUnitario);
	}

	@Override
	protected double recargo(double precioUnitario) {
		return (precioUnitario * 0.03);
	}

	@Override
	protected double impuestoAduanero(double precioUnitario) {
		return (precioUnitario * 0.05);
	}

	@Override
	protected double transporte(double precioUnitario) {
		return 0;
	}

	@Override
	protected double bonificacion(double precioUnitario) {
		return 0;
	}

	@Override
	protected double recargoDelLocal(double precioUnitario) {
		return (precioUnitario * 0.25);
	}
}
