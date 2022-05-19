package Interface;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

import Datos.Autopartes;
import Datos.Persona;
import Listado.Almacen;
import Listado.Contenedor;

public class Interfaz {

	public static void main(String[] args) {
		Autopartes autopartes = new Autopartes();
		Almacen almacen = new Almacen();
		Contenedor contenedor = new Contenedor();
		Persona persona = new Persona();
		
		 autopartes.Bienvenido();
		 
		 String nombre= JOptionPane.showInputDialog("Ingresar Tu Nombre");
		 
		 persona.Persona(nombre, "Ba", 123);
		 
		 
		 String ingresarProducto1=JOptionPane.showInputDialog("Ingresar Un Producto"
		 		+ "\n1- Ventanilla"
		 		+ "\n2- Motor"
		 		+ "\n3- Asientos");
//		 String pregunta=JOptionPane.showInputDialog("Deseas Ingresar Otro Producto mas");
//		 if (pregunta=="Si") {
//			 String ingresarProducto2=JOptionPane.showInputDialog("Ingresar Un Producto"
//				 	+ "\n1- Ventanilla"
//				 	+ "\n2- Motor"
//				 	+ "\n3- Asientos");
//		} 
		 
		
		 ArrayList<String> nombreProductos = new ArrayList<>(); 
		 nombreProductos.add("Puerta");
		 nombreProductos.add("Rueda");
		 nombreProductos.add("Espejo");
		 nombreProductos.add("Techo");
		 nombreProductos.add("Parilla");
		 nombreProductos.add(ingresarProducto1);
//		 nombreProductos.add(ingresarProducto2);
		 
		
		 
		 
		 System.out.println("Todo los Productos en total son: "+nombreProductos.size());
		 
		 System.out.println("Todo los Nombres de los Productos que tenemos son:");
		 for (int i = 0; i <nombreProductos.size(); i++) {
			 System.out.print("Nombre Producto: "+nombreProductos.get(i)+"\n");
		}
		
		 if (ingresarProducto1!=null) {
				System.out.println("El producto ingresado es: "+ingresarProducto1+" \nY Persona que ingreso el Producto es: "+nombre);
			}

//		String nombreProducto = JOptionPane.showInputDialog("Agregar Producto");
//		almacen.AgregarProducto(nombreProducto);
//		
//		String nombreProducto1 = JOptionPane.showInputDialog("Quitar Producto");
//		almacen.QuitarProducto(nombreProducto);
//		
//		contenedor.Devolver(nombreProducto);
//		contenedor.Despachar(nombreProducto);
	}

}
