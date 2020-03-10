package agendaTelefonica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {

		
		agenda agenditAgenda=new agenda();
		Contacto contacto1=new Contacto();
		Contacto contacto2=new Contacto();
		Contacto contacto3=new Contacto();
		
		contacto1.setNombre("deivi");
		contacto1.setNumero("22222");
		

		contacto2.setNombre("carlos");
		contacto2.setNumero("00000");


		contacto3.setNombre("juan");
		contacto3.setNumero("33333");
		
		
		agenditAgenda.ingresarContacto(contacto1);
		agenditAgenda.ingresarContacto(contacto2);
		agenditAgenda.ingresarContacto(contacto3);
		agenditAgenda.listarContactos();
		agenditAgenda.buscarContacto("deivi");
		System.out.println("disponibles: "+ agenditAgenda.disponible());
	}

}
