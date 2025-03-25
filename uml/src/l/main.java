package l;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		   Hospital hospital = new Hospital("Hospital Central", "Calle Principal 123");
	        Medico medico = new Medico(hospital.getNombre(), hospital.getDireccion(), "Dr. Pérez", "12345", "Cardiología");
	        Paciente paciente = new Paciente(hospital.getNombre(), hospital.getDireccion(), "Juan Pérez", "HC001", "Av. Siempre Viva 742");
	        ConsultaMedica consulta = new ConsultaMedica(hospital.getNombre(), hospital.getDireccion(), new Date(), "Gripe", "Reposo y líquidos");
	        
	        System.out.println("Información del hospital:");
	        System.out.println("Nombre: " + hospital.getNombre());
	        System.out.println("Dirección: " + hospital.getDireccion());
	        System.out.println();
	        
	        System.out.println("Médico:");
	        System.out.println("Nombre: " + medico.getNombre());
	        System.out.println("Especialidad: " + medico.getEspecialidad());
	        System.out.println();
	        
	        System.out.println("Paciente:");
	        System.out.println("Nombre: " + paciente.getNombre());
	        System.out.println("Número de Historia Clínica: " + paciente.getNumeroHistoriaClinica());
	        System.out.println();
	        
	        System.out.println("Consulta Médica:");
	        System.out.println("Fecha: " + consulta.getFecha());
	        System.out.println("Diagnóstico: " + consulta.getDiagnostico());
	}

}
