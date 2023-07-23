package poo;

import javax.swing.JOptionPane;

public class UsoCarro {

	public static void main(String[] args) {
		
		Carro twingo = new Carro();
		
		twingo.eColor(JOptionPane.showInputDialog("Ingresa el color del carro"));
		
		//System.out.println(twingo.dColor());
		
		twingo.eCalefactor(JOptionPane.showInputDialog("¿Tiene calefaccion?"));
		
		//System.out.println(twingo.dCalefactor());
		
		twingo.eEstado(JOptionPane.showInputDialog("¿El carro es nuevo?"));
		
		//System.out.println(twingo.dEstado());
		
		System.out.println(twingo.dDatos());
	}

	
}
