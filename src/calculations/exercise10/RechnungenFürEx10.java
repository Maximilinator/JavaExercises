package calculations.exercise10;

public abstract class RechnungenFürEx10 {

	private double preis = 0;
	private int anzahl = 0;

	public void setEingabeArtikel(double preis) {
		this.preis = preis;
	}

	public void setEingabeAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public double summe() {
		return preis * anzahl;
	}

	public double summeMitSteuern() {
		return summe() * 1.19;
	}
}
