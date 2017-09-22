package inputProcessingAndOutput.exercise6;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class RechnungenFürEx6 {

	private int alter = 0;
	private int abWannRente = 0;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

	@Override
	public String toString() {
		return "Sie sind aktuell " + alter + " Jahre alt, wollen mit " + abWannRente
				+ " Jahren in Rente gehen. Folglich des aktuellen Jahres " + sdf.format(new Date()) + " haben sie noch "
				+ wieVieleJahreNoch() + " Jahre durchzustehen, bevor sie im Jahr " + abDannRente()
				+ " freudig in Rente gehen können!";
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public void setAbWannRente(int abWannRente) {
		this.abWannRente = abWannRente;
	}

	public int wieVieleJahreNoch() {
		return abWannRente - alter;
	}

	public int abDannRente() {
		return Integer.parseInt(sdf.format(new Date())) + wieVieleJahreNoch();
	}

}
