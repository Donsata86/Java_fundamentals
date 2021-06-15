package Pitagoras;

public class Pitagoras {
	
	double catetoA;
	double catetoB;
	
	public double calcularHipotenusa(double catetoA, double catetoB) {			

		double hipotenusa = 0;

		hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

		return hipotenusa;

 }
}