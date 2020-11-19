package lezione4.solidi;

public class Parallelepipedo extends Solido {

	private double lato1;
	private double lato2;
	private double lato3;
	private double lato4;
	private double altezza;

	public Parallelepipedo(double lato1, double lato2, double lato3, double lato4, double altezza) {
		super();
		setLato1(lato1);
		setLato2(lato2);
		setLato3(lato3);
		setLato4(lato4);
	}

	public double getLato1() {
		return lato1;
	}

	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}

	public double getLato2() {
		return lato2;
	}

	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}

	public double getLato3() {
		return lato3;
	}

	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}

	public double getLato4() {
		return lato4;
	}

	public void setLato4(double lato4) {
		this.lato4 = lato4;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double areadibase() {
		double area = this.getLato1() * this.getLato2(); //
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

}
