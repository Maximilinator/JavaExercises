package calculations.exercise10;

public class Rechnungsposition {
	private final double MWST = 1.19;

	public final double preis;
	public final int anzahl;
	public final String bezeichnung;

	Rechnungsposition(String bezeichnung, double p, int a) {
		this.bezeichnung = bezeichnung;
		preis = p;
		anzahl = a;
	}

	public String toString() {
		return bezeichnung + ": " + positionsBruttowert();
	}

	public double positionsNettowert() {
		return preis * anzahl;
	}

	public double positionsBruttowert() {
		return positionsNettowert() * MWST;
	}

}
