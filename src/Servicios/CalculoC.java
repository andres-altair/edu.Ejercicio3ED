package Servicios;

import java.util.Scanner;

public class CalculoC implements CalculoI {
	@Override
	public String pedir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("escribe un string");
		String a = scan.next();		
		return a;
	}

	@Override
	public void igualar() {
		String a = pedir();
		String b = pedir();		
		if(a.equals(b)){
			System.out.println(" true");
		}
		else{System.out.println("falsel");}
	}

	@Override
	public void desigualar() {
		String a = pedir();
		String b = pedir();		
		if(!a.equals(b)){
			System.out.println(" true");
		}
		else{System.out.println("false");}		
	}

	

}
