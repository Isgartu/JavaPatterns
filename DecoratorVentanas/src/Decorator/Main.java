package Decorator;

public class Main {

	public static void main(String[] args) {
		
		IVentana ventana1 = new Ventana();
		ventana1.dibujar(50, 70);
		
		System.out.println("-------");
		
		//Dibujar una ventana que tenga la barra de desplazamiento vertical
		IVentana ventana2 = new DecoradorDesplazamientoVert(new Ventana());
		ventana2.dibujar(300, 200);
		
		System.out.println("-------");
		
		//Dibujar una ventana que tenga la bara de desplazamiento horizontal
		IVentana ventana3 = new DecoradorDesplazamientoHoriz(new Ventana());
		ventana3.dibujar(400, 300);
		
		System.out.println("-------");
		
		//Dibujar una ventana que tenga las barras de desplazamiento horizontal y vertical
		IVentana ventana4 = new DecoradorDesplazamientoVert(new DecoradorDesplazamientoHoriz(new Ventana()));
		ventana4.dibujar(100, 120);

	}

}
