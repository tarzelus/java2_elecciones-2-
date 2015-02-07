package com.zubiri.elecciones;
import java.util.Scanner;


public class EspacioPublico {




		
		private static String Direccion;
		private static String Tipo;
		private static String Localidad;
	
		
//--------------------direccion---------------------------------	
		public static String getDireccion()
		{
			return Direccion;
		}
		
		public void  setDireccion(String direccion1)
		{
			Direccion = direccion1;
		}


//--------------------tipo--------------------------------

		public static String getTipo()
		{
			return Tipo;
		}
		
		public void  setTipo(String tipo1)
		{
			Tipo=tipo1;
		}


//---------------------localidad-------------------------------

		public static String getLocalidad()
		{
			return Localidad;
		}
		
		public void  setLocalidad(String localidad1)
		{
	 		Localidad = localidad1;
		}

		
		public static void imprimirEspacio() {
			System.out.print("\n-------------Estos son los datos del espacio publico------------------");	
			System.out.println("\nEste es el tipo de espacio publico que es: " + getTipo());
			System.out.println("\nLocalidad del espacio publico: " + getLocalidad());
			System.out.println("\nLa direccion del espacio publico: " + getDireccion());
			
		}
		

		

	

	
}
