package Controladores;

import java.util.Scanner;
import Servicios.MenuI;
import Servicios.MenuC;
import Servicios.CalculoC;
import Servicios.CalculoI;


public class Inicio {
/*
 * metodo principal
 */
	public static void main(String[] args) {
		int seleccionada;
		boolean cerrarMenu = false;
		Scanner comunicacionTeclado = new Scanner(System.in);
		MenuI mI = new MenuC();
		CalculoI cI = new CalculoC();
		while(!cerrarMenu) {
			seleccionada = mI.mostrarMenu(comunicacionTeclado);
					
			switch(seleccionada){
			case 0:
				System.out.println("[Info ] - se cierra la aplicacion 0");
				cerrarMenu = true;
				break;
			case 1:
				cI.igualar();
				break;
			case 2:
				cI.desigualar();
				break;
				default:
					System.out.println("[Info ] -se ejecuta caso 0");
					break;
					}
		

	}

}
}
