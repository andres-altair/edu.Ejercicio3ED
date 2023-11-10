package Servicios;

import java.util.Scanner;

public class MenuC implements MenuI {

	@Override
	public int mostrarMenu(Scanner comunicacionTecladoM) {
		
		System.out.println("0 cerrar");
		System.out.println("1 igualar");
		System.out.println("2 desigualar");
		int seleccionado = comunicacionTecladoM.nextInt();

		return seleccionado;
	}

}
