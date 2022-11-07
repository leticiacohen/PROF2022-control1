package upm.examen;

public class AsignaturaInstance implements Asignatura {
	
	double importe;
	
	public AsignaturaInstance(double importe) {
		this.importe = importe;
	}

	@Override
	public double getImporte() {
		return this.importe;
	}

}
