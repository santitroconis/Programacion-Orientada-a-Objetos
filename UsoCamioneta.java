package poo;

import javax.swing.JOptionPane;

public class UsoCamioneta {

	public static void main(String[] args) {
		
		Camioneta tucson = new Camioneta();
		
		tucson.eColor(JOptionPane.showInputDialog("Color del Vehiculo:"));
		
		tucson.eVidrios(JOptionPane.showInputDialog("¿Tiene vidrios ahumados?"));
		
		tucson.ePantalla(JOptionPane.showInputDialog("¿Tiene pantalla inteligente?"));
		
		tucson.eCajon(JOptionPane.showInputDialog("¿Tiene cajon abierto?"));
		
		System.out.println(tucson.datos());

	}

}
