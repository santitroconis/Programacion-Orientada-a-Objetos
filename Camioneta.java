package poo;

public class Camioneta {
	
	private int nro_puertas;
	private double largo;
	private double ancho;
	private String motor;
	private int peso;
	
	private String color;
	private String vidrios;
	private String pantalla;
	private String cajon;
	
	public Camioneta() {
		nro_puertas = 4;
		largo = 6.5;
		ancho = 2.20;
		motor = "V8";
		peso = 1500;
	}
	
	//GETTERS
	public String datos() {
		return "La camioneta tiene las siguientes caracteristicas:\n -" +color
				+"\n -"+vidrios +"\n -"+pantalla +"\n -"+cajon +"\n"
				+ "\nInformacion general: Motor "+motor +", "+nro_puertas +" puertas,"
				+ " mide " +largo +" metros de largo y " +ancho +" metros de ancho,"
				+ " con un peso de " +peso +"Kg";
	}
	
	//SETTERS
	public void eColor(String color) {
		this.color = color;
	}
	
	public void eVidrios(String vidrios) {
		if(vidrios.equalsIgnoreCase("si")) 
		{ this.vidrios = "Vidrios ahumados"; } 
		else 
		{ this.vidrios = "Vidrios claros"; }
	}
	
	public void ePantalla(String pantalla) {
		if(pantalla.equalsIgnoreCase("si"))
		{ 
			this.pantalla = "Pantalla inteligente"; 
			peso = peso + 10;
		}
		else
		{ this.pantalla = "Reproductor tradicional"; }
	}
	
	public void eCajon(String cajon) {
		if(cajon.equalsIgnoreCase("si"))
		{ 
			this.cajon = "Tiene cajon"; 
			peso = peso - 100;
		}
		else
		{ this.cajon = "Tiene maletero"; }
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
