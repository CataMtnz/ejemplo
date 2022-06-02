package cl.generation.G4.individualObjects.f02062022;

public class OperadorJefeDepartamento extends PadreTrabajador {

	private String planificacion;
	private String coordinaci�n;
	private String optimizaci�n;
	private Boolean contratar;
	private String asignarResponsabilidad;
	private String asesoramiento;

	public OperadorJefeDepartamento() {
		super();
	}

	public OperadorJefeDepartamento(String planificacion, String coordinaci�n, String optimizaci�n, Boolean contratar,
			String asignarResponsabilidad, String asesoramiento) {
		super();
		this.planificacion = planificacion;
		this.coordinaci�n = coordinaci�n;
		this.optimizaci�n = optimizaci�n;
		this.contratar = contratar;
		this.asignarResponsabilidad = asignarResponsabilidad;
		this.asesoramiento = asesoramiento;
	}

	public String getPlanificacion() {
		return planificacion;
	}

	public void setPlanificacion(String planificacion) {
		this.planificacion = planificacion;
	}

	public String getCoordinaci�n() {
		return coordinaci�n;
	}

	public void setCoordinaci�n(String coordinaci�n) {
		this.coordinaci�n = coordinaci�n;
	}

	public String getOptimizaci�n() {
		return optimizaci�n;
	}

	public void setOptimizaci�n(String optimizaci�n) {
		this.optimizaci�n = optimizaci�n;
	}

	public Boolean getContratar() {
		return contratar;
	}

	public void setContratar(Boolean contratar) {
		this.contratar = contratar;
	}

	public String getAsignarResponsabilidad() {
		return asignarResponsabilidad;
	}

	public void setAsignarResponsabilidad(String asignarResponsabilidad) {
		this.asignarResponsabilidad = asignarResponsabilidad;
	}

	public String getAsesoramiento() {
		return asesoramiento;
	}

	public void setAsesoramiento(String asesoramiento) {
		this.asesoramiento = asesoramiento;
	}

	@Override
	public String toString() {
		return "OperadorJefeDepartamento" + super.toString() + "[planificacion=" + planificacion + ", coordinaci�n=" + coordinaci�n
				+ ", optimizaci�n=" + optimizaci�n + ", contratar=" + contratar + ", asignarResponsabilidad="
				+ asignarResponsabilidad + ", asesoramiento=" + asesoramiento;
	}

	public String AptoParaPuesto(Boolean contratar) {
		if (contratar == true) {
			return "Usted es apto para el puesto";
		} else {
			return "Usted no cuenta con los requerimientos de la empresa";
		}
	}
}
