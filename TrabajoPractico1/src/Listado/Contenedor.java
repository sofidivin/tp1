package Listado;
import Datos.Autopartes;
public class Contenedor extends Autopartes{

		
		//Metodos
		public void Devolver(String nombreProducto) {
//			super.Autopartes(getId_parte());
			System.out.println("El Producto Devuelto es: " +nombreProducto+ "\n su Id es: "+getId_parte() 
					+ "\nY su Categoria es: "+getCategoria());
	
		}
		public void Despachar(String nombreProducto) {
//			super.Autopartes(getId_parte());
			System.out.println("El Producto ha sido Despachado: " +nombreProducto+ "\n su Id es: "+getId_parte() 
					+ "\nY su Categoria es: "+getCategoria());
	
		}
}
