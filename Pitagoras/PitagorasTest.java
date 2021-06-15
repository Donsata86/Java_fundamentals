package Pitagoras;

public class PitagorasTest {

	public static void main(String[] args) {
		
		Pitagoras t1 = new Pitagoras();		

		t1.catetoA = 3;
		t1.catetoB = 4;

		System.out.println(t1.calcularHipotenusa(t1.catetoA, t1.catetoB));	
	}

}