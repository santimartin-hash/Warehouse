package Clases;

public class LineaFactura {
	private int numero;
	private Articulo articulo; 
	private int cantidad;
	private double precio;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public  double  preciototal() {
		double res = 0;
		res = cantidad * precio;
		return res;
		
	}
	public void mostrarEnPantalla() {
		System.out.println(
				this.numero+ "\t" + 	
				this.articulo + "\t" + 
				this.precio + "\t" +
				this.cantidad + "\t" +
				this.preciototal()
				);
	}
}

