package cl.generation.G4.individualObjects.f02062022;

public class PadreTrabajador {
	
	//Compartidas
	private String nombre;
	private String rut;
	private String area;
	private String procedimientos;
	private String administraci�n;
	private String responsabilidades;
	private String Informes;
	private Boolean atenderLlamadas;
	private Boolean Reuniones;
	private String organizarAgenda;
	
	public PadreTrabajador() {
		super();
	}

	public PadreTrabajador(String nombre, String rut, String area, String procedimientos, String administraci�n,
			String responsabilidades, String informes, Boolean atenderLlamadas, Boolean reuniones,
			String organizarAgenda) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.area = area;
		this.procedimientos = procedimientos;
		this.administraci�n = administraci�n;
		this.responsabilidades = responsabilidades;
		Informes = informes;
		this.atenderLlamadas = atenderLlamadas;
		Reuniones = reuniones;
		this.organizarAgenda = organizarAgenda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getProcedimientos() {
		return procedimientos;
	}

	public void setProcedimientos(String procedimientos) {
		this.procedimientos = procedimientos;
	}

	public String getAdministraci�n() {
		return administraci�n;
	}

	public void setAdministraci�n(String administraci�n) {
		this.administraci�n = administraci�n;
	}

	public String getResponsabilidades() {
		return responsabilidades;
	}

	public void setResponsabilidades(String responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public String getInformes() {
		return Informes;
	}

	public void setInformes(String informes) {
		Informes = informes;
	}

	public Boolean getAtenderLlamadas() {
		return atenderLlamadas;
	}

	public void setAtenderLlamadas(Boolean atenderLlamadas) {
		this.atenderLlamadas = atenderLlamadas;
	}

	public Boolean getReuniones() {
		return Reuniones;
	}

	public void setReuniones(Boolean reuniones) {
		Reuniones = reuniones;
	}

	public String getOrganizarAgenda() {
		return organizarAgenda;
	}

	public void setOrganizarAgenda(String organizarAgenda) {
		this.organizarAgenda = organizarAgenda;
	}

	@Override
	public String toString() {
		return "PadreTrabajador [nombre=" + nombre + ", rut=" + rut + ", area=" + area + ", procedimientos="
				+ procedimientos + ", administraci�n=" + administraci�n + ", responsabilidades=" + responsabilidades
				+ ", Informes=" + Informes + ", atenderLlamadas=" + atenderLlamadas + ", Reuniones=" + Reuniones
				+ ", organizarAgenda=" + organizarAgenda + "]";
	}
	public String Contestar(Boolean atenderLlamadas) {
		if (atenderLlamadas == true) {
			return "Hola, somos la empresa G4, soy" + nombre + "�qu� requiere?";
		} else {
			return "Se ha equivocado de n�mero, que tenga un buen d�a";
			}
	}
	public String AprobarReunion(Boolean Reuniones) {
			if (Reuniones == true) {
				return "Perfecto la reuni�n comienza  a las (+HORAS) en (+LUGAR ASIGNADO)";
			} else {
				return "No se ha generado la reuni�n, permita asginar un reagendamiento";
			}
	}
}
	