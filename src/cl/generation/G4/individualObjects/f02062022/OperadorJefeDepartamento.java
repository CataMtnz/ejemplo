package cl.generation.G4.individualObjects.f02062022;

public class OperadorJefeDepartamento extends PadreTrabajador {

	private String planificacion;
	private String coordinación;
	private String optimización;
	private Boolean contratar;
	private String asignarResponsabilidad;
	private String asesoramiento;

	public OperadorJefeDepartamento() {
		super();
	}

	public OperadorJefeDepartamento(String planificacion, String coordinación, String optimización, Boolean contratar,
			String asignarResponsabilidad, String asesoramiento) {
		super();
		this.planificacion = planificacion;
		this.coordinación = coordinación;
		this.optimización = optimización;
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

	public String getCoordinación() {
		return coordinación;
	}

	public void setCoordinación(String coordinación) {
		this.coordinación = coordinación;
	}

	public String getOptimización() {
		return optimización;
	}

	public void setOptimización(String optimización) {
		this.optimización = optimización;
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
		return "OperadorJefeDepartamento" + super.toString() + "[planificacion=" + planificacion + ", coordinación=" + coordinación
				+ ", optimización=" + optimización + ", contratar=" + contratar + ", asignarResponsabilidad="
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
