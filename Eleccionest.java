import com.zubiri.elecciones.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;




public class Eleccionest {

	public static void main (String args[]) throws IOException{

		Scanner sc = new Scanner(System.in);

		System.out.print("\nh) habitantes");
		System.out.print("\ni) inmueble");
		System.out.print("\ne) espaciopublico");
		System.out.print("\na) ayuntamiento");
		System.out.print("\np) partidos");

		System.out.print("\nQue quieres hacer?");
				String hacer = sc.next();
				char caracter = hacer.charAt(0);

		switch (caracter)
       	{
		//-------------------------------------------habitante------------------------------------------------
		
 		 case 'h':
		{

			String DNI, nombre, apellido, denuevo;
			int edad;
		
			Habitante habitante = new Habitante();

			System.out.print("\n-------------introduce los datos del habitante------------------");	

			//*******************herramientas para escribir en el fichero****************************
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
						habitante.setDni(DNI);
					} while (DNI.length() >9 || DNI.length() < 9);
			
					bw.write(DNI + ",");

					System.out.print("\ningresa el Nombre del habitante: ");
					nombre = sc.next();
					habitante.setNombre(nombre);
					bw.write(nombre + ",");
			
					System.out.print("\ningresa el apellido del hahbitante: ");
					apellido = sc.next();
					habitante.setApellido(apellido);
					bw.write(apellido + ",");

					System.out.print("\ningresa la edad del habitante: ");
					edad = sc.nextInt();
					habitante.setEdad(edad);
					bw.write(edad + "\n");

					bw.close();
					System.out.print("\nquieres insertar otro habitante? (si/no)");
					denuevo = sc.next();
		

				}while (denuevo.equalsIgnoreCase("si"));

		

			
        		}
			catch (FileNotFoundException e) 
			{
           			 System.out.println(e.getMessage());
       	 	}


		
       	 // *****impresion de los habitatnes****
			Habitante.imprimirHabitante();
		}
		break;

			//-------------------------------------------Inmueble------------------------------------------------	

 		case 'i':
		{


			String direccion, provincia, localidad, fecha_construc;
			int cod_postal;

			Inmueble inmueble = new Inmueble();

			System.out.print("\n-------------Datos del inmueble------------------");	


			System.out.print("\ningresa la dirección del inmueble: ");
			direccion = sc.next();
			inmueble.setDireccion(direccion);

			System.out.print("\ningresa el nombre de la provivncia del inmueble: ");
			provincia = sc.next();
			inmueble.setProvincia(provincia);

			System.out.print("\ningresa la localidad del inmueble: ");
			localidad = sc.next();
			inmueble.setLocalidad(localidad);

			System.out.print("\nIngresa el  codigo postal del inmueble:  ");
			cod_postal = sc.nextInt();
			inmueble.setCod_postal(cod_postal);

			System.out.print("\nIngresa la fecha de construccion del inmueble ");
			fecha_construc = sc.next();
			inmueble.setFecha_construc(fecha_construc);


			//****Impresion del inmueble****
			Inmueble.imprimirInmueble();

		}
		break;

		//-------------------------------------------Espacio Publico------------------------------------------------

 		case 'e':
		{



			String direccione, tipo, localidade;

			EspacioPublico espaciopublico = new EspacioPublico();
		
			System.out.print("\n-------------Espacio publico------------------");

			System.out.print("\ningresa el tipo de espacio publico ");
			tipo = sc.next();
			espaciopublico.setTipo(tipo);

	
			System.out.print("\ningresa la localidad del espacio publico: ");
			localidade = sc.next();
			espaciopublico.setLocalidad(localidade);	
	
			System.out.print("\ningresa la direccion del espacio publico ");
			direccione = sc.next();
			espaciopublico.setDireccion(direccione);

			//****impresion de espacio publilco*****

			EspacioPublico.imprimirEspacio();

		
		}
		break;

		//-----------------------------------------Ayuntamiento---------------------------------------------
		
		case 'a':
		{

 			String localidada,alcalde,gobierno,cod_postala;		
 			int populacion,censo;
			double extension;
		 
			Ayuntamiento ayuntamiento = new Ayuntamiento();

			System.out.print("\n-------------Ayuntamiento------------------");

			System.out.print("\ningresa la localidad del ayuntamiento: ");
			localidada = sc.next();
			ayuntamiento.setLocalidad(localidada);	
	
			System.out.print("\ningresa el nombre del alcalde: ");
			alcalde = sc.next();
			ayuntamiento.setAlcalde(alcalde);

			System.out.print("\ningresa el partido del alcalde: ");
			gobierno = sc.next();
			ayuntamiento.setGobierno(gobierno);

			System.out.print("\ningresa el codigo postal que abarcarca el ayuntamiento: ");
			cod_postala = sc.next();
			ayuntamiento.setCod_postal(cod_postala);

			System.out.print("\nIngresa la extensio de los terrenos del ayuntamientos: ");
			extension = sc.nextDouble();
			ayuntamiento.setExtension(extension);

			System.out.print("\ningresa la populacion de la ciudad:  ");
			populacion = sc.nextInt();
			ayuntamiento.setPopulacion(populacion);

			System.out.print("\ningresa la censo de la ciudad:  ");
			censo = sc.nextInt();
			ayuntamiento.setCenso(censo);

			//impreion de los datos de ayuntamiento mediante la clase de ayuntamiento

			Ayuntamiento.imprimirAyuntamiento();


		}
		break;
		//-----------------------------------------partidos---------------------------------------------

		case 'p':
		{
			//impresion de partidos mediante la clase Partidos
			Partido.imprimirPartido();

        }
        break;
        //cerrando ek switch
		}
	}

}