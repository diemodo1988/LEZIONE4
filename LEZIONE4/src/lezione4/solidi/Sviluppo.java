package lezione4.solidi;

public class Sviluppo {

	public static void main(String[] args) {

		Cilindro coniglio = new Cilindro(2.0, 4.0);

		System.out.println(coniglio.areadibase());
		System.out.println(2.0 * Math.PI);
		System.out.println(coniglio.calcolavolume());
	}

}
