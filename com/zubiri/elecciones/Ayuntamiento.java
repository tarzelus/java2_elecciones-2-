package com.zubiri.elecciones;
import java.util.Scanner;


public class Ayuntamiento {




		private static String Localidad;		
		private static String Alcalde;
		private static String Gobierno;	
		private static int Populacion;
		private static int Censo;
		private static String Cod_postal;
		private static double Extension;

		
	
		
//--------------------localidad--------------------------------	
		public static String getLocalidad()
		{
			return Localidad;
		}
		
		public void  setLocalidad(String localidad1)
		{
			Localidad=localidad1;
		}


//---------------------alcalde-------------------------------

		public static String getAlcalde()
		{
			return Alcalde;
		}
		
		public void  setAlcalde(String alcalde1)
		{
			Alcalde=alcalde1;
		}


//--------------------govierno--------------------------------

		public static String getGobierno()
		{
			return Gobierno;
		}
		
		public void  setGobierno(String gobierno1)
		{
			Gobierno=gobierno1;
		}


	
//---------------------populacion-------------------------------

		public static int getPopulacion()
		{
			return Populacion;
		}
		
		public void  setPopulacion(int populacion1)
		{
			Populacion=populacion1;
		}



//--------------------censo------------------------

		public  static int getCenso()
		{
			return Censo;
		}
		
		public void  setCenso(int censo1)
		{
			Censo=censo1;
		}


//--------------------extension------------------------

		public  static double getExtension()
		{
			return Extension;
		}
		
		public void  setExtension(double extension1)
		{
			Extension=extension1;
		}



//--------------------cod_postal ------------------------

		public static String getCod_postal()
		{
			return Cod_postal;
		}
		
		public void  setCod_postal(String cod_postal1)
		{
			Cod_postal=cod_postal1;
		}

		public static void imprimirAyuntamiento() {
			System.out.print("\n-------------Estos son los datos del Ayuntamiento------------------");	

			System.out.println("\nLocalidad: " + getLocalidad());
			System.out.println("\nAlcalde: " + getAlcalde());
			System.out.println("\nGobierno: " + getGobierno());
			System.out.println("\nCodigo postal: " + getCod_postal());
			System.out.println("\nExtension de los terrenos: " + getExtension());
			System.out.println("\nPopulacion:  " + getPopulacion());
			System.out.println("\nGente censada: " + getCenso());

		;
			
		}

}
