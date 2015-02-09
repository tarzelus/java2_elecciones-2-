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

			Habitante.escribirHabitante();

       	 // *****impresion de los habitatnes****
			Habitante.imprimirHabitante();
		}
		break;

			//-------------------------------------------Inmueble------------------------------------------------	

 		case 'i':
		{

			Inmueble.escribirInmueble();

			//****Impresion del inmueble****
			Inmueble.imprimirInmueble();

		}
		break;

		//-------------------------------------------Espacio Publico------------------------------------------------

 		case 'e':
		{

			EspacioPublico.escribirEspacio();

			//****impresion de espacio publilco*****

			EspacioPublico.imprimirEspacio();

		
		}
		break;

		//-----------------------------------------Ayuntamiento---------------------------------------------
		
		case 'a':
		{

			//escribir ayuntamiento 
			
			Ayuntamiento.escribirAyuntamiento();

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