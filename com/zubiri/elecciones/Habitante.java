package com.zubiri.elecciones;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.lang.*;


public class Habitante {

			
		private static String Dni;
		private static String Nombre;
		private static String Apellido;
		private static int Edad;
		
//--------------------DNI---------------------------------	
		



		public String getDni()
		{
			return Dni;
		
		}
		
		public final static void  setDni(String DNI1)
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
		
		public static void  setNombre(String nombre1)
		{
			Nombre=nombre1;
		}

	
	
//---------------------apellido-------------------------------

		public String getApellido()
		{
			return Apellido;
		}
		
		public static void  setApellido(String apellido1)
		{
			Apellido=apellido1;
		}



//--------------------fecha de nacimiento ------------------------

		public int getEdad()
		{
			return Edad;
		}
		
		public static void  setEdad(int edad1)
		{
			Edad=edad1;
		}
		

		
//escritura de habitantes*******************************************************
		static String DNI;
		static String nombre;
		static String apellido;
		static String denuevo;
		static int edad;

		//System.out.print("\n-------------introduce los datos del habitante------------------");	

		//*******************herramientas para escribir en el fichero****************************
		public static void escribirHabitante() throws IOException{
			Scanner sc = new Scanner(System.in);

		try 
		{
			
			String ruta = "/home/zubiri/Proyectosjava/java2_elecciones/censo.txt";

			FileWriter fw = new FileWriter(ruta , true);
			BufferedWriter bw = new BufferedWriter(fw);
	
		


	

			//pregunta por primera vez para escribir el nombre del habitante y pregunta para agregar un nombre mas a la lista
			do{
	
			//comprueba que el DNI inglresado tiene el numero de caracteres que tiene que tener un DNI		
				do{
					System.out.print("\ningresa el numero del DNI con letra (8 numeros y 1 letra): ");
					DNI = sc.next();
					setDni(DNI);
				} while (DNI.length() >9 || DNI.length() < 9);
		
				bw.write(DNI + ",");

				System.out.print("\ningresa el Nombre del habitante: ");
				nombre = sc.next();
				setNombre(nombre);
				bw.write(nombre + ",");
		
				System.out.print("\ningresa el apellido del hahbitante: ");
				apellido = sc.next();
				setApellido(apellido);
				bw.write(apellido + ",");

				System.out.print("\ningresa la edad del habitante: ");
				edad = sc.nextInt();
				setEdad(edad);
				bw.write(edad + "\n");

				
				System.out.print("\nquieres insertar otro habitante? (si/no)");
				denuevo = sc.next();
	

			}while (denuevo.equalsIgnoreCase("si"));
			bw.close();
	

		
    		}
		catch (FileNotFoundException e) 
		{
       			 System.out.println(e.getMessage());
   	 	}
}
		
//impresion de los habitantes---------------------------------------------------
		
		public static void imprimirHabitante() throws NumberFormatException, IOException {
			String nombrefichero2 = "censo.txt";	
			String ruta2 ="/home/zubiri/Proyectosjava/java2_elecciones";
			
			
			//lectura del fichero censo.txt	
			File archivo2 = new File(ruta2, nombrefichero2);
			FileReader leer2 = new FileReader (archivo2);
			BufferedReader bf2 = new BufferedReader(leer2);
			

 			//creacion de arraylist para ir metiendo los datos del txt
			ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
		
			String salida2 = bf2.readLine();

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

