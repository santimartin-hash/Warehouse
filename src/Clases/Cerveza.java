package Clases;

public class Cerveza extends Articulo implements Alcoholico {
private String origen;
private String Cereales;
private double gradosAlchol;

public String getOrigen() {
	return origen;
}
public void setOrigen(String origen) {
	this.origen = origen;
}
public String getCereales() {
	return Cereales;
}
public void setCereales(String cereales) {
	Cereales = cereales;
}
public double getGradosAlchol() {
	return gradosAlchol;
}
public void setGradosAlchol(double gradosAlchol) {
	this.gradosAlchol = gradosAlchol;
}
@Override
public boolean esFuerte() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public double calcularTasa() {
	// TODO Auto-generated method stub
	return 0;
}

}

