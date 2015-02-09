package com.zubiri.elecciones;
import java.util.Scanner;


public abstract class EspacioPublico {




		
		private static String Direccion;
		private static String Tipo;
		private static String Localidad;
	
		
//--------------------direccion---------------------------------	
		public static String getDireccion()
		{
			return Direccion;
		}
		
		public static void  setDireccion(String direccion1)
		{
			Direccion = direccion1;
		}


//--------------------tipo--------------------------------

		public static String getTipo()
		{
			return Tipo;
		}
		
		public static void  setTipo(String tipo1)
		{
			Tipo=tipo1;
		}


//---------------------localidad-------------------------------

		public static String getLocalidad()
		{
			return Localidad;
		}
		
		public static void  setLocalidad(String localidad1)
		{
	 		Localidad = localidad1;
		}

		
		public static void escribirEspacio(){
			String direccione, tipo, localidade;

			Scanner sc = new Scanner(System.in);

					
			System.out.print("\n-------------Espacio publico------------------");

			System.out.print("\ningresa el tipo de espacio publico ");
			tipo = sc.next();
			setTipo(tipo);

	
			System.out.print("\ningresa la localidad del espacio publico: ");
			localidade = sc.next();
			setLocalidad(localidade);	
	
			System.out.print("\ningresa la direccion del espacio publico ");
			direccione = sc.next();
			setDireccion(direccione);
		}
		
		public static void imprimirEspacio() {
			System.out.print("\n-------------Estos son los datos del espacio publico------------------");	
			System.out.println("\nEste es el tipo de espacio publico que es: " + getTipo());
			System.out.println("\nLocalidad del espacio publico: " + getLocalidad());
			System.out.println("\nLa direccion del espacio publico: " + getDireccion());
			
		}
		

		

	

	
}
