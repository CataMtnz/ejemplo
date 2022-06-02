package cl.generation.G4.individualObjects.f02062022;

public class OperadorSecretario extends PadreTrabajador{

	private String organicarReuniones;
	private String organizarAgenda;
	private Boolean atenderVisitas;
	
	public OperadorSecretario() {
		super();
	}

	public OperadorSecretario(String organicarReuniones, String organizarAgenda, Boolean atenderVisitas) {
		super();
		this.organicarReuniones = organicarReuniones;
		this.organizarAgenda = organizarAgenda;
		this.atenderVisitas = atenderVisitas;
	}

	public String getOrganicarReuniones() {
		return organicarReuniones;
	}

	public void setOrganicarReuniones(String organicarReuniones) {
		this.organicarReuniones = organicarReuniones;
	}

	public String getOrganizarAgenda() {
		return organizarAgenda;
	}

	public void setOrganizarAgenda(String organizarAgenda) {
		this.organizarAgenda = organizarAgenda;
	}

	public Boolean getAtenderVisitas() {
		return atenderVisitas;
	}

	public void setAtenderVisitas(Boolean atenderVisitas) {
		this.atenderVisitas = atenderVisitas;
	}

	@Override
	public String toString() {
		return "OperadorSecretario" + super.toString() + "[organicarReuniones=" + organicarReuniones + ", organizarAgenda=" + organizarAgenda
				+ ", atenderVisitas=" + atenderVisitas;
	}
	public String VerificarPaseAEmpresa(Boolean atenderVisitas) {
		if (atenderVisitas == true) {
			return "Un gusto (+NOMBRE) ingrese a (+LUGAR ASGINADO)";
		} else {
			return "Usted no cuenta con una hora agendada, permitame ver su caso";
		}
	}
}