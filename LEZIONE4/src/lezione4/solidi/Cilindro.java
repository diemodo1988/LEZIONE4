package lezione4.solidi;

public class Cilindro extends Solido {

	private double raggio;
	private double altezza;

	public Cilindro(double raggio, double altezza) {
		super();
		setRaggio(raggio);
		setAltezza(altezza);
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double areadibase() { // Cilindro cilindro
		double area = this.getRaggio() * this.getRaggio() * Math.PI; //
		return area;

	}

	public double calcolavolume() {
		double volume = this.areadibase() * this.getAltezza();
		return volume;
	}

	public double superficie() {
		double c = 0;
		return c;
	}
	
	public String toString(){
	    return "raggio  " + raggio +" altezza  " + altezza;	
	}

}
