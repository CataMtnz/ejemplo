package cl.generation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		modeloCliente cliente = new modeloCliente();
		
		cliente.getCorreo();
		/*lista del tipo objeto <modelo cliente> le asignas la variable lista cliente*/
		List<modeloCliente> listaCliente = new ArrayList<>();
		List<Integer> numerosVenta = new ArrayList<>();

		numerosVenta.add(2);
		numerosVenta.add(42);
		numerosVenta.add(202);
		/* get devuelve el dato a poner
		 * set imprime la creacion de la variable VOID System.out.println(cliente.setCorreo("michi@uwu.cl"));
		 * */
		
		//PRIMERO
		cliente.setNombre("El michi");
		cliente.setCorreo("@");
		cliente.setContrasena("dadasd");
		cliente.setDireccion("hollow");
		cliente.setId(123);
		cliente.setNumerosVenta(numerosVenta);
		
		//GET PARA IMPRIMIR DECORAR!
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getCorreo());
		System.out.println(cliente.getContrasena());
		System.out.println(cliente.getDireccion());
		System.out.println(cliente.getId());
		System.out.println(cliente.getNumerosVenta());
		
		System.out.println(cliente); //YA ESTA HECHA LA SOBRECARGA Override
		System.out.println(cliente.toString());
		
		
	}
	
	
}


