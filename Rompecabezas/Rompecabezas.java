package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Rompecabezas {
	//Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los n�meros en el arreglo. 
	//El m�todo tambi�n debe retornar un arreglo que incluya solo los n�meros que son mayores a 10 
	//(Por ejemplo cuando env�a el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).
			
	public void MayoresQue10() {
		
		int [] arreglo = {3,5,1,2,7,9,8,13,25,32};
		 int suma=0;
		 
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();	
		 
		 for (int i=0; i<arreglo.length; i++){
			
			 suma+= arreglo[i];
			 if (arreglo[i] > 10) {
				  
				 nuevo.add(arreglo[i]);
				 }
		 }
		 System.out.println(suma);
		 System.out.println(nuevo);
	}
	
//	Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
//	mezcle el arreglo e imprima el nombre de cada persona. Haga que el m�todo tambi�n devuelva un arreglo
//	con los nombres que tienes m�s de 5 caracteres.
	
	public void nombresLargos() {
		
		String [] nombres = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		ArrayList<String> nuevo = new ArrayList<String>();	
		 		 
		 for (int i=0; i<nombres.length; i++){
			 System.out.println(nombres[i]);
			 if(nombres[i].length()> 5) {
				 nuevo.add(nombres[i]);
			 }
		 }
			 System.out.println(nuevo);
	}
//Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). 
//Mezcle el arreglo y, despu�s de mezclarlo, imprima la �ltima letra del arreglo. 
//Tambi�n debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
//Para mezclar una colecci�n, puede utilizar el m�todo shuffle de la clase Collections. Documentaci�n de la Clase Collections.

	public void abecedario() {
		
		String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
		ArrayList<String> nuevo = new ArrayList<String>();	
		
		
		 for (int i=0; i<letras.length; i++){
			nuevo.add(letras[i]);
			Collections.shuffle(nuevo);
			
		}
			 System.out.println("la mezcla del arreglo es la siguiente:"+ nuevo);
			 System.out.println("la ultima letra del arreglo es: "+nuevo.get(25));
			 System.out.println("la primera letra del arreglo es: "+nuevo.get(0));
			 
			 if(nuevo.get(0)== "a" ||nuevo.get(0)== "e" ||nuevo.get(0)== "i"||nuevo.get(0)== "o"||nuevo.get(0)== "u"){
				 System.out.println("la primera letra es una vocal");
			 }
	}

//	Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100.
//	Para obtener un n�mero entero aleatorio, puede utilizar el m�todo nextInt de la clase Random. Documentaci�n de la Clase Random.

	public ArrayList<Integer>  numerosAleatorios() {
					        
	        ArrayList<Integer> aleatorios = new ArrayList<Integer>();
	        for(int i = 0; i < 10; i++){
	            int num = ThreadLocalRandom.current().nextInt(55, 100);
	            aleatorios.add(num);
	        }
	        System.out.println(aleatorios);
	        return aleatorios;
	}
	
//	Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100 y hacer que est�n ordenados 
//	(mostrar el n�mero m�s peque�o en el principio del arreglo). Imprimir todos los n�meros del arreglo. Luego, 
//	Imprimir el valor m�nimo del arreglo, as� como el valor m�ximo.
//	Para ordenar una colecci�n, puede utilizar el m�todo sort de la clase Collections.


	

	
}
