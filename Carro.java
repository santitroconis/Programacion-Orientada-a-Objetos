package poo;

public class Carro {

	private int nro_puertas;
	private double largo;
	private double ancho;
	private int peso;
	
	private String color;
	private String estado;
	private String calefactor;
	
	public Carro() {
		nro_puertas = 4;
		largo = 4.5;
		ancho = 1.70;
		peso = 900;
	}
	
	//GETTERS
	
	public String dDatos() {
		return "El vehiculo es "+nro_puertas +" puertas, mide " +largo +" metros de largo y " +ancho +" metros de ancho, con un peso de " +peso +"Kg, " +calefactor 
				+", viene de color " +color +" y " +estado;
	}
	
	//SETTERS
	
	public void eColor(String dColor) {
		color= dColor;
	}
	
	public void eEstado(String dEstado) {
		if(dEstado.equalsIgnoreCase("si"))
		{estado = "es de concesionario" ;} 
		else { estado = "es de segunda mano";}
	}
	public void eCalefactor(String calefaccion) {
		if(calefaccion.equalsIgnoreCase("si")) 
		{calefactor = "tiene calefaccion";} 
		else { calefactor = "no tiene calefaccion";}
	}
}







// CONECTION, EXECUTEQUERY, RESURSET, WHILE
// BLOQUE TRYCATCH