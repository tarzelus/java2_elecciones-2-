package com.zubiri.elecciones;

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
		
		public void  setDireccion(String direccion1)
		{
			Direccion = direccion1;
		}



//--------------------provincia--------------------------------

		public static String getProvincia()
		{
			return Provincia;
		}
		
		public void  setProvincia(String provincia1)
		{
			Provincia = provincia1;
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



//--------------------cod_postal ------------------------

		public static int getCod_postal()
		{
			return Cod_postal;
		}
		
		public void  setCod_postal(int cod_postal1)
		{
			Cod_postal = cod_postal1;
		}



//--------------------fecha de construccion ------------------------

		public static String getFecha_construc()
		{
			return Fecha_construc;
		}
		
		public void  setFecha_construc(String fecha_construc1)
		{
			Fecha_construc = fecha_construc1;
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
