package com.zubiri.elecciones;
import java.util.Scanner;


public class Ayuntamiento extends EspacioPublico{




		
		private static String Alcalde;
		private static String Gobierno;	
		private static int Populacion;
		private static int Censo;
		private static String Cod_postal;
		private static double Extension;

		
	
		


//---------------------alcalde-------------------------------

		public static String getAlcalde()
		{
			return Alcalde;
		}
		
		public static void  setAlcalde(String alcalde1)
		{
			Alcalde=alcalde1;
		}


//--------------------govierno--------------------------------

		public static String getGobierno()
		{
			return Gobierno;
		}
		
		public static void  setGobierno(String gobierno1)
		{
			Gobierno=gobierno1;
		}


	
//---------------------populacion-------------------------------

		public static int getPopulacion()
		{
			return Populacion;
		}
		
		public static void  setPopulacion(int populacion1)
		{
			Populacion=populacion1;
		}



//--------------------censo------------------------

		public  static int getCenso()
		{
			return Censo;
		}
		
		public static void  setCenso(int censo1)
		{
			Censo=censo1;
		}


//--------------------extension------------------------

		public  static double getExtension()
		{
			return Extension;
		}
		
		public static void  setExtension(double extension1)
		{
			Extension=extension1;
		}



//--------------------cod_postal ------------------------

		public static String getCod_postal()
		{
			return Cod_postal;
		}
		
		public static void  setCod_postal(String cod_postal1)
		{
			Cod_postal=cod_postal1;
		}

		
		
		public static void escribirAyuntamiento(){
			Scanner sc = new Scanner(System.in);

			String localidada,alcalde,gobierno,cod_postala;		
 			int populacion,censo;
			double extension;
		 
			Ayuntamiento ayuntamiento = new Ayuntamiento();

			System.out.print("\n-------------Ayuntamiento------------------");

	
			System.out.print("\ningresa el nombre del alcalde: ");
			alcalde = sc.next();
			setAlcalde(alcalde);

			System.out.print("\ningresa el partido del alcalde: ");
			gobierno = sc.next();
			setGobierno(gobierno);

			System.out.print("\ningresa el codigo postal que abarcarca el ayuntamiento: ");
			cod_postala = sc.next();
			setCod_postal(cod_postala);

			System.out.print("\nIngresa la extensio de los terrenos del ayuntamientos: ");
			extension = sc.nextDouble();
			setExtension(extension);

			System.out.print("\ningresa la populacion de la ciudad:  ");
			populacion = sc.nextInt();
			setPopulacion(populacion);

			System.out.print("\ningresa la censo de la ciudad:  ");
			censo = sc.nextInt();
			setCenso(censo);
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
