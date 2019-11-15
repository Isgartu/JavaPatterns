package Visitor02;

public class Guerrero implements IPersonaje {

	private String arma = "";

	public Guerrero() {

	}

	public String getArma() {
		return this.arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	@Override
	public void accept(IVisitor visitor) {
		if (visitor.getClass().equals(EquiparArma.class)) {
			visitor.visit(this);
		}
	}
}
