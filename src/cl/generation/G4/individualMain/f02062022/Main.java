package cl.generation.G4.individualMain.f02062022;

import cl.generation.G4.individualObjects.f02062022.OperadorJefeDepartamento;
import cl.generation.G4.individualObjects.f02062022.OperadorSecretario;
import cl.generation.G4.individualObjects.f02062022.PadreTrabajador;

public class Main {

	public static void main(String[] args) {
	
	PadreTrabajador padreTrabajador = new PadreTrabajador();
	padreTrabajador.setNombre(" trabajador");
	padreTrabajador.setRut(" 12.345.678-k");
	padreTrabajador.setArea(" Area correspondiente");
	padreTrabajador.setProcedimientos(" Ej: Ventas");
	padreTrabajador.setAdministración(" Ej: Scrum Master");
	padreTrabajador.setResponsabilidades(" Ej: ver los tiempos");
	padreTrabajador.setInformes("Informes de " + padreTrabajador.getArea());
	padreTrabajador.setAtenderLlamadas(true);
	padreTrabajador.setReuniones(true);
	padreTrabajador.setOrganizarAgenda(" Mes Junio");
	
	OperadorJefeDepartamento operadorJefeDepartamento = new OperadorJefeDepartamento();
	operadorJefeDepartamento.setNombre(" Leonidas");
	operadorJefeDepartamento.setRut(" 25.345.678-k");
	operadorJefeDepartamento.setArea(" Area de Software");
	operadorJefeDepartamento.setProcedimientos(" Analisis de Proyecto");
	operadorJefeDepartamento.setAdministración(" Scrum Master de Area" + operadorJefeDepartamento.getArea());
	operadorJefeDepartamento.setAsignarResponsabilidad(" Asignar Tiempos a las actividades");
	operadorJefeDepartamento.setAtenderLlamadas(true);
	operadorJefeDepartamento.setReuniones(false);
	operadorJefeDepartamento.setOrganizarAgenda(" semana 1 - Junio");

	
	operadorJefeDepartamento.setPlanificacion(" Proyecto 1");
	operadorJefeDepartamento.setCoordinación(" Establecer tiempos");
	operadorJefeDepartamento.setOptimización(" Verificar valor");
	operadorJefeDepartamento.setContratar(true);
	operadorJefeDepartamento.setAsignarResponsabilidad(" Asignar Cargos");
	operadorJefeDepartamento.setAsesoramiento(" Hacer feedback y responder consultas");
	
	
	OperadorSecretario operadorSecretario = new OperadorSecretario();
	operadorSecretario.setOrganicarReuniones(" Llamar y verificar disponibilidad de los integrantes de reuniones");//CAMBIAR ORGANIZAR
	operadorSecretario.setOrganizarAgenda(" Planificar los tiempos del Jefe");
	operadorSecretario.setAtenderVisitas(true);
	
	operadorSecretario.setNombre(" Mariachi");
	operadorSecretario.setRut(" 19.345.678-k");
	operadorSecretario.setArea(" Area Departamento de Desarrolladores");
	operadorSecretario.setProcedimientos(" Tests de Proyecto");
	operadorSecretario.setAdministración(" Desarrollador");
	operadorSecretario.setResponsabilidades(" generar test del programa");
	operadorSecretario.setAtenderLlamadas(false);
	operadorSecretario.setReuniones(true);
	operadorSecretario.setOrganizarAgenda(" semana 1 -Junio");
	
	
	System.out.println(padreTrabajador.toString());
	System.out.println(operadorJefeDepartamento.toString());
	System.out.println(operadorSecretario.toString());
	}

}
