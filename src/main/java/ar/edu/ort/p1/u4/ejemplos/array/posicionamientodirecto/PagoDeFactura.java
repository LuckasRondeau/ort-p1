package ar.edu.ort.p1.u4.ejemplos.array.posicionamientodirecto;

public class PagoDeFactura {
	private double importe;
	private String empresa;
	private int mes;

	public PagoDeFactura(double importe, String empresa, int mes) {
		this.importe = importe;
		this.empresa = empresa;
		this.mes = mes;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}
