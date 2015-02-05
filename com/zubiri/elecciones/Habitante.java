package com.zubiri.elecciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.lang.*;


public class Habitante {

			
		private String Dni;
		private String Nombre;
		private String Apellido;
		private int Edad;
		
//--------------------DNI--------------------------------	
		



		public String getDni()
		{
			return Dni;
		
		}
		
		public final void  setDni(String DNI1)
		{
			Dni=DNI1;
		}


    //comprobacion del final del DNI sea contenga letra  

		public String correcto () 
		{
			
		
			if(!Dni.endsWith("a-z") || !Dni.endsWith("A-Z")) 
			{	
				
				Dni="\nEl DNI necesita letra";
			 }

		return Dni;
 		}




		
//--------------------nombre--------------------------------

		public String getNombre()
		{
			return Nombre;

			
		}
		
		public void  setNombre(String nombre1)
		{
			Nombre=nombre1;
		}

	
	
//---------------------apellido-------------------------------

		public String getApellido()
		{
			return Apellido;
		}
		
		public void  setApellido(String apellido1)
		{
			Apellido=apellido1;
		}



//--------------------fecha de nacimiento ------------------------

		public int getEdad()
		{
			return Edad;
		}
		
		public void  setEdad(int edad1)
		{
			Edad=edad1;
		}
		
//impresion de los habitantes---------------------------------------------------
		
		public static void imprimir() {
			String nombrefichero2 = "censo.txt";	
			String ruta2 ="/home/zubiri/Proyectosjava/java2_elecciones";
			
			
			//lectura del fichero censo.txt	
			File archivo2 = new File(ruta2, nombrefichero2);
			FileReader leer2=null;
			try {
				leer2 = new FileReader (archivo2);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedReader bf2 = new BufferedReader(leer2);
			

 			//creacion de arraylist para ir metiendo los datos del txt
			ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
		
			String salida2 = null;
			try {
				salida2 = bf2.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				do
				{
					// se le da valor a la variable de salida de tipo string de la linea que lee
					
					//Coje el valor de string que tiene la linea completa y lo divide en diferentes secciones
					String [] cortarString = salida2.split(",");	
				
					//se le da valor a cada Atributo del objeto de tipo habitante
					Habitante habi = new Habitante(); 
					habi.setDni(cortarString[0]);
					habi.setNombre(cortarString[1]);
					habi.setApellido(cortarString[2]);
					habi.setEdad(Integer.parseInt(cortarString[3]));
					//si el habitante introducido es mayor de edad lo añadira al censo
						if (Integer.parseInt(cortarString[3]) >= 18)
						{

							//Despues de darle valor a cada atributo del objeto de tipo habitante todos estos se le asignan
							//   al objeto de arraylist de tipo habitante
							habitantes.add(habi);
						}
				
				
				

							

				} while ((salida2 = bf2.readLine()) != null);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//la condicion del while es que seguira ejecutando siempre que tenga escrita la siguiente linea
     

     		System.out.println("Estos son los datos de los censados: ");

			//imprimira la informacion del arraylist del objeto de habitantes
			for(int t=0; t<habitantes.size(); t++)
        	{
         	   System.out.println("  --------------------------");
            	System.out.println("  |  Dni "+habitantes.get(t).getDni() );
           	 	System.out.println("  |  nombre:: "+habitantes.get(t).getNombre());
            	System.out.println("  |  Apellido: "+ habitantes.get(t).getApellido());
            	System.out.println("  |  Edad: "+ habitantes.get(t).getEdad());
       		 }	
			
	    }
	}

