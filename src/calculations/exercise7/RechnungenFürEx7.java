package calculations.exercise7;

public abstract class RechnungenF¸rEx7 {

	private double roomLength = 0;
	private double roomWidth = 0;

	@Override
	public String toString() {
		return "Der eingetragene Raum ist " + roomLength + " Fuﬂ mal " + roomWidth + " Fuﬂ groﬂ. Damit ist der Bereich " + flaecheninhaltFeet() + " Fuﬂ^2 groﬂ. Umgerechnet in Meter sind das " + flaecheninhaltMeter() + " m^2.";
	}

	public void setRoomLength(double roomLength) {
		this.roomLength = roomLength;
	}

	public void setRoomWidth(double roomWidth) {
		this.roomWidth = roomWidth;
	}

	public double flaecheninhaltFeet() {
		return roomLength * roomWidth;
	}

	public double flaecheninhaltMeter() {
		return (roomLength * roomWidth) * 0.09290304;
	}
}
