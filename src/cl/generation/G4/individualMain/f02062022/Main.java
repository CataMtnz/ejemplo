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
	operadorJefeDepartamento.setAdministración(" Scrum Master de " + operadorJefeDepartamento.getArea());
	operadorJefeDepartamento.setResponsabilidades("Verificación de proyecto");
	operadorJefeDepartamento.setInformes("Informes de " + operadorJefeDepartamento.getArea());
	operadorJefeDepartamento.setAtenderLlamadas(true);
	operadorJefeDepartamento.setReuniones(false);
	operadorJefeDepartamento.setOrganizarAgenda(" semana 1 - Junio");

	
	operadorJefeDepartamento.setPlanificacion(" Proyecto 1");
	operadorJefeDepartamento.setCoordinación(" Asignar Tiempos a las actividades");
	operadorJefeDepartamento.setOptimización(" Verificar valor");
	operadorJefeDepartamento.setContratar(false);// 
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
	operadorSecretario.setInformes("Informes de " + operadorSecretario.getArea());
	operadorSecretario.setAtenderLlamadas(false);
	operadorSecretario.setReuniones(true);
	operadorSecretario.setOrganizarAgenda(" semana 1 -Junio");
	
	//PROBANDO CARACTERÍSTICAS DE PADRE TRABAJADOR EN OPERADOR JEFE DEPARTAMENTO
	System.out.println(operadorJefeDepartamento.Contestar(operadorJefeDepartamento.getAtenderLlamadas()));
	operadorJefeDepartamento.setAtenderLlamadas(false);
	System.out.println(operadorJefeDepartamento.Contestar(operadorJefeDepartamento.getAtenderLlamadas()));
	
	System.out.println(operadorJefeDepartamento.AprobarReunion(operadorJefeDepartamento.getReuniones()));
	operadorJefeDepartamento.setReuniones(true);
	System.out.println(operadorJefeDepartamento.AprobarReunion(operadorJefeDepartamento.getReuniones()));
	
	System.out.println(" ");
	//características propias de JEFE DEPARTAMENTO
	System.out.println(operadorJefeDepartamento.AptoParaPuesto(operadorJefeDepartamento.getContratar()));
	operadorJefeDepartamento.setContratar(true);
	System.out.println(operadorJefeDepartamento.AptoParaPuesto(operadorJefeDepartamento.getContratar()));
	
	System.out.println(" ");
	
	//PROBANDO CARACTERÍSTICAS DE PADRE TRABAJADOR EN OPERADOR SECRETARIO
	System.out.println(operadorSecretario.Contestar(operadorSecretario.getAtenderLlamadas()));
	operadorSecretario.setAtenderLlamadas(true);
	System.out.println(operadorSecretario.Contestar(operadorSecretario.getAtenderLlamadas()));
	
	System.out.println(operadorSecretario.AprobarReunion(operadorSecretario.getReuniones()));
	operadorSecretario.setReuniones(false);
	System.out.println(operadorSecretario.AprobarReunion(operadorSecretario.getReuniones()));
	
	System.out.println(" ");
	
	//PROBANDO CARACTERISTICAS PROPIAS DE OPERADOR SECRETARIO
	System.out.println(operadorSecretario.VerificarPaseAEmpresa(operadorSecretario.getAtenderVisitas()));
	operadorSecretario.setAtenderVisitas(false);
	System.out.println(operadorSecretario.VerificarPaseAEmpresa(operadorSecretario.getAtenderVisitas()));
	
	System.out.println(" ");
	
	//PROBANDO TO STRING para las clases objeto
	System.out.println(padreTrabajador.toString());
	System.out.println(operadorJefeDepartamento.toString());
	System.out.println(operadorSecretario.toString());
	System.out.println();
	}

}
