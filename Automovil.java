/*
FECHA: 15/AGOSTO/2018
OBJETIVO: CONOCER LA DIFERENCIA ENTRE CLASE Y OBJETO
AUTOR: FERNANDO ALEXIS DOMINGUEZ CONTRERAS 201756566
*/

import java.io.*; //para entradas y salidos
import java.util.Scanner; //paquete que se usa para leer los datos primitivos
public class Automovil {
	//variables de instancia(atributos que definen al objeto)
	String Modelo;
	String color;
	int NumPasajeros;
	String Marca;
	int Year;//ano
	/***********/
	//variables de clase
	static int num=0; //para contar la cantidad de objetos que son instanciados (no se coloca en el UML)
	/*****************/
	//CONTRUCTOR LLEVA EL NOMBRE DE LA CLASE  Y ES CONSIDERADO UN METODO
	public Automovil(){}
	public Automovil(String Modelo1,String color1,int NumPasajeros1, String Marca1, int Year1){
		Modelo=Modelo1;
		color=color1;
		NumPasajeros=NumPasajeros1;
		Marca=Marca1;
		Year=Year1;
		num++;
	}
	
	public Automovil AsignarDatos(){
	//creamos un objeto de lectura que se llama leer
		Scanner leer= new Scanner(System.in);
		System.out.print("Introduzca Modelo");
		Modelo=leer.nextLine();
		System.out.print("Introduzca color");
		color=leer.nextLine();
		System.out.print("Introduzca Marca");
		Marca=leer.nextLine();
		System.out.print("Introduzca numero de pasajeros");
		NumPasajeros= leer.nextInt();
		System.out.print("Introduzca year");
		Year=leer.nextInt();
		
		//creamos el objeto con el metodo constructor
		Automovil coche= new Automovil(Modelo,color,NumPasajeros,Marca,Year);
		
		return coche;
	}
	
	public void MostrarDatos(){
		System.out.println("Modelo:"+ Modelo);
		System.out.println("Color:"+ color);
		System.out.println("Marca:"+ Marca);
		System.out.println("Numero de Pasajeros:"+ NumPasajeros);
		System.out.println("Year:"+ Year);
	}
}//fin de clase
