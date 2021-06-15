package StringManipulator;

public class StringManipulatortesting {
	
	
   public static void main(String[] args){

    StringManipulator manipulator = new StringManipulator();
   
//  Ejercicio1
    
    String str = manipulator.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str); // HelloWorld 
    
//  Ejercicio2
 
    char letra = 'n';
    Integer a = manipulator.getIndexOrNull("Coding", letra);
    Integer b = manipulator.getIndexOrNull("Hola Mundo", letra);
    Integer c = manipulator.getIndexOrNull("Saludar", letra);
    System.out.println(a); // 4
    System.out.println(b); // 7
    System.out.println(c); // -1
   
//  Ejercicio3    
    
    String word = "Hola";
    String subString = "la";
    String notSubString = "mundo";
    Integer d = manipulator.getIndexOrNull(word, subString);
    Integer e = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(d); // 2
    System.out.println(e); // -1
   
   
// Ejercicio4
   
   String newWord = manipulator.concatSubstring("Hola", 1, 3, "mundo");
   System.out.println(newWord); // olmundo
   
   }   
}