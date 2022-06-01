package cl.generation;

import java.util.List;

public class modeloCliente {
	private Integer id; // identificador
	private List<Integer> numerosVenta;
	private String nombre;
	private String correo;
	private String direccion;
	private String contrasena;

	

	public modeloCliente() {
		
	}

	public modeloCliente(Integer id, List<Integer> numerosVenta, String nombre, String correo, String direccion, String contrasena) {
		super();
		this.id = id;
		this.numerosVenta = numerosVenta;
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
		this.contrasena = contrasena;

	}

	public List<Integer> getNumerosVenta() {
		return numerosVenta;
	}

	public void setNumerosVenta(List<Integer> numerosVenta) {
		this.numerosVenta = numerosVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId(){
		return id;
	}

	@Override //SOBRECARGA -sobrescribir
	public String toString() {
		return "modeloCliente [id=" + id + ", numerosVenta=" + numerosVenta + ", nombre=" + nombre + ", correo="
				+ correo + ", direccion=" + direccion + ", contraseña=" + contrasena + "]";
	}

}
