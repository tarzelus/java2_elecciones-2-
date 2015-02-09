package com.zubiri.elecciones;

import java.util.Scanner;

public class Inmueble {

		private static String Direccion;
		private static String Provincia;
		private static String Localidad;
		private static int Cod_postal;
		private static String Fecha_construc;
		
//--------------------direccion---------------------------------	
		public static String getDireccion()
		{
			return Direccion;
		}
		
		public static void  setDireccion(String direccion1)
		{
			Direccion = direccion1;
		}



//--------------------provincia--------------------------------

		public static String getProvincia()
		{
			return Provincia;
		}
		
		public static void  setProvincia(String provincia1)
		{
			Provincia = provincia1;
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



//--------------------cod_postal ------------------------

		public static int getCod_postal()
		{
			return Cod_postal;
		}
		
		public static void  setCod_postal(int cod_postal1)
		{
			Cod_postal = cod_postal1;
		}



//--------------------fecha de construccion ------------------------

		public static String getFecha_construc()
		{
			return Fecha_construc;
		}
		
		public static void  setFecha_construc(String fecha_construc1)
		{
			Fecha_construc = fecha_construc1;
		}
		
		
		
//*******************************para escribit e imprimir los inmuebles*****************************************		


		public static void escribirInmueble(){
			String direccion, provincia, localidad, fecha_construc;
			int cod_postal;
			Scanner sc = new Scanner(System.in);

			System.out.print("\n-------------Datos del inmueble------------------");	


			System.out.print("\ningresa la dirección del inmueble: ");
			direccion = sc.next();
			setDireccion(direccion);

			System.out.print("\ningresa el nombre de la provivncia del inmueble: ");
			provincia = sc.next();
			setProvincia(provincia);

			System.out.print("\ningresa la localidad del inmueble: ");
			localidad = sc.next();
			setLocalidad(localidad);

			System.out.print("\nIngresa el  codigo postal del inmueble:  ");
			cod_postal = sc.nextInt();
			setCod_postal(cod_postal);

			System.out.print("\nIngresa la fecha de construccion del inmueble ");
			fecha_construc = sc.next();
			setFecha_construc(fecha_construc);
		}
		
		public static  void imprimirInmueble() {
			System.out.print("\n-------------Estos son los datos del inmueble------------------");	

			System.out.println("\nLa direccion del inmueble: " + getDireccion());
			System.out.println("\nProvincia del inmueble : " + getProvincia());
			System.out.println("\nLocalidad del inmueble: " + getLocalidad());
			System.out.println("\nCódigo postal del inmueble: " + getCod_postal());
			System.out.println("\nFecha de construcción del inmueble: " + getFecha_construc());
	    }


	
}
