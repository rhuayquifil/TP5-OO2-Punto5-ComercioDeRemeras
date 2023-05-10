package ar.unrn.domain.model;

public class RemeraNacional extends Remera {

	public RemeraNacional(double precioUnitario) {
		super(precioUnitario);
	}

	@Override
	protected double recargo(double precioUnitario) {
		return 0;
	}

	@Override
	protected double impuestoAduanero(double precioUnitario) {
		return 0;
	}

	@Override
	protected double transporte(double precioUnitario) {
		return (precioUnitario * 0.015);
	}

	@Override
	protected double bonificacion(double precioUnitario) {
		return (precioUnitario * 0.2);
	}

	@Override
	protected double recargoDelLocal(double precioUnitario) {
		return (precioUnitario * 0.15);
	}
}
