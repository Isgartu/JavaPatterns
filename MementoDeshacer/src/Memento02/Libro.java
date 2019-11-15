package Memento02;

public class Libro {

	private int pagina_actual;

	public void irPagina(int pagina) {
		this.pagina_actual = pagina;
		System.out.println("Agregado marcador en página [" + this.pagina_actual + "]");
	}

	public Memento guardarMarcador() {
		System.out.println("Marcador guardado");
		return new Memento(this.pagina_actual);
	}

	public void recuperarPagina(Memento m) {
		this.pagina_actual = m.getMarcadorPagina();
		System.out.println("Volvemos a la página: " + pagina_actual);
	}

}
