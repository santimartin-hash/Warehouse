package Clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Factura {
	
	public static int IVA = 21;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	private ArrayList<LineaFactura> lineas = new ArrayList<LineaFactura>();
	
	public void addLinea(LineaFactura linea) {
		lineas.add(linea);
	}
	public void eliminarlinea(LineaFactura linea) {
		//TODO pedir numero de linea a borrar
		lineas.remove(linea);
	}
	public  double  preciototal() {
		double total = 0;
		for(int i = 0; i<lineas.size(); i++) {
			total = total + lineas.get(i).preciototal();
		}
		return total;
		
	}
	public void mostrarEnPantalla() {
		
		System.out.println("Numero factura: " + this.numero + "\t\t" + this.nombreEmpresa);
		System.out.println("Fecha: " + new SimpleDateFormat("dd/MM/yyyy").format(this.fecha));
		System.out.println(this.concepto);
		
		System.out.println("num\tart.\tprecio\tcant.\ttotal");
		System.out.println("---\t----\t------\t-----\t-----");
		for (LineaFactura lineaFactura : this.lineas) {
			lineaFactura.mostrarEnPantalla();
		}
		
		System.out.println("\t\t\t---Total: " + this.preciototal());
		
		
	}
	public void guardarEnFichero () {
		//TODO guardar la Factura en fichero
	}
}
