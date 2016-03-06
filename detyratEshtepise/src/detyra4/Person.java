package detyra4;

public class Person {

	private String emri;
	private String mbiemri;
	private int vitiLindjes;

	int viti = 2016;

	public Person(String emri, String mbiemri, int vitiLindjes) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.vitiLindjes = vitiLindjes;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

	public int getVitiLindjes() {
		return vitiLindjes;
	}

	public void setVitiLindjes(int vitiLindjes) {
		this.vitiLindjes = vitiLindjes;
	}

	public int llogaritMoshen() {
		int mosha = viti - this.vitiLindjes;
		return mosha;
	}

}
