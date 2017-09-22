package calculations.exercise8;

public abstract class RechnungenFürEx8 {

	private int anzahlPersonen = 0;
	private int anzahlPizzen = 0;

	@Override
	public String toString() {
		return anzahlPizzen + " Pizzen für " + anzahlPersonen + " Personen. Von " + stueckePizzaGesamt()
				+ " Stücken Pizza bekommt jeder " + stueckePizzaProPerson() + "Stück. Rest: " + rest();
	}

	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}

	public void setAnzahlPizzen(int anzahlPizzen) {
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
