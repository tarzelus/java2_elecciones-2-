package com.zubiri.elecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;



public class Partido {



		private String Nombre;		
		private String Lider;		
		private String Ideologia;
		private int Cant_militantes;	
		private int Previas_elecciones;


//--------------------nombre---------------------------------

		public String getNombre()
		{
			return Nombre;
		}
		
		public void  setNombre(String nombre1)
		{
			Nombre=nombre1;
		}



		
	
		
//--------------------lider--------------------------------

		public String getLider()
		{
			return Lider;
		}
		
		public void  setLider(String lider1)
		{
			Lider=lider1;
		}


//---------------------ideologia-------------------------------

		public String getIdeologia()
		{
			return Ideologia;
		}
		
		public void  setIdeologia(String ideologia1)
		{
			Ideologia=ideologia1;
		}


//--------------------cant_militantes--------------------------------

		public int getCant_militantes()
		{
			return Cant_militantes;
		}
		
		public void  setCant_militantes(int cant_militantes1)
		{
			Cant_militantes=cant_militantes1;
		}


//---------------------previas_votaciones-------------------------------

		public int getPrevias_elecciones()
		{
			return Previas_elecciones;
		}
		
		public void  setPrevias_elecciones(int previas_elecciones1)
		{
			Previas_elecciones=previas_elecciones1;
		}

		public static void imprimirPartido() throws IOException {
			System.out.print("\n----------------------------Lista de partidos-----------------------------------\n");
			


			String nombrefichero3 = "listadosPartidos.txt";
			String ruta3 ="/home/zubiri/Proyectosjava/java2_elecciones";
			ArrayList<Partido> partidos = new ArrayList<Partido>();


			int i = 0;

			
			//lectura del fichero	
			File archivo3 = new File(ruta3, nombrefichero3);
			FileReader leer3 = new FileReader (archivo3);
			BufferedReader bf3 = new BufferedReader(leer3);
			String salida3 = bf3.readLine();
 

			


			do
			{
				// se le da valor a la variable de salida de tipo string de la linea que lee
				
				//Coje el valor de string que tiene la linea completa y lo divide en diferentes secciones
				String [] cortarString = salida3.split(",");	
			
				//se le da valor a cada tributo del partido
				Partido part = new Partido(); 
				part.setNombre(cortarString[0]);
				part.setLider(cortarString[1]);
				part.setIdeologia(cortarString[2]);
				part.setCant_militantes(Integer.parseInt(cortarString[3]));
				part.setPrevias_elecciones(Integer.parseInt(cortarString[4]));
			
				//el valor que se le ha dado a cada atributo se lo pasa al objeto de tipo arraylist de partido
				partidos.add(part);

						

			} while ((salida3 = bf3.readLine()) != null);

     
			System.out.println("--estos son los partidos politicos que hay disponibles ");

			for(int d=0; d<partidos.size(); d++)
        	{
            	System.out.println("  ---------------------------------\n");
            		System.out.println(" nombre: "+partidos.get(d).getNombre() );
            		System.out.println(" \nlider: "+partidos.get(d).getLider());
            		System.out.println(" \nideologia: "+ partidos.get(d).getIdeologia());
            		System.out.println(" \nCantidad de militantes: "+ partidos.get(d).getCant_militantes());
            		System.out.println(" \nCantidad de militantes: "+ partidos.get(d).getPrevias_elecciones());
        	}
        	//vaciar el arraylist de tipo poartidos	
			partidos.clear();
			
		}



	
}
