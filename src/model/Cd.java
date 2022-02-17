package model;

public class Cd {
	private int cdId;
	private String titel;
	private double preis;
	private String beschreibung;
	private String datum;
	private boolean special;
	
	
	
	
	public Cd(int cdId, String titel, double preis, String beschreibung) {
		this.setCdId(cdId);
		this.setTitel(titel);
		this.setPreis(preis);
		this.setBeschreibung(beschreibung);
	}
	
	@Override
	public String toString() {
		return "Cd[cdId=" + cdId+", titel=" + titel + ", bezeichnung=" + beschreibung + ", preis=" + preis +"]";
	}
	
	public int getCdId() {
		return cdId;
	}
	public void setCdId(int cdId) {
		this.cdId = cdId;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
}
