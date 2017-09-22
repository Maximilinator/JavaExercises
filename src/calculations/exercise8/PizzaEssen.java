package calculations.exercise8;

public class PizzaEssen {

	public final int anzahlPersonen;
	public final int anzahlPizzen;

	@Override
	public String toString() {
		return this.getClass().getName() + ": anzahlPizzen = " + this.anzahlPizzen + "; anzahlPersonen = " + this.anzahlPersonen;
	}

	public PizzaEssen(int anzahlPersonen, int anzahlPizzen) {
		this.anzahlPersonen = anzahlPersonen;
		this.anzahlPizzen = anzahlPizzen;
	}

	public int stueckePizzaGesamt() {
		return anzahlPizzen * 8;
	}

	public int stueckePizzaProPerson() {
		return stueckePizzaGesamt() / anzahlPersonen;
	}

	public int rest() {
		return stueckePizzaGesamt() - (stueckePizzaProPerson() * anzahlPersonen);
	}

}
