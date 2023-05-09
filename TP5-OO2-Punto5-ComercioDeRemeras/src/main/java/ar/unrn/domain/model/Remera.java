package ar.unrn.domain.model;

public abstract class Remera {

	private double precioUnitario;

	public Remera(double precioUnitario) {
		super();
		this.precioUnitario = precioUnitario;
	}

	public double precioFinal() {
		return recargoDelLocal(bonificacion(transporte(impuestoAduanero(recargo(precioUnitario)))));
	}

	protected abstract double recargo(double precioUnitario);

	protected abstract double impuestoAduanero(double precioUnitario);

	protected abstract double transporte(double precioUnitario);

	protected abstract double bonificacion(double precioUnitario);

	protected abstract double recargoDelLocal(double precioUnitario);

}
