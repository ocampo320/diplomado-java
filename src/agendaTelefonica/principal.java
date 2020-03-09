package agendaTelefonica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {

		String nombreContacto = "";
		String telefonoContacto = "";
		Scanner datosIngrear = new Scanner(System.in);
//		
//		JOptionPane.showInputDialog("Ingrese el Nombre del contacto");
//		nombreContacto=datosIngrear.nextLine();		
//		
//		JOptionPane.showInputDialog("Ingrese el numero del contacto");
//		telefonoContacto=datosIngrear.nextLine();	

		agenda agenda1 = new agenda("deivi", "2220718");
		agenda1.ingresarContacto(agenda1);

		System.out.println(agenda1.mostrar());

	}

}
