package Datos;

import javax.swing.JOptionPane;

public class Autopartes {
	private int id_parte;
	private String nombreProducto;
	private String categoria;
	
	
	public int getId_parte() {
		return id_parte;
	}
	public void setId_parte(int id_parte) {
		this.id_parte = id_parte;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void Bienvenido() {
		JOptionPane.showMessageDialog(null, "Bienvenido a Nuestro Logistica De AutoPartes");
	}
	
}
