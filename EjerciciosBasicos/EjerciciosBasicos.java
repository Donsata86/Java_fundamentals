package EjerciciosBasicos;
import java.util.ArrayList;

public class EjerciciosBasicos {
	//Imprimir 1 - 255	Imprimir 1 - 255
	//Escriba un método que imprima todos los número del 1 al 255.	Escriba un método que imprima todos los número del 1 al 255.
	
	public void imprimirNumero1_255() {
	
		for (int i = 1; i <=255 ; i++){
			   
			System.out.println(i);
		}
	}
	//Imprimir los Números Impares Entre 1 - 255	Imprimir los Números Impares Entre 1 - 255
	//Escriba un método que imprima todos los número impares entre el 1 al 255.	Escriba un método que imprima todos los número impares entre el 1 al 255.
	
	public void imprimirImpares1_255() {
		
		for (int i = 0; i <=255 ; i++){
			if ( i%2 != 0) {
			System.out.println(i);
			}
		}
	}
	
	//Imprimir la Suma	Imprimir la Suma
	//Escriba un método que imprima los números desde el 0 hasta el 255, pero esta vez muestre también las suma de los números que ha mostrado en pantalla hasta ahora. Por ejemplo, su salida debe ser algo como esto:	Escriba un método que imprima los números desde el 0 hasta el 255, pero esta vez muestre también las suma de los números que ha mostrado en pantalla hasta ahora. Por ejemplo, su salida debe ser algo como esto:

	public void imprimirSuma1_255() {
		
		for (int i = 0; i <=255 ; i++){
			int suma=0;			
			suma=suma+i;
			
			System.out.println("nuevo numero: "+ i   +" "+ "suma: " + suma );

			}
		}
	//Recorrer un Arreglo
	//Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra cada uno de los elementos del arreglo e imprima cada valor. Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.	Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra cada uno de los elementos del arreglo e imprima cada valor. Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.
	
	public void recorrerArreglo() {
		
	int [] arrEnteros =  {1,3,5,7,9,13};
	
		for (int i = 0; i<arrEnteros.length ; i++){
			
			System.out.println(arrEnteros[i]);

		}
	}	

	//Encontrar el Máximo	Encontrar el Máximo
	//Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo. Su método debería funcionar también con todos los números en negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos, números negativos y cero.	Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo. Su método debería funcionar también con todos los números en negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos, números negativos y cero.
	
	public void numeroMaximo() {
			
		
		
		int [] miArray =  {-4,-1,-2,-5};
		
		int maximo=miArray[0];
		
		for (int i = 0; i < miArray.length; i++){
			
			if (miArray[i] > maximo) {
				
				maximo =  miArray[i]; 
			}
			
		}
		System.out.println(maximo);
	}
	
	//Obtener el Promedio	Obtener el Promedio
	//Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. 
	//Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir “Promedio de 5”. Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, luego pruebe sus instrucciones con casos más complicados.	Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir “Promedio de 5”. Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver ese caso primero, luego pruebe sus instrucciones con casos más complicados.
	
	public void imprimePromedio() {
			
		int [] myArray= {11,13,3,5,7};
		int suma= 0;
		int contador=0;
		
		for (int i = 0; i < myArray.length; i++){
			
			suma += myArray[i];
			contador += i; 
	
			}
		double promedio= suma/contador;
		System.out.println(promedio);
	}
	
	//Arreglo con Números Impares	Arreglo con Números Impares
	//Escribir un método que cree un arreglo ‘y’ que contenga todos los números impares entre 1 - 255. Cuando el método haya terminado, ‘y’ debe tener los valores de [1,3,5,7…255].	Escribir un método que cree un arreglo ‘y’ que contenga todos los números impares entre 1 - 255. Cuando el método haya terminado, ‘y’ debe tener los valores de [1,3,5,7…255].

	
	public ArrayList<Integer> impares1_255() {
	
		ArrayList<Integer> array = new ArrayList<Integer>();
							
		for (int i = 0; i <= 255; i++){
			if ( i % 2 != 0 ) {
				array.add(i);
			}
			
		}
		return array;
	}
	//Mayor que Y
	//Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar el proceso el método debe Imprimir el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).	Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar el proceso el método debe Imprimir el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).
	

	public void cuentamaMayores() {
		
		 int [] arreglo = {1,3,5,7};
		 int Y = 3;
		 int contador = 0;
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();
			   for (int i=0; i<arreglo.length; i++){
			     if (arreglo[i] > Y){	
			    	
			         nuevo.add(i);  	 
			    	 
			     } 
			     contador = nuevo.size();
			    
			   }	
			   System.out.println("los valores mayores que 'Y' son: "+contador);
	}

	
	//Valores al Cuadrado
	//Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor en el arreglo por sí mismo. Cuando el método haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].	Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor en el arreglo por sí mismo. Cuando el método haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].
	
	public void cuadradosDelArreglo() {
		
		 int [] arreglo = {1,5,10,-2};
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();
		 
		   for (int i=0; i<arreglo.length; i++){
			    
				   nuevo.add(arreglo[i]*arreglo[i]);
			   }
						    		
			   System.out.println(nuevo);
			   System.out.println(arreglo);
	}
	
	//Eliminar Números Negativos	
	//Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0. Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].	Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0. Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
	
	public void reemplazaNegativos() {
		 	
		 int [] arreglo = {1,5,10,-2};

		 ArrayList<Integer> nuevo = new ArrayList<Integer>();	
		 
		 for (int i=0; i<arreglo.length; i++){
			 
			 if (arreglo[i]<0) {
				 nuevo.add(0); 		 
			   }else {nuevo.add(arreglo[i]);
				   }
		   }
		   System.out.println(nuevo);
	}
			
	//Mínimo, Máximo y Promedio
	//Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, el número mínimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].	Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, el número mínimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].
	
	public void MaximoMinimoPromedio() {
	 	
		 int [] arreglo = {1,5,10,-2};

		 ArrayList<Integer> nuevo = new ArrayList<Integer>();	
		 
		 int maximo=0;
		 int minimo=0;
		 int suma=0;
		 int contador=0;
		 
		 for (int i=0; i<arreglo.length; i++){
			 
			 if (arreglo[i] < minimo) {
	             minimo = arreglo[i];
	            
	         }
	         else if (arreglo[i] > maximo) {
	             maximo = arreglo[i];
	         }
				suma+= arreglo[i];
			 contador += i;
			
		 }
		 nuevo.add(maximo);
		 nuevo.add(minimo);
		 nuevo.add(suma/contador);
		 System.out.println(nuevo);
	}
}









